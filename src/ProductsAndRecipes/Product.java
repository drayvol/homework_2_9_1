package ProductsAndRecipes;

import Validate.Validate;

import java.util.Objects;
public class Product {
    private final String name;
    private final Integer price;
    private  Integer amount;
    public Product(String name,Integer price, Integer amount){
        this.name = Validate.validateString(name);
        this.price = Validate.validateInteger(price);
        if(amount == null || amount <=0) this.amount=1;
        else this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = Validate.validateInteger(amount);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
