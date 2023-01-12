package entidades;

public class ContaBanco {

	private int numConta;
	private String nomeTitular;
	private double saldo = 0;

	public ContaBanco(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public ContaBanco(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo = saldo + valor;
	}

	public void retirada(double valor) {
		this.saldo = saldo - (valor + 5.0);
	}

}
