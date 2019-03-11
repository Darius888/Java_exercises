package point;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	public void testFail() {
	fail("Not yet implemented");
	}
	@Test
	public void testOk() {
	assertEquals(2,2);
	}
	@Test
	public void testError() {
	int i = 1/0;
	}
	@Test
	public void testDistance() {
	//to be completed
		Point p1 = new Point(4,6);
		//Point p2 = new Point(6,6);
		assertEquals(p1.distance(), 7.211102550927978, 0.01);
	}

}
