package xin.toheart.door.mapper;

import org.apache.ibatis.annotations.Param;
import xin.toheart.door.pojo.Story;

import java.util.List;

public interface StoryMapper {
    int insertStory(@Param("story") Story story);

    Story findStoryById(int id);

    List<Story> findAllStory(@Param("start") int start,@Param("size") int size);

    List<Story> findStoryByLike();

    int findTotalCount();
}
