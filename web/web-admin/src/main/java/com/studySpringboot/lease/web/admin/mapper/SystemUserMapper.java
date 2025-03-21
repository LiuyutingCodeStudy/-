package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.SystemUser;
import com.studySpringboot.lease.web.admin.vo.system.user.SystemUserItemVo;
import com.studySpringboot.lease.web.admin.vo.system.user.SystemUserQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【system_user(员工信息表)】的数据库操作Mapper
*/
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {

    IPage<SystemUserItemVo> pageSystemUserByQuery(IPage<SystemUser> page, SystemUserQueryVo queryVo);

    SystemUser selectOneByUsername(String username);
}




