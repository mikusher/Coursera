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

public class Principal {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.nome = "Corcel";
        c1.velocidade = 0;

        Carro c2 = new Carro();
        c2.potencia = 20;
        c2.nome = "Carango";
        c2.velocidade = 10;

        Carro c3 = new Carro(50);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();

        c2.acelerar();
        c2.acelerar();

        c1.imprimir();
        c2.imprimir();
        c3.nome = "vw";
        c3.imprimir();

    }

}
