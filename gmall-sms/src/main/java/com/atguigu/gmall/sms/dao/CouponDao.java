package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author daiyuquan
 * @email 1206445365@qq.com
 * @date 2019-12-03 12:59:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
