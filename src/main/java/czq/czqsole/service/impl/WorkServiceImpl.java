package czq.czqsole.service.impl;

import czq.czqsole.annotation.MethodLog;
import czq.czqsole.dao.ProcessWorkMapper;
import czq.czqsole.domain.ProcessWork;
import czq.czqsole.service.WorkService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
@Component
public class WorkServiceImpl implements WorkService {

    @Resource
    ProcessWorkMapper processWorkMapper;

    @Override
    @MethodLog(description = "addWork")
    public void addWork(ProcessWork work) {
        processWorkMapper.insert(work);
    }

    @Override
    public ProcessWork getWork(String name) {
        processWorkMapper.select();
        return null;
    }

    @Override
    @MethodLog(description = "get all()")
    public List<ProcessWork> getAll() {
        return processWorkMapper.select();
    }

    @Override
    public void update(ProcessWork work) {

    }

    @Override
    public void batchUpdate(List<ProcessWork> workList) {

    }
}
