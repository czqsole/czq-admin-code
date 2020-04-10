package czq.czqsole;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.awt.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String udf4 = "||";
        String udf1 = "12345||1";
        String udf2 = "||1";
        String udf3 = "||";
        if(udf4.endsWith("||")) {
            udf4 = udf4.replace("||", "");
        } else {
            udf4 = udf4.substring(0, udf4.indexOf("||"));
        }
        System.out.println(">>>>>>>> udf1:" + udf1 + ", " + udf1.substring(0, udf1.indexOf("||")));
        System.out.println(">>>>>>>> udf2:" + udf2 + ", " + udf2.substring(0, udf2.indexOf("||")));
        System.out.println(">>>>>>>> udf3:" + udf3 + ", " + udf3.substring(0, udf3.indexOf("||")));
        System.out.println(">>>>>>>> udf4:" + udf4 + ", ");
        assertTrue( true );
    }

    @Test
    public void mouseHook() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(0, 0);
    }
}
