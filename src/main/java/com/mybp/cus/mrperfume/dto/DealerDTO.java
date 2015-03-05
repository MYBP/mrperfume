package com.mybp.cus.mrperfume.dto;

import java.io.Serializable;

public class DealerDTO extends AbstractDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6754495090213396188L;
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
