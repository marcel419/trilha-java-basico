import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Processo seletivo");

        Candidato candidato = new Candidato();
        
        candidato.imprimindoSelecionados();
        System.out.println();
        System.out.println();
        candidato.selecaoCandidatos();
        System.out.println();
        System.out.println("imprimindo candidatos selecionados!");
        candidato.candidatoSelecionados();
        
        

    }

}
