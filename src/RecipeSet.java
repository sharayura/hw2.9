import java.util.HashSet;
import java.util.Set;

public class RecipeSet {
    private Set<Recipe> recipeSet = new HashSet<>();

    public void addToRecipeSet(Recipe recipe) {
        for (Recipe current : recipeSet) {
            if (current.getName().equals(recipe.getName())) {
                throw new RuntimeException("Рецепт уже есть в списке!");
            }
        }
        recipeSet.add(recipe);
    }
}
