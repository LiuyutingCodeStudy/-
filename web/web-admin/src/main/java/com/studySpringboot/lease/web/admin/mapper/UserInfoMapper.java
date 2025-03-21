package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【user_info(用户信息表)】的数据库操作Mapper
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




