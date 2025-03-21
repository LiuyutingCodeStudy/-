package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.RoomPaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【room_payment_type(房间&支付方式关联表)】的数据库操作Mapper
*/
@Mapper
public interface RoomPaymentTypeMapper extends BaseMapper<RoomPaymentType> {

}




