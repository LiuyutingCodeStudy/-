package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.RoomFacility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【room_facility(房间&配套关联表)】的数据库操作Mapper
*/
@Mapper
public interface RoomFacilityMapper extends BaseMapper<RoomFacility> {

}




