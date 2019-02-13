package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();

		int output = test.countA("alphabet");
		assertEquals(2, output);

	}

}
