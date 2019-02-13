package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
