




package Pontuacao;





public class RegistoPontos {

    private CalculadoraBonus bonus;





    public RegistoPontos(CalculadoraBonus cb) {

        bonus = cb;
    }





    public void fazerUmComentario(Utilizador u) {

        u.pontus += 3 * bonus.bonus(u);
    }





    public void criarUmTopico(Utilizador u) {

        u.pontus += 5 * bonus.bonus(u);
    }





    public void darUmLike(Utilizador u) {

        u.pontus += 1 * bonus.bonus(u);

    }

}
