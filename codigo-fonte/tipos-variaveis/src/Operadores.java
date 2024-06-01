import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametrô");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametrô");
        int parametroDois = terminal.nextInt();
        terminal.close();
        try {

            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("Erro: " + e.getMessage());
            
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            System.out.println(" o primeiro numero é maior que o segundo");
        }
        else{
            throw new ParametrosInvalidosException("O segundo parâmetro e maior que o primeiro.");

        }

        //int contagem = parametroDois - parametroUm;
        for(int i = parametroUm; i > parametroDois; i++){
            System.out.println(i);
        }
        
        
    }
}
