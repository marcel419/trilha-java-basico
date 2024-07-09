package aparelho.aparelhotelefonico;

public abstract class TelefoneAbst implements TelefoneInterface {

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo a ligação.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }
}
