/*  2115.[Medium] Find All Possible Recipes from Given Supplies */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class March21Problem2115FindAllPossibleRecipesfromGivenSupplies {
    private static Set<String> availableSupplies;
    private static Map<String, List<String>> recipeToIngredients;
    private static Map<String, Integer> visited;
    private static List<String> result;
    public static void main(String[] args) {
        String[] recipes = {"bread"};
        String[][] ingredients = {{"yeast","flour"}};
        String[] supplies = {"yeast","flour","corn"};
    }
    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        availableSupplies = new HashSet<>(Arrays.asList(supplies));
        recipeToIngredients = new HashMap<>();
        visited = new HashMap<>();
        result = new ArrayList<>();

        for (int i = 0; i < recipes.length; i++) {
            recipeToIngredients.put(recipes[i], ingredients.get(i));
        }

        for (String recipe : recipes) {
            canMake(recipe);
        }

        return result;
    }
    private boolean canMake(String recipe) {
        if (visited.containsKey(recipe)) {
            return visited.get(recipe) == 1;
        }

        if (availableSupplies.contains(recipe)) {
            return true;
        }

        if (!recipeToIngredients.containsKey(recipe)) {
            return false;
        }

        visited.put(recipe, 0);

        for (String ingredient : recipeToIngredients.get(recipe)) {
            if (!canMake(ingredient)) {
                visited.put(recipe, -1);
                return false;
            }
        }

        visited.put(recipe, 1);
        result.add(recipe);
        return true;
    }
}
