

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
        
          String input ="1267";
        String result = quiz.gussnumber(input);
        Assert.assertEquals("2a0b", result);
    }
   
    
   /* @Test
    public void service Test()
    {
    	String x = Quiz.generate();
    }*/
//��ʵ�� ����һ��ֲ
    //����A������
    //����B������
    //AB�ظ�
    //�����ظ�������  �������
}
