




package exercicio.semana2;





public class Principal {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();

        p1.adicionaIngredente("Calabresa");
        p1.adicionaIngredente("Bacon");

        p2.adicionaIngredente("Frango");
        p2.adicionaIngredente("Borda Recheada");
        p2.adicionaIngredente("Respingo de Solda");

        p3.adicionaIngredente("Cheddar");

        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarPizza(p1);
        c.adicionarPizza(p2);
        c.adicionarPizza(p3);

        System.out.println("Quantidade de Pizza: " + c.totalPizza());
        System.out.println("Valor Total: " + c.valorTotal());
        System.out.println("Ingredientes das Pizzas: \n" + Pizza.obterListaIngredientes());

    }

}
