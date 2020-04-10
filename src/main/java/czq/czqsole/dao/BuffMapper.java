package czq.czqsole.dao;

import czq.czqsole.domain.Buff;
import czq.czqsole.domain.BuffExample;
import java.util.List;

import czq.czqsole.domain.BuffSo;
import org.apache.ibatis.annotations.Param;

public interface BuffMapper {
    long countByExample(BuffExample example);

    int deleteByExample(BuffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Buff record);

    int insertSelective(Buff record);

    List<Buff> selectByExample(BuffExample example);

    Buff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Buff record, @Param("example") BuffExample example);

    int updateByExample(@Param("record") Buff record, @Param("example") BuffExample example);

    int updateByPrimaryKeySelective(Buff record);

    int updateByPrimaryKey(Buff record);

    List<Buff> selectBySo(BuffSo so);
}