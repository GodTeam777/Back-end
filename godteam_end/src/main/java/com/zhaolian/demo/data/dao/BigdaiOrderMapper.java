package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.BigdaiOrder;
import com.zhaolian.demo.data.entity.BigdaiOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiOrderMapper {
    long countByExample(BigdaiOrderExample example);

    int deleteByExample(BigdaiOrderExample example);

    int deleteByPrimaryKey(BigDecimal boid);

    int insert(BigdaiOrder record);

    int insertSelective(BigdaiOrder record);

    List<BigdaiOrder> selectByExample(BigdaiOrderExample example);

    BigdaiOrder selectByPrimaryKey(BigDecimal boid);

    int updateByExampleSelective(@Param("record") BigdaiOrder record, @Param("example") BigdaiOrderExample example);

    int updateByExample(@Param("record") BigdaiOrder record, @Param("example") BigdaiOrderExample example);

    int updateByPrimaryKeySelective(BigdaiOrder record);

    int updateByPrimaryKey(BigdaiOrder record);
}