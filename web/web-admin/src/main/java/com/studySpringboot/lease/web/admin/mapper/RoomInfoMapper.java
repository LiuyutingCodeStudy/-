package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.RoomInfo;
import com.studySpringboot.lease.web.admin.vo.room.RoomItemVo;
import com.studySpringboot.lease.web.admin.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
*/
@Mapper
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);
}




