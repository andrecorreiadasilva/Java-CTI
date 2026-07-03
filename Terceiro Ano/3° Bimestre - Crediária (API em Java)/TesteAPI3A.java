package testeapi3a;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class TesteAPI3A {

    
    
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CEP (sem hifen): ");
        String cep = scanner.nextLine();
        
        String apiURL = "https://viacep.com.br/ws/"+cep+"/json";
        
        HttpClient client = HttpClient.newHttpClient();
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiURL))
                .build();
            
        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if(response.statusCode() == 200) {
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(response.body());
                
                String logradouro = (String) jsonObject.get("logradouro");
                String bairro = (String) jsonObject.get("bairro");
                String localidade = (String) jsonObject.get("localidade");
                String uf = (String) jsonObject.get("uf");
                String ddd = (String) jsonObject.get("ddd");
                
                System.out.println("CEP: "+ cep);
                System.out.println("Logradouro: "+ logradouro);
                System.out.println("Bairro: "+ bairro);
                System.out.println("Localidade: "+ localidade +", "+ uf);
                System.out.println("DDD: "+ ddd);
                
            } else {
                System.out.println("Request failed: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
        } 
    }
}
