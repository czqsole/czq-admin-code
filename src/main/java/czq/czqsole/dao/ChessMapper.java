package czq.czqsole.dao;

import czq.czqsole.domain.Chess;
import czq.czqsole.domain.ChessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChessMapper {
    long countByExample(ChessExample example);

    int deleteByExample(ChessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chess record);

    int insertSelective(Chess record);

    List<Chess> selectByExample(ChessExample example);

    Chess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chess record, @Param("example") ChessExample example);

    int updateByExample(@Param("record") Chess record, @Param("example") ChessExample example);

    int updateByPrimaryKeySelective(Chess record);

    int updateByPrimaryKey(Chess record);
}