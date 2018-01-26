package com.sinohealth.dsc.entity;

public class BasTestItem {
	
	public int id;
	public String testItem_ft;
	public String testItem_name_c;
	public String big_category;
	public String small_category;
	public String item_name_comm;
	public int group_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestItem_ft() {
		return testItem_ft;
	}
	public void setTestItem_ft(String testItem_ft) {
		this.testItem_ft = testItem_ft;
	}
	public String getTestItem_name_c() {
		return testItem_name_c;
	}
	public void setTestItem_name_c(String testItem_name_c) {
		this.testItem_name_c = testItem_name_c;
	}
	public String getBig_category() {
		return big_category;
	}
	public void setBig_category(String big_category) {
		this.big_category = big_category;
	}
	public String getSmall_category() {
		return small_category;
	}
	public void setSmall_category(String small_category) {
		this.small_category = small_category;
	}
	public String getItem_name_comm() {
		return item_name_comm;
	}
	public void setItem_name_comm(String item_name_comm) {
		this.item_name_comm = item_name_comm;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	
	@Override
	public String toString() {
		return "BasTestItem [id=" + id + ", testItem_ft=" + testItem_ft + ", testItem_name_c=" + testItem_name_c
				+ ", big_category=" + big_category + ", small_category=" + small_category + ", item_name_comm="
				+ item_name_comm + ", group_id=" + group_id + "]";
	}
	
}
