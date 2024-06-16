import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidato {

    //private String candidato = "Marcel";

    static void imprimindoSelecionados(){


        
        String [] candidatos = {"Marcel", "Neto", "May", "Alvinho", "Mãe", "William", "Mira", "Jr", "Pai", "Luciana"};
        System.out.println("Imprimindo lista de candidatos informando o indice");
        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("FOrma abreviada foreach!");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
    

    public static void selecaoCandidatos(){
        String [] candidatos = {"Marcel", "Neto", "May", "Alvinho", "Mãe", "William", "Mira", "Jr", "Pai", "Luciana"};
        
      
       
        int candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatoSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " Solicitou esse valor " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga!");
                candidatoSelecionados++;

            }
            candidatosAtual++;
        }

      
    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1900.0, 2900.0);
    }

    static void analisandoCandidato(double salarioPretendido) {

        // var candidato = "Marcel";
        var salarioBase = 2000.00;
        
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato: ");
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para o candidato com contra proposta!");
        } else {
            System.out.println("Aguardando os resultados dos demais candidatos!!!");
        }
    }

    

    public static boolean atender(){

        return new Random().nextInt(3)==1;
    }

    public static void entrarEmContato(String candidato){
        
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas<3);
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " tentativas");

        }else{
            System.out.println("Não conseguimos contato com " + candidato + " numero maximo de tentativas " + tentativasRealizadas + " realizadas");

        }
    }

    public static void candidatoSelecionados(){
        String [] candidatos = {"Marcel", "Neto", "May", "Alvinho", "Luciana"};

        for(String candidato : candidatos){
            entrarEmContato(candidato);
        }
    }
}