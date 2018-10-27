package zazpi.maven_sample;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class MainTest {
	
	public boolean checkFileExistence() {
		File f = new File("MavenTest.txt");
		return f.exists();
	}
	
	@Test
	public void file_exists_test() {
		MyFirstMaven.main(null);
		assertEquals(true, checkFileExistence());
	}
	
}
