import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;





public class GuessNumberTest {

    @Test
    public void should_return_4a0b_given_all_digits_is_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1234");
        Assert.assertEquals("4a0b", result);
    }

    @Test
    public void should_return_3a0b_given_partial_digits_are_correct(){
        GuessNumber guessNumber = new GuessNumber("1234");
        String result = guessNumber.validate("1235");
        assertEquals("3a0b", result);
    }
    
    @Test
    public void should_return_2a0b_given_two_numbers_are_correct(){
    	 GuessNumber guessNumber = new GuessNumber("1234");
         String result = guessNumber.validate("1256");
         assertEquals("2a0b", result);
    }
    @Test
    public void should_return_2a0b_given_correctA(){
    	 GuessNumber guessNumber = new GuessNumber("1234");
    	
         String result = guessNumber.validate("1267");
         assertEquals("2a0b", result);
    }
    @Test
    public void should_return_2a1b()
    {    GuessNumber guessNumber = new GuessNumber("1234");
    	 guessNumber.parseString("1263");
         String result = guessNumber.validate("1263");
         assertEquals("2a1b", result);
    }
    //@Test
    public void generate_number()
    {
    	GenerateNumber gn = new GenerateNumber();
    	String st = gn.getNumber();
    	assertEquals("1234",st);
    }
    @Test
    public void generate_number_length()
    {
    	GenerateNumber gn = new GenerateNumber();
    	String st = gn.getNumber();
    	assertEquals(4,st.length());
    }
    @Test
    public void generate_number_repeate()
    {
    	GenerateNumber gn = new GenerateNumber();
    	String st = gn.getNumber();
    	
    	boolean m = gn.isrepeate();
    	assertEquals(false,m);
    }
    
}
