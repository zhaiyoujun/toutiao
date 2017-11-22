package zyj.toutiao.dao;

import org.apache.ibatis.annotations.*;
import zyj.toutiao.model.News;

import java.util.List;


@Mapper
public interface NewsDAO {
    String TABLE_NAME = "news";
    String INSET_FIELDS = " title, link, image, like_count, comment_count, created_date, user_id ";
    String SELECT_FIELDS = " id, " + INSET_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS, ") " +
            "values (#{title}, #{link}, #{image}, #{likeCount}, #{commentCount}, #{createdDate}, #{userId})"})
    int addNews(News news);

    List<News> selectByUserIdAndOffset(@Param("userId")int userId,
                                       @Param("offset")int offset,
                                       @Param("limit")int limit);
}
