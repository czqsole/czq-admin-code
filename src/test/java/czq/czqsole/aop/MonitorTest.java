package czq.czqsole.aop;

import czq.czqsole.Application;
import czq.czqsole.annotation.MethodLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class MonitorTest {

    @Test
    @MethodLog(description = "test")
    public void testAround() {
        System.out.println("testAround");
    }
}
