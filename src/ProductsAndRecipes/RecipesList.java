package ProductsAndRecipes;

import java.util.HashSet;
import java.util.Set;

public class RecipesList {
    private Set<Recipe> recipes = new HashSet<>();

    public void add(Recipe...recipesToAdd){
        for (Recipe recipe:recipesToAdd) {
            if(recipes.contains(recipe)) throw new RuntimeException("Такой рецепт уже есть");
            recipes.add(recipe);
        }
    }
    public void remove(Recipe recipe){

        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Рецепты в книге:\n" + recipes.toString().replace("[", "").replace("]","");
    }
}

