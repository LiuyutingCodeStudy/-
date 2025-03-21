package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.LeaseAgreement;
import com.studySpringboot.lease.web.admin.vo.agreement.AgreementQueryVo;
import com.studySpringboot.lease.web.admin.vo.agreement.AgreementVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
*/
@Mapper
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementByQuery(IPage<AgreementVo> page, AgreementQueryVo queryVo);
}




