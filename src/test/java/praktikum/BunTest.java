package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {
	Bun bun;

	@Test
	public void getName() {
		bun = new Bun("black bun", 100);
		Assert.assertEquals("black bun", bun.getName());
	}

	@Test
	public void getPrice() {
		bun = new Bun("black bun", 100);
		Assert.assertEquals(100, bun.getPrice(), 0);
	}
}