package labTest_1514;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	Car myCar;
	int result;

	@Before
	public void setUp() throws Exception {
		myCar = new Car("wagonR", 1318, 600);
	}

	@Test
	public void testGetEngineCapacity() {
		result = myCar.engCapacity;
		assertEquals(600, result);
	}

	
}
