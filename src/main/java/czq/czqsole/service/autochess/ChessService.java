package czq.czqsole.service.autochess;

import czq.czqsole.domain.Chess;
import czq.czqsole.domain.result.BaseResult;

import java.util.List;

/**
 * Author: BG366783
 * Date: 2019-03-03 02:21
 */
public interface ChessService {

    BaseResult getAllBuffInfoByChesses(List<Chess> chessList);
}
