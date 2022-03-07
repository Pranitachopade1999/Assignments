package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class Lifecycle_HookTest {

 
//	@DisplayName("Add Method")
//	@RepeatedTest(3)
//	void testadd(TestInfo testInfo,TestReporter testReporter,RepetitionInfo repetitionInfo) {
//	Lifecycle_Hook l= new Lifecycle_Hook();
//	
//	System.out.println("Running ---> " + repetitionInfo.getCurrentRepetition() + " Out of " + repetitionInfo.getTotalRepetitions() + "\n");
//	assertEquals(2,l.add(1, 1)," Add two no 1 and 1");	
//	}
	Lifecycle_HookTest()
	{
		System.out.println("Counstructor called\n");
	}
	
	@BeforeAll
	static void init()
	{
		System.out.println("Before all the test cases init() method called \n");
		System.out.println("**********************");
	}
	
	@BeforeEach
	void beforeEach()
	{
		System.out.println("beforeEach() method is started \n");
	}
	
	@Test
	public void testOne()
	{
		System.out.println("testOne() method called\n");
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("testTwo() method called\n");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println("method is ended after each method \n");
		System.out.println("**********************");
	}
	
	

	@AfterAll
	static void end()
	{
		System.out.println("After all the test cases end() method called");
	}

	
}
