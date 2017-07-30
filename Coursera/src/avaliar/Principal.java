
package avaliar;

public class Principal {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Paciente p1 = new Paciente(100, 1.84);
	Paciente p2 = new Paciente(56.9, 1.76);
	Paciente p3 = new Paciente(105.4, 1.67);

	p1.calcularIMC();
	p2.calcularIMC();
	p3.calcularIMC();

	System.out.println("IMC = " + p1.calcularIMC());
	System.out.println(p1.diagnostico() + "\n");
	System.out.println("IMC = " + p2.calcularIMC());
	System.out.println(p2.diagnostico() + "\n");
	System.out.println("IMC = " + p3.calcularIMC());
	System.out.println(p3.diagnostico());

    }

}
