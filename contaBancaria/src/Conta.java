public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    
}
