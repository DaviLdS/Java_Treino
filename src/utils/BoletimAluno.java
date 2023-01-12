package utils;

public class BoletimAluno {
	public String aluno, resultado;
	public double nota1, nota2, nota3, notaf, pontosf;

	public double notaFinal() {
		return notaf = nota1 + nota2 + nota3;
	}

	public String resultado() {
		if (notaf >= 60.0 && notaf < 100.01) {
			resultado = "Aprovado";
		} else {
			pontosf = 60.0 - notaf;
			resultado = "Reprovado%nFaltas %.2f pontos";
		}
		return resultado;
	}

}
