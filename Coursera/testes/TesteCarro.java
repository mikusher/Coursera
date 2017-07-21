import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class TesteCarro {

    @Test
    public void testeCarroParado() {

        Carro c = new Carro();
        assertEquals(0, c.getVelocidade());
    }





    @Test
    public void testeAcelerar() {

        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }





    @Test
    public void testeFreio() {

        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

}
