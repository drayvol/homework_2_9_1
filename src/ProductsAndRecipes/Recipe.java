package ProductsAndRecipes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {
    private final String name;
    private final HashMap<Product,Integer> products = new HashMap<>();
    public Recipe(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void add(Product...productsToAdd){
        for (Product product:productsToAdd) {
            if(products.containsKey(product)) throw new RuntimeException("Такой продукт уже есть");
            else products.put(product,product.getAmount());
        }
    }
    public void remove(Product product){
        products.remove(product);
    }
    public Integer getTotalSum(){
        Integer sum = 0;
        for (Map.Entry<Product, Integer> product:products.entrySet()) {
            sum+=product.getKey().getPrice()*product.getValue();
        }
        return sum;
    }
    public void checkProduct(Product product){
        System.out.println(products.containsKey(product) ? product.getName()+ " уже куплен" : product.getName()+ " не куплен");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт " + name + " состоит из продукто: " + products.keySet().toString().replace("[", "").replace("]","") + " общая сумма рецепта " + getTotalSum() +"\n";
    }
}
