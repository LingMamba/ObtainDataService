package com.sinohealth.dsc.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sinohealth.dsc.entity.BasTestItem;
import com.sinohealth.dsc.mapper.BasItemMapper;
import com.sinohealth.dsc.service.BasItemService;

@Service
public class BasItemServiceImpl implements BasItemService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BasItemMapper basItemMapper;

	@Override
	public List<String> getItemNameComm(Integer id) {
		return jdbcTemplate.query("select item_name_comm from bas_test_item where id = " + id,
				new ResultSetExtractor<List<String>>() {

					@Override
					public List<String> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<String> itemNames = new ArrayList<String>();
						while (rs.next()) {
							String itemName = rs.getString(1);
							itemNames.add(itemName);
						}
						return itemNames;
					}

				});
	}

	@Override
	public BasTestItem getBasItem(Integer id) {
		return basItemMapper.getBasItem(id);
	}

	@Override
	@Transactional
	public int insertBasItem(Integer id) {
		int result = basItemMapper.insertBasItem(id);
		double a = 1 / 0;
		return result;
	}
	
	@Override
	public List<BasTestItem> getBasItems() {
		return basItemMapper.getBasItems();
	}

}
