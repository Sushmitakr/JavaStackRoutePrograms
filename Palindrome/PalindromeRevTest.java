import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeRevTest {

	  @Before
	    
	    public void setUp() {
	        checkPallindrome = new CheckPallindrome();
	    }

	    @Test
	    public void testInputForPallindrome() {
	        //Arrange

	        String expectedValue = "Hannah";
	        
	        //Act
	        String actualValue = checkPallindrome.reverseInput();
	        //Assert
	        assertEquals(expectedValue, actualValue);
	        
	        
	    }
	    
	    @Test
	    public void testMethodReturnsTrueForPallindrome() {
	        //Arrange
	        
	        String expectedValue = "Hannah";
	        //Act
	        boolean actualValue = checkPallindrome.pallindromeBool("Hannah");
	        //Assert
	        assertTrue(actualValue);
	        
	    }
	    @Test
	    public void testMethodReturnsFalseForPallindrome() {
	        //Arrange
	        
	        String expectedValue = "Hannah";
	        //Act
	        boolean actualValue = checkPallindrome.pallindromeBool("qwerty");
	        //Assert
	        assertFalse(actualValue);
	        
	    }
	    
	    @After
	    public void tearDown() {
	        checkPallindrome = null;
	    }
}
