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

        smoothie.addToRecipe("банан", 130, 2);
        smoothie.addToRecipe("киви", 200, 1);
        smoothie.addToRecipe("яблоко", 100, 1);
        smoothie.addToRecipe("яблоко", 100, 1);

        System.out.println(smoothie.getRecipePrice());

        porridge.addToRecipe("хлопья", 100, 2);
        porridge.addToRecipe("курага", 800, 1);
        porridge.addToRecipe("финики", 600, 1);

        porridge1.addToRecipe("хлопья", 100, 2);
        porridge1.addToRecipe("курага", 800, 1);
        porridge1.addToRecipe("финики", 600, 1);

        RecipeSet recipeSet = new RecipeSet();
        recipeSet.addToRecipeSet(porridge);
        recipeSet.addToRecipeSet(porridge1);
        recipeSet.addToRecipeSet(smoothie);

        System.out.println();

////////////
        Set<Integer> intSet = new HashSet<>();
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