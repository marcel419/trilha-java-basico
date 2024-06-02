import java.util.Scanner;

//import entidades.ContaUsuario;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
         Scanner scan = new Scanner(System.in);
        //ContaUsuario contaUsuario = new ContaUsuario();
    
        //contaUsuario.getAgencia();
       
    
        
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência !" );
        String agencia = scan.nextLine();

        System.out.println("Digite o numero da conta: ");
        int conta = scan.nextInt();

        System.out.println("valor a ser depositado: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
 
}
