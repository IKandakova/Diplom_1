package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class BurgerWithParameterizedTest {
	@Mock
	Bun bun;

	@Mock
	Ingredient ingredient;

	@Before
	public void setMock() {
		MockitoAnnotations.openMocks(this);
	}

	@Parameterized.Parameters(name = "{index}: {0}-{2}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{"black bun", IngredientType.valueOf("SAUCE"), "hot sauce"},
				{"red bun", IngredientType.valueOf("FILLING"), "dinosaur"}
		});
	}

	@Parameterized.Parameter(0)
	public String nameBun;

	@Parameterized.Parameter(1)
	public IngredientType type;

	@Parameterized.Parameter(2)
	public String nameIngredient;

	@Test
	public void getReceipts() {
		Burger burger = new Burger();
		burger.setBuns(bun);
		burger.addIngredient(ingredient);
		Mockito.when(bun.getName()).thenReturn(nameBun);
		Mockito.when(ingredient.getType()).thenReturn(type);
		Mockito.when(ingredient.getName()).thenReturn(nameIngredient);
		burger.getReceipt();
	}
}
