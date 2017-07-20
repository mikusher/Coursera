




package escola;





public class Aluno {

    String nome;
    double bim_1;
    double bim_2;
    double bim_3;
    double bim_4;





    public int media() {

        int total = 0;
        total += this.bim_1;
        total += this.bim_2;
        total += this.bim_3;
        total += this.bim_4;

        return total / 4;
    }





    public boolean passouDeAno(Aluno al) {

        if (media() >= 60) {
            return true;
        }
        return false;
    }
}
