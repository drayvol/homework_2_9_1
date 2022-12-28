package ProductsAndRecipes;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("банан", 200, 3);
        Product apple = new Product("яблоко", 100, 0);
        Product tomato = new Product("помидоры", 80, 1);
        Product cucumber = new Product("огурец", 50, -5);

        Recipe olivie = new Recipe("Оливье");
        olivie.add(banana, apple, tomato, cucumber);
        System.out.println(olivie);

        Recipe salat = new Recipe("Салат");
        salat.add(apple);
        System.out.println(salat);
        RecipesList recipes = new RecipesList();
        salat.checkProduct(tomato);
        recipes.add(olivie, salat);
        System.out.println(recipes);


            
        }
    }
