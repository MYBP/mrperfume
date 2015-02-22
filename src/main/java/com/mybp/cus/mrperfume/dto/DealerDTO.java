package com.mybp.cus.mrperfume.dto;

public class DealerDTO extends AbstractDTO{

	/**
	 * Dealer Code
	 */
	private String code;
	/**
	 * Dealer Name
	 */
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
