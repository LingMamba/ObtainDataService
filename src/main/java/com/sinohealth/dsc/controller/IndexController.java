package com.sinohealth.dsc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinohealth.dsc.entity.BasTestItem;
import com.sinohealth.dsc.service.BasItemService;

@RestController
public class IndexController {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	BasItemService basItemService;

	@RequestMapping("/index")
	public String index() {
		return "{\"result\":{\"status\":{\"code\":0,\"msg\":\"\"},\"data\":[{\"type_id\":\"5\",\"league_id\":\"2016\",\"team_id\":\"3\"},{\"type_id\":\"5\",\"league_id\":\"2016\",\"team_id\":\"178\"}]}}";
//		return "bill,19\nchen,20";
//		return "[{ \"firstName\":\"Bill\" , \"lastName\":\"Gates\" },{ \"firstName\":\"George\" , \"lastName\":\"Bush\" }, { \"firstName\":\"Thomas\" , \"lastName\":\"Carter\" }]";
	}
	
	@RequestMapping("/itemNames")
	public List<String> itemNames(Integer id) {
		return basItemService.getItemNameComm(id);
	}
	
//	@RequestMapping("/items")
//	public BasTestItem items(Integer id) {
//		return basItemService.getBasItem(id);
//	}
	
	@RequestMapping("/items")
	public List<BasTestItem> items() {
		return basItemService.getBasItems();
	}
}
