package junitnesstest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathJunit {
Mathj m=new Mathj();
	@Test
	public void addtest() {
	int ao=m.add(2, 6);
	assertEquals(8,ao);
	
	}
	@Test
	public void subtest() {
		int ao=m.sub(2, 6);
		assertEquals(-4,ao);
	}

}
