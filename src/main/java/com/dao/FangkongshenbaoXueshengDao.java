package com.dao;

import com.entity.FangkongshenbaoXueshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkongshenbaoXueshengView;

/**
 * 学生防控申报 Dao 接口
 *
 * @author 
 */
public interface FangkongshenbaoXueshengDao extends BaseMapper<FangkongshenbaoXueshengEntity> {

   List<FangkongshenbaoXueshengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
