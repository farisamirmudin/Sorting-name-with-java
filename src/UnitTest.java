import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	public void test() {
		int result = Testaufgabe.calcVal("FRAUNHOFER", 3);
		int expected = 448;
		assertEquals(expected, result);
	}

}
