package com.studySpringboot.lease.web.admin.mapper;

import com.studySpringboot.lease.model.entity.BrowsingHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 针对表【browsing_history(浏览历史)】的数据库操作Mapper
*/
@Mapper
public interface BrowsingHistoryMapper extends BaseMapper<BrowsingHistory> {

}




