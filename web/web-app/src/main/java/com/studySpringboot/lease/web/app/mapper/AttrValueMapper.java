package com.studySpringboot.lease.web.app.mapper;

import com.studySpringboot.lease.model.entity.AttrValue;
import com.studySpringboot.lease.web.app.vo.attr.AttrValueVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author liubo
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.atguigu.lease.model.entity.AttrValue
*/
@Mapper
public interface AttrValueMapper extends BaseMapper<AttrValue> {

    List<AttrValueVo> selectListByRoomId(Long id);
}




