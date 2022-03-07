package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testadd() {
		System.out.println("This test run");
	}

	@Test
	void testabc() {
		MathUtils m=new MathUtils();
		int e[]={1,2,3,4};
		int a[]=m.abc(new int[] {1,2,3,4},4);
	assertArrayEquals(e,a);
		
	}

}
