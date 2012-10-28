


public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }
    
    public int[] parseString(String userInput)
    {
    	int input[] = new int[4];
    	for(int i=0;i<4;i++)
    	{
    		input[i] = Integer.parseInt(userInput.substring(i, i+1));
    	}
    	return input;
    }
    
 

    public String validate(String userInput) {
    	int countA = 0;
        int countB = 0;
        for(int i =0; i<userInput.length();i++)
        {
                if(userInput.charAt(i)==randomNumber.charAt(i))
                {
                            countA++;
                }
        }////countA;
        
        for(int j=0;j<userInput.length();j++)
        {
            for(int x=0;x<userInput.length();x++)
            {
                     if(userInput.charAt(j)==userInput.charAt(x))
                         countB++;
            }
        }
        return  countA+"a"+(countB-countA)+"b";
       
    }
}

