import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Recipe smoothie = new Recipe("Смузи");
        Recipe porridge = new Recipe("Каша");
        Recipe porridge1 = new Recipe("Каша1");

        smoothie.addToRecipe("банан", 130, 2);
        smoothie.addToRecipe("киви", 200, 1);
        smoothie.addToRecipe("яблоко", 100, 1);
        smoothie.addToRecipe("яблоко", 100, 2);

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


    }
}