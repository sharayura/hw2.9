import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ProductList productList = new ProductList();
        productList.addToList("банан", 120, 5);
        productList.addToList("клубника", 300, 1);
        productList.addToList("персик", 200, 2);

        productList.markBought("банан");
        productList.printAll();
        productList.deleteFromList("банан");
        productList.printAll();

        Recipe smoothie = new Recipe("Смузи");
        Recipe porridge = new Recipe("Каша");
        Recipe porridge1 = new Recipe("Каша1");

        Product banan = new Product("банан", 130, 2);
        Product kiwi = new Product("киви", 200, 1);
        Product apple = new Product("яблоко", 100, 1);

        smoothie.addToRecipe(banan);
        smoothie.addToRecipe(kiwi);
        smoothie.addToRecipe(apple);
        smoothie.addToRecipe(apple);

        System.out.println(smoothie.getRecipePrice());

        Product flakes = new Product("хлопья", 100, 2);
        Product apricots = new Product("курага", 800, 1);
        Product dates = new Product("финики", 600, 1);

        porridge.addToRecipe(flakes);
        porridge.addToRecipe(apricots);
        porridge.addToRecipe(dates);

        porridge1.addToRecipe(flakes);
        porridge1.addToRecipe(apricots);
        porridge1.addToRecipe(dates);

        RecipeSet recipeSet = new RecipeSet();
        recipeSet.addToRecipeSet(porridge);
        recipeSet.addToRecipeSet(porridge1);
        recipeSet.addToRecipeSet(smoothie);

        System.out.println();

////////////
        Set<Integer> intSet = new HashSet<>(20);
        Random rand = new Random();
        while (intSet.size() < 20) {
            intSet.add(rand.nextInt(1001));
        }

//        Set<Integer> intSetCopy = new HashSet<>();
//        intSetCopy.addAll(intSet);
//        for (Integer integer : intSetCopy) {
//            if (integer % 2 == 1) {
//               intSet.remove(integer);
//            }
//        }

        for (Iterator<Integer> i = intSet.iterator(); i.hasNext(); ) {
            if (i.next() % 2 == 1) {
                i.remove();
            }
        }
        System.out.println(intSet);

    }
}