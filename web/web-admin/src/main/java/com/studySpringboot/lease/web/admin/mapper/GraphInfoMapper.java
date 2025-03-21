package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.GraphInfo;
import com.studySpringboot.lease.model.enums.ItemType;
import com.studySpringboot.lease.web.admin.vo.graph.GraphVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
*/
@Mapper
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}




