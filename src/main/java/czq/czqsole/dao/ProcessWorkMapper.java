package czq.czqsole.dao;

import czq.czqsole.domain.ProcessWork;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Author: czqsole
 * Date: 2018/6/15
 */
@Mapper
public interface ProcessWorkMapper {

    @Insert("insert into process_work(work_name, work_desc, type, classification, status, process_percent, comment, gmt_create, gmt_modified)" +
            "values(#{workName}, #{workDesc}, #{type}, #{classification}, #{status}, #{processPercent}, #{comment}, now(), now())")
    void insert(ProcessWork processWork);

    @Select("select * from process_work limit 100")
    @Results({
            @Result(property = "workName",  column = "work_name", javaType = String.class),
            @Result(property = "workDesc", column = "work_desc", javaType = String.class),
            @Result(property = "gmtCreate", column = "gmt_create", javaType = Date.class)
    })
    List<ProcessWork> select();

    void update(ProcessWork work);
}
