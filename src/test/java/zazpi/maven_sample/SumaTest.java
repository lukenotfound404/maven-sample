package zazpi.maven_sample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SumaTest {

	  @Test
	  public void testSuma() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 15, tester.suma(10, 5));
	  
       }
	  @Test
	  public void testSuma_1() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 15, tester.suma(10, 5));
	  
       }
	  @Test
	  public void testSuma_2() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 15, tester.suma(10, 5));
	  
       }
	  @Test
	  public void testSuma_3() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 15, tester.suma(10, 5));
	  
       }
	  @Ignore
	  public void testSuma_mal() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 50, tester.suma(10, 5));
	  
       }
	 
}
