package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.ProOrder;
import com.zhaolian.demo.data.entity.ProOrderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProOrderMapper {
    long countByExample(ProOrderExample example);

    int deleteByExample(ProOrderExample example);

    int deleteByPrimaryKey(BigDecimal poid);

    int insert(ProOrder record);

    int insertSelective(ProOrder record);

    List<ProOrder> selectByExample(ProOrderExample example);

    ProOrder selectByPrimaryKey(BigDecimal poid);

    int updateByExampleSelective(@Param("record") ProOrder record, @Param("example") ProOrderExample example);

    int updateByExample(@Param("record") ProOrder record, @Param("example") ProOrderExample example);

    int updateByPrimaryKeySelective(ProOrder record);

    int updateByPrimaryKey(ProOrder record);
}