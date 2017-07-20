




package escola;





public class Principal {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Aluno guerra = new Aluno();
        guerra.bim_1 = 70;
        guerra.bim_2 = 60;
        guerra.bim_3 = 80;
        guerra.bim_4 = 70;

        System.out.println(guerra.media());
        System.out.println(guerra.passouDeAno(guerra));

    }

}
