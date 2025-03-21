package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.RoomLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Mapper
*/
@Mapper
public interface RoomLabelMapper extends BaseMapper<RoomLabel> {

}




