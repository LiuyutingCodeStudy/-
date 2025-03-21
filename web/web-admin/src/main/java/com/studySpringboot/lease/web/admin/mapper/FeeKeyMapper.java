package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.FeeKey;
import com.studySpringboot.lease.web.admin.vo.fee.FeeKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Mapper
*/
@Mapper
public interface FeeKeyMapper extends BaseMapper<FeeKey> {
    List<FeeKeyVo> listFeeInfo();
}




