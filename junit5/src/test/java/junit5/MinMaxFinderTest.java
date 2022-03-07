package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
     
//	MinMaxFinder m;
//	
//	@BeforeEach
//	void intit()
//	{
//		 m=new MinMaxFinder();
//	}
//	
	
	
	
	
	@Test
	@DisplayName("Array size is more than two")
	void test() {
	MinMaxFinder m=new MinMaxFinder();
	int expected[]= {3,56};
	int actual[]=m.findMinMax(new int[] {56,34,7,3,54,3,34,34,53},9);
	assertArrayEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("Array size is one")
	void test1() {
	MinMaxFinder m=new MinMaxFinder();
	int expected[]= {2,2};
	int actual[]=m.findMinMax(new int[] {2},1);
	assertArrayEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("Array size is two")
	void test2() {
	MinMaxFinder m=new MinMaxFinder();
	int expected[]= {6,8};
	int actual[]=m.findMinMax(new int[] {8,6},2);
	assertArrayEquals(expected,actual);
		
	}
	
	@Test
	@DisplayName("Negative value array")
	void test3() {
	MinMaxFinder m=new MinMaxFinder();
	int expected[]= {-32,-1};
	int actual[]=m.findMinMax(new int[] {-8,-3,-10,-32,-1},5);
	assertArrayEquals(expected,actual);
		
	}

	

}
