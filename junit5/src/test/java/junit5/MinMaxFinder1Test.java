package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinder1Test {


	@Test
	@DisplayName("Array size is more than two")
	void test() {
	MinMaxFinder1 m=new MinMaxFinder1();
	int expected[]= {3,56};
	int max=m.maxFinder(new int[] {56,34,7,3,54,3,34,34,53},9);
	int min=m.minFinder(new int[] {56,34,7,3,54,3,34,34,53},9);
	int actual[]= {min,max};
	assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Array size is one")
	void test1() {
	MinMaxFinder1 m=new MinMaxFinder1();
	int expected[]= {2,2};
	int max=m.maxFinder(new int[] {2},1);
	int min=m.minFinder(new int[] {2},1);
	int actual[]= {min,max};
	assertArrayEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("Array size is two")
	void test2() {
	MinMaxFinder1 m=new MinMaxFinder1();
	int expected[]= {6,8};
	int max=m.maxFinder(new int[] {8,6},2);
	int min=m.minFinder(new int[] {8,6},2);
	int actual[]= {min,max};
	assertArrayEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("Negative value array")
	void test3() {
	MinMaxFinder1 m=new MinMaxFinder1();
	int expected[]= {-32,-1};
	int max=m.maxFinder(new int[] {-8,-3,-10,-32,-1},5);
	int min=m.minFinder(new int[] {-8,-3,-10,-32,-1},5);
	int actual[]= {min,max};
	assertArrayEquals(expected,actual);
		
	}

	

}
