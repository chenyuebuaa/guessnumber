

import org.junit.Assert;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 10/21/12
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class QuizTest {
    //@Before
      private Quiz quiz=new Quiz("1234");
      
    public void setUp()
    {
      // quiz = new Quiz("1234");
    }

    @Test
   public void rulesTest()
    {
      
        String result = quiz.gussnumber("1234");
        Assert.assertEquals("4a0b", result);
    }
    @Test
    public void Test()
    {
        
          String input ="4321";
        String result = quiz.gussnumber(input);
        Assert.assertEquals("0a4b", result);
    }
    @Test
    public void inputTest()
    {
    	String input = "4444";
    	String result = quiz.checklegal(input);
    	Assert.assertEquals("wrong",result);
    }
    
   /* @Test
    public void service Test()
    {
    	String x = Quiz.generate();
    }*/
//先实现 返回一个植
    //返回A的数字
    //返回B的数字
    //AB重复
    //输入重复的数字  输入控制
}
