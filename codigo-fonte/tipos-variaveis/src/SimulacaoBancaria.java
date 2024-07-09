import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("escolha a opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double saldoAtual = scanner.nextDouble();
                    saldo += saldoAtual;
                    System.out.println("Saldo atual: " + saldo);

                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.

                     double valorSacado = scanner.nextDouble();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo);

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
