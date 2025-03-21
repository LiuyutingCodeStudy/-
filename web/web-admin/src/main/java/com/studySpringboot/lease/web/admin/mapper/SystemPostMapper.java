package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.SystemPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【system_post(岗位信息表)】的数据库操作Mapper
*/
@Mapper
public interface SystemPostMapper extends BaseMapper<SystemPost> {

}




