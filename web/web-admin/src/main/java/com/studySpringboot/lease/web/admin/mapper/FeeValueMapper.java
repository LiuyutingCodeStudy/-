package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.FeeValue;
import com.studySpringboot.lease.web.admin.vo.fee.FeeValueVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Mapper
*/
@Mapper
public interface FeeValueMapper extends BaseMapper<FeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long id);
}




