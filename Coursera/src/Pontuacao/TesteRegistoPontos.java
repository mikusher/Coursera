




package Pontuacao;





import static org.junit.Assert.assertEquals;

import org.junit.Test;





public class TesteRegistoPontos {

    @Test
    public void pontosCriarTopico() {

        Utilizador u = new Utilizador();
        u.nome = "Luis";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistoPontos rp = new RegistoPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontus, 5);
    }





    @Test
    public void pontosCriarTopicoVip() {

        Utilizador u = new Utilizador();
        u.nome = "Luis";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistoPontos rp = new RegistoPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontus, 25);
    }





    @Test
    public void pontosCriarTopicoBonusDoDia() {

        Utilizador u = new Utilizador();
        u.nome = "Luis";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistoPontos rp = new RegistoPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontus, 15);
    }





    @Test
    public void pontosCriarTopicoBonusDoDiaVip() {

        Utilizador u = new Utilizador();
        u.nome = "Luis";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistoPontos rp = new RegistoPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontus, 50);
    }

}
