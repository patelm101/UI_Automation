package learningjenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTests {
	
	    @Test
	    public void CheckHelloWorld()
	    {
	        App app = new App();
	        assertEquals( "Hello World!", app.main() );
	    }
}
