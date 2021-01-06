package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.123
 * @author vitali_shulha
 */
public class AppTest {

	@Test
	public void testShouldBePassed() {
		assertTrue(false);
	}

	@Test
	public void testShouldBeFailed() {
		assertTrue(true);
	}

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
}
