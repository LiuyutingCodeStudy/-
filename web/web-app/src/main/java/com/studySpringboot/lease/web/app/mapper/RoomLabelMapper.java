package com.studySpringboot.lease.web.app.mapper;

import com.studySpringboot.lease.model.entity.RoomLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author liubo
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.atguigu.lease.model.entity.RoomLabel
*/
@Mapper
public interface RoomLabelMapper extends BaseMapper<RoomLabel> {

}




