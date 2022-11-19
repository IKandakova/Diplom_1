package praktikum;
import org.junit.Assert;
import org.junit.Test;


public class IngredientTest {

    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "black bun", 100);
        Assert.assertEquals("black bun", ingredient.getName());
    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "black bun", 100);
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

}