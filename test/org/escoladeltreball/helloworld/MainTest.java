/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw39443990
 *
 */
public class MainTest {
	
	private static Main main;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBerforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] {1,2,3}));
		assertEquals(0, main.findSmallest(new int[] {4,0,1,2,3}));
		assertEquals(-3, main.findSmallest(new int[] {1,2,1,-3}));
		assertEquals(3, main.findSmallest(new int[] {3}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
	
	@Test
	public final void testSum() {
		assertEquals(6, main.sum(new int[] {1,2,3}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */

	@Test
	public final void testFrequency() {
		assertEquals(2, main.frequency(new int [] {1,2,3,2}, 2));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */

	@Test
	public final void testFrequencyPercentage() {
		assertEquals(3, main.frequencyPercentage(new int [] {1,2,3,4,5,2}, 2), 0.001);
	}

}
