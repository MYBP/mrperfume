/**
 * 
 */
package com.mybp.cus.mrperfume.dto;

/**
 * @author MrMai
 *
 */
public class StockDTO {

	/**
	 * ITEM
	 */
	private ItemDTO item;
	/**
	 * Remaining
	 */
	private double remain;

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

	public double getRemain() {
		return remain;
	}

	public void setRemain(double remain) {
		this.remain = remain;
	}
}
