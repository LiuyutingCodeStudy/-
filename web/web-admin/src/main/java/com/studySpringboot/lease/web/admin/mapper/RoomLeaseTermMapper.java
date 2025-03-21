package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.RoomLeaseTerm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Mapper
*/
@Mapper
public interface RoomLeaseTermMapper extends BaseMapper<RoomLeaseTerm> {

}




