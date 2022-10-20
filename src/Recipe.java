import java.util.*;

public class Recipe {
    private String name;
    private Map<Product, Integer> productMap = new HashMap<>();
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

    public void addToRecipe(String name, Integer price, Integer amount) {
        productMap.put(new Product(name, price), amount);
        recipePrice = 0;
        for (Map.Entry<Product, Integer> product : productMap.entrySet()) {
            recipePrice += product.getKey().getPrice() * product.getValue();
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
