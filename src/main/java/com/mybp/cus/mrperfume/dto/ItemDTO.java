/**
 * 
 */
package com.mybp.cus.mrperfume.dto;

/**
 * @author sakon
 *
 */
public class ItemDTO {

	/**
	 * รหัสสินค้า
	 */
	String code;
	/**
	 * ชื่อสินค้า
	 */
	String name;
	
	/**
	 * จำนวนคงเหลือ
	 */
	double amount;

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
