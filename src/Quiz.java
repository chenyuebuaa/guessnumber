

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 10/21/12
 * Time: 4:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Quiz {
    private String str;
     public Quiz(String str)
     {
         this.str = str;

     }
    public String gussnumber(String s) {

        int countA = 0;
        int countB = 0;
        for(int i =0; i<str.length();i++)
        {
                if(str.charAt(i)==s.charAt(i))
                {
                            countA++;
                }
        }
        for(int j=0;j<str.length();j++)
        {
            for(int x=0;x<str.length();x++)
            {
                     if(s.charAt(j)==str.charAt(x))
                         countB++;
            }
        }
        String re = countA+"a"+(countB-countA)+"b";
        return re;  //To change body of created methods use File | Settings | File Templates.
    }
	public String checklegal(String input) {
		// TODO Auto-generated method stub
		return "wrong";
	}
	public static String generate() {
		// TODO Auto-generated method stub
		//int seed = 1;
		int x = (int) Math.random()*9;
		return null;
	}



}

