




package exercicio.semana2;





import java.util.ArrayList;





public class CarrinhoDeCompras {

    ArrayList<Pizza> pizza = new ArrayList<Pizza>();
    double           total = 0;





    void adicionarPizza(Pizza pz) {

        if (pz.obterIngrediente()
              .isEmpty()) {
            System.out.println("Tem de ter algum ingrediente");
        } else {
            pizza.add(pz);
        }
    }





    public int totalPizza() {

        return pizza.size();
    }





    public double valorTotal() {

        for (int i = 0; i < pizza.size(); i++) {
            total += pizza.get(i)
                          .getPreco();
        }
        return total;
    }

}
