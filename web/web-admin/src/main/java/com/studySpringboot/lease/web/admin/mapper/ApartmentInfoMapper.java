package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.ApartmentInfo;
import com.studySpringboot.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.studySpringboot.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
*/
@Mapper
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {
    IPage<ApartmentItemVo> pageItem(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);
}




