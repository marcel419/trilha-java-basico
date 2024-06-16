import java.util.Scanner;

public class Contador {
//     1. Crie o projeto `DesafioControleFluxo`
// 2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
// 3. Dentro do projeto, crie a classe `ParametrosInvalidosException` 
//      que representará a exceção de negócio no sistema. 
   
public void Operador() throws ParametrosInvalidosException{
    Scanner terminal = new Scanner(System.in);

    System.out.println("digite o primeiro numero: ");
    int numeroUm = terminal.nextInt();
    System.out.println("digite o segundo numero: ");
    int numeroDois = terminal.nextInt();
    terminal.close();

    try {
        contar(numeroUm,numeroDois);
    } catch (ParametrosInvalidosException e) {
        // TODO: handle exception
   		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

        throw new ParametrosInvalidosException(e.getMessage());
    }

    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
		//realizar o for para imprimir os números com base na variável contagem

        int contagem = numeroDois - numeroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
