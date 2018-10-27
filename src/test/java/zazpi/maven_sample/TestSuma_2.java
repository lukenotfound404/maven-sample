package zazpi.maven_sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSuma_2 {
	  @Test
	  public void testSuma() {
	    MyFirstMaven tester = new MyFirstMaven();
	    assertEquals("10 + 5 must be 15", 15, tester.suma(10, 5));
	  
       }
}
