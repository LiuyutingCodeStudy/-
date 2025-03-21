package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.ViewAppointment;
import com.studySpringboot.lease.web.admin.vo.appointment.AppointmentQueryVo;
import com.studySpringboot.lease.web.admin.vo.appointment.AppointmentVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
*/
@Mapper
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentByQuery(IPage<AppointmentVo> page, AppointmentQueryVo queryVo);
}




