package czq.czqsole.service;

import czq.czqsole.domain.ProcessWork;

import java.util.List;

/**
 * Author: czqsole
 * Date: 2018/9/8
 */
public interface WorkService {
    void addWork(ProcessWork work);

    ProcessWork getWork(String name);

    List<ProcessWork> getAll();

    void update(ProcessWork work);

    void batchUpdate(List<ProcessWork> workList);
}
