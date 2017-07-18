/*
 * Copyright (C) 2017 latavares - 17/07/2017
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */





package exercicio.semana1;





public class Paciente {

    double peso, altura;





    /**
     * 
     * @param _peso
     *            do paciente, passado em double (ex: 87.4).
     * @param _altura
     *            do paciente, passado em double (ex: 178.2).
     */
    Paciente(double _peso, double _altura) {

        this.peso = _peso;
        this.altura = _altura;
    }





    /**
     * 
     * @return calculo do IMC (imc = peso / (altura * altura))
     */
    double calculoIMC() {

        return (this.peso / (Math.pow(this.altura, 2)));
    }





    /**
     * 
     * @return mensagem correspondente a situação do paciente
     *         de acordo com o peso e altura indicada
     */
    String diagnostico() {

        String mensagem;
        double imc = calculoIMC();

        if (imc < 16) {
            mensagem = "Baixo peso muito grave";
        } else if (imc > 16 && imc <= 16.99) {
            mensagem = "Baixo peso grave";

        } else if (imc > 17 && imc <= 18.49) {
            mensagem = "Baixo peso";

        } else if (imc > 18.50 && imc <= 24.99) {
            mensagem = "Peso normal";

        } else if (imc > 25 && imc <= 29.99) {
            mensagem = "Sobrepeso";

        } else if (imc > 30 && imc <= 34.99) {
            mensagem = "Obesidade grau I";

        } else if (imc > 35 && imc <= 39.99) {
            mensagem = "Obesidade grau II";

        } else if (imc >= 40) {
            mensagem = "Obesidade grau III (obesidade morbida)";

        } else {
            mensagem = "N�o foi possivel calcular";
        }
        return mensagem;
    }





    /**
     * Imprime o diagnostico do paciente, em que
     * faz começar a operação em cadeia das colaborações/comunicações.
     */
    void imprimir() {

        System.out.println("IMC: " + Math.floor(calculoIMC()) + "\n" + diagnostico() + "\n");
    }

}
