package entidades;

public class Empregado {
	public String nome;
	public double SalarioBruto,TaxaDeImposto,SalarioAtualizado,AumentoSalario;
	public double SalarioLiquido() {
		return SalarioBruto-TaxaDeImposto; 
	}
	public void AumentoDeSalario(double porcentagem) {
		AumentoSalario = SalarioBruto*(porcentagem/100);
		SalarioAtualizado = AumentoSalario + SalarioLiquido();
	}
	
	
	
}
