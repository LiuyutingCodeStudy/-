package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.ApartmentLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Mapper
*/
@Mapper
public interface ApartmentLabelMapper extends BaseMapper<ApartmentLabel> {

}




