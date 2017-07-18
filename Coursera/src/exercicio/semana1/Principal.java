/*
 * Copyright (C) 2017 latavares - 18/07/2017
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





public class Principal {

    public static void main(String[] args) {

        Paciente p1 = new Paciente(150.50, 1.85);
        p1.imprimir();

        Paciente p2 = new Paciente(90.7, 1.76);
        p2.imprimir();

        Paciente p3 = new Paciente(62.3, 1.67);
        p3.imprimir();

    }

}
