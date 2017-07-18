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





package comercio;





import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class TesteCompra {

    @Test
    public void compraAVista() {

        Compra c = new Compra(500);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(500, c.getValorTotal());
        assertEquals(500, c.getValorParcela());

    }





    @Test
    public void compraParcelado() {

        Compra c = new Compra(4, 250);
        assertEquals(4, c.getNumeroParcelas());
        assertEquals(1000, c.getValorTotal());
        assertEquals(250, c.getValorParcela());

    }

}
