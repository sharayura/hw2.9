import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private String name;
    private Set<Product> productSet = new HashSet<>();
    private int recipePrice;

    public Recipe(String name) {
        this.name = name;
        recipePrice = 0;
    }

    public String getName() {
        return name;
    }

    public int getRecipePrice() {
        return recipePrice;
    }

    public void addToRecipe(Product product) {
        int size = productSet.size();
        productSet.add(product);
        if (productSet.size() > size) {
            recipePrice += product.getPrice() * product.getAmount();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
