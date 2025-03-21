package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.AttrValue;
import com.studySpringboot.lease.web.admin.vo.attr.AttrValueVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Mapper
*/
@Mapper
public interface AttrValueMapper extends BaseMapper<AttrValue> {

    List<AttrValueVo> selectListByRoomId(Long id);
}




