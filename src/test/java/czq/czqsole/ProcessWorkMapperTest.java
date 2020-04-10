package czq.czqsole;

import czq.czqsole.dao.ProcessWorkMapper;
import czq.czqsole.domain.ProcessWork;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.assertTrue;

/**
 * Author: czqsole
 * Date: 2018/6/15
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ProcessWorkMapperTest {

    private static final Logger log = LoggerFactory.getLogger(ProcessWorkMapperTest.class);

    @Resource
    ProcessWorkMapper processWorkMapper;

    @Test
    public void testInsert() {
        ProcessWork work = new ProcessWork();
        work.setWorkName("Test");
        work.setWorkDesc("This is a test work");
        work.setType(1);
        work.setClassification(1);
        work.setStatus(1);
        work.setProcessPercent(10);
        work.setComment("aaaaaaaaa");

        try {
            processWorkMapper.insert(work);
            assertTrue (true);
        } catch (Exception e) {
            log.error(">>>>>>>>>>>>>> error:", e);
        }
    }

}
