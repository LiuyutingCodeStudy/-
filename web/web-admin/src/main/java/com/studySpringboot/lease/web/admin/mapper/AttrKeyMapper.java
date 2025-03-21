package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.AttrKey;
import com.studySpringboot.lease.web.admin.vo.attr.AttrKeyVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Mapper
*/
@Mapper
public interface AttrKeyMapper extends BaseMapper<AttrKey> {
    List<AttrKeyVo> listAttrInfo();
}




