public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
            cc.depositar(100);

        Conta cp = new ContaPoupanca();

        cp.transferir(50, cp);
        
    }
}
