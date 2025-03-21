package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.ApartmentFeeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Mapper
*/
@Mapper
public interface ApartmentFeeValueMapper extends BaseMapper<ApartmentFeeValue> {

}




