package ProductsAndRecipes;

import java.util.HashSet;
import java.util.Set;

public class ProductList{
    private Set<Product> products = new HashSet<>();
    public void add(Product...productsToAdd){
        for (Product product:productsToAdd) {
            if(products.contains(product)) throw new RuntimeException("Такой продукт уже есть");
            products.add(product);
        }
    }
    public void remove(Product product){
        products.remove(product);
    }
    public void alreadyBought(Product product){
        System.out.println("Продукт "+product.getName() +" куплен");
        remove(product);
    }
    public Integer getSum(ProductList productList){
        int sum=0;
        for (Product product: products) {
            sum+=product.getPrice();
        }
        return sum;
    }
}