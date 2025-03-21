package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.ApartmentFacility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Mapper
*/
@Mapper
public interface ApartmentFacilityMapper extends BaseMapper<ApartmentFacility> {

}




