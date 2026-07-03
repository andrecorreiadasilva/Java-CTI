package demoeventoacademico; // oi debora!! (〜￣▽￣)〜
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DemoEventoAcademico {
    public static void main(String[] args) throws ParseException {
        EventoAcademico MaratonaDeProgramacao;
        EventoAcademico SemanaDeCurso;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = sdf.parse("20/07/2017"); 
        Date data2 = sdf.parse("18/01/2017"); 
        
        MaratonaDeProgramacao = new EventoAcademico("Maratona de Programação", "Faculdade Anhanguera de Bauru", data1, data2, 48);
        SemanaDeCurso = new EventoAcademico ("Semana de Curso da Ciência da Computação", "Faculdade Anhanguera de Bauru", data1, data2, 200);
        
        System.out.println(MaratonaDeProgramacao);
        System.out.println(SemanaDeCurso);
    } 
}
