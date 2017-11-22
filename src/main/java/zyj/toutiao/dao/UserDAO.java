package zyj.toutiao.dao;

import org.apache.ibatis.annotations.*;
import zyj.toutiao.model.User;

@Mapper
public interface UserDAO {
    String TABLE_NAME = "user";
    String INSET_FIELDS = " name, password, salt, head_url ";
    String SELECT_FIELDS = " id, name, password, salt, head_url ";

    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS, ") " +
            "values (#{name}, #{password}, #{salt}, #{headUrl})"})
    int addUser(User user);

    @Select({"select ", UserDAO.SELECT_FIELDS, " from ", UserDAO.TABLE_NAME, " where id=#{id} "})
    User selectById(int id);

    @Update({"update ", UserDAO.TABLE_NAME, " set password=#{password} where id=#{id}"})
    void updatePassword(User user);

    @Delete({"delete from ", UserDAO.TABLE_NAME, " where id=#{id}"})
    void deleteById(int id);
}
