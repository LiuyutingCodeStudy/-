package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.LabelInfo;
import com.studySpringboot.lease.model.enums.ItemType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
*/
@Mapper
public interface LabelInfoMapper extends BaseMapper<LabelInfo> {

    List<LabelInfo> selectListByApartmentId(Long id);

    List<LabelInfo> selectListByRoomId(Long id);
}




