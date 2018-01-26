package com.sinohealth.dsc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sinohealth.dsc.entity.BasTestItem;

public interface BasItemMapper {
	
	@Select("select * from bas_test_item where id = #{id}")
	public BasTestItem getBasItem(@Param("id") int id);
	
	@Insert("insert bas_test_item (id) values (#{id})")
	public int insertBasItem(@Param("id") int id);
	
	@Select("select * from bas_test_item limit 10")
	public List<BasTestItem> getBasItems();
}
