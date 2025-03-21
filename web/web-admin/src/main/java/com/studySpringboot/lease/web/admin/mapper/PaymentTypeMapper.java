package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 针对表【payment_type(支付方式表)】的数据库操作Mapper
 */
@Mapper
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

    List<PaymentType> selectListByRoomId(Long id);
}




