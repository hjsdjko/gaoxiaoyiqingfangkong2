package com.dao;

import com.entity.FangkongshenbaoJiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkongshenbaoJiaoshiView;

/**
 * 教师防控申报 Dao 接口
 *
 * @author 
 */
public interface FangkongshenbaoJiaoshiDao extends BaseMapper<FangkongshenbaoJiaoshiEntity> {

   List<FangkongshenbaoJiaoshiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
