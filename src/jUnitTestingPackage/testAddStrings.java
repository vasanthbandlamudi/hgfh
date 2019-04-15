package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junitstring= new jUnitFunction();
		String result=junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
