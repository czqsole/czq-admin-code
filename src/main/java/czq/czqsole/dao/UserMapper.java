package czq.czqsole.dao;

import czq.czqsole.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Author: czqsole
 * Date: 2018/6/13
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User select(@Param("name") String name);

    @Select("insert into user(name, id) values(#{name}, #{id})")
    void insert(User user);
//    void insert(@Param("name") String name, @Param("int") int id);

}
