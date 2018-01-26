package com.sinohealth.dsc.service;

import java.util.List;

import com.sinohealth.dsc.entity.BasTestItem;

public interface BasItemService {
	public List<String> getItemNameComm(Integer id);
	public BasTestItem getBasItem(Integer id);
	public int insertBasItem(Integer id);
	public List<BasTestItem> getBasItems();
}
