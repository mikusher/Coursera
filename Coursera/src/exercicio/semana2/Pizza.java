




package exercicio.semana2;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;





public class Pizza {

    static Map<String, Integer> listaIngredientes = new HashMap<String, Integer>();
    static ArrayList<String>    ingrediente       = new ArrayList<String>();
    static int                  valorContador     = 1;
    static int                  totalIngrediente  = 0;
    double                      preco;





    public void adicionaIngredente(String ingrediente) {

        this.ingrediente.add(ingrediente);
        contabilizaIngrediente(ingrediente);

    }





    static void contabilizaIngrediente(String ingrediente) {

        listaIngredientes.put(ingrediente, valorContador++);

    }





    public double getPreco() {

        if (ingrediente.size() <= 2) {
            preco = 15;
        } else if (ingrediente.size() >= 3 && ingrediente.size() <= 5) {
            preco = 20;
        } else {
            preco = 23;
        }
        return preco;
    }





    /**
     * Dados para o carrinho
     */
    public ArrayList<String> obterIngrediente() {

        return ingrediente;
    }





    public static Map<String, Integer> obterListaIngredientes() {

        Set s = listaIngredientes.entrySet();
        Iterator it = s.iterator();

        if (it.hasNext()) {
            Map.Entry m = (Map.Entry) it.next();
            return listaIngredientes;
        }
        return listaIngredientes;
    }
}
