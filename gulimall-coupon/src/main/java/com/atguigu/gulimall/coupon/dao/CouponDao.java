package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author geyang
 * @email geyang1003@gmail.com
 * @date 2021-01-10 09:57:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
