
package avaliar;

public class Paciente {

    // Atributos do pacinete
    double peso;
    double altura;
    double IMC;

    // Construtor
    public Paciente(double peso, double altura) {

	this.peso = peso;
	this.altura = altura;
    }

    // Metodo de calcular o IMC
    double calcularIMC() {

	IMC = peso / (altura * altura);
	return IMC;
    }

    // Metodo do Diagnostico
    String diagnostico() {

	if (IMC < 16) {
	    return ("Baixo peso muito grave");

	} else if (IMC >= 16 && IMC < 17) {
	    return ("Baixo peso grave");

	} else if (IMC >= 17 && IMC < 18.5) {
	    return ("Baixo peso");

	} else if (IMC >= 18.5 && IMC < 25) {
	    return ("Peso normal");

	} else if (IMC >= 25 && IMC < 30) {
	    return ("Sobrepeso");

	} else if (IMC > 30 && IMC < 35) {
	    return ("Obesidade grau I");

	} else if (IMC >= 35 && IMC < 40) {
	    return ("Obesidade grau II");

	} else if (IMC >= 40) {
	    return ("Obesidade grau III (obesidade morbida)");

	}
	return "Obesidade grau III (obesidade morbida)";
    }
}