package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author geyang
 * @email geyang1003@gmail.com
 * @date 2020-12-27 19:55:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
