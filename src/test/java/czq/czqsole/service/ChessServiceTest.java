package czq.czqsole.service;

import czq.czqsole.Application;
import czq.czqsole.dao.ChessMapper;
import czq.czqsole.domain.Chess;
import czq.czqsole.service.autochess.ChessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: BG366783
 * Date: 2019-03-03 05:31
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ChessServiceTest {

    @Resource
    private ChessService chessService;

    @Resource
    private ChessMapper chessMapper;

    @Test
    public void test_getAllBuffInfoByChesses() {
        List<Chess> chessList = new ArrayList<>();

//        chessList.add(chessMapper.selectByPrimaryKey(1));
//        chessList.add(chessMapper.selectByPrimaryKey(14));
//        chessList.add(chessMapper.selectByPrimaryKey(15));

        for(int i = 0; i < 10;i ++) {
            Random random = new Random(System.currentTimeMillis());
            int key = random.nextInt(55) + 1;
            chessList.add(chessMapper.selectByPrimaryKey(key));
        }

        chessService.getAllBuffInfoByChesses(chessList);
    }
}
