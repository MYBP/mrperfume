/**
 * 
 */
package com.mybp.cus.mrperfume.dto;

/**
 * @author MrMai
 *
 */
public class DealerPoLineDTO extends AbstractDTO {

	/**
	 * DealerPO Document
	 */
	private DealerPoDTO dealerPo;
	/**
	 * ITEM
	 */
	private ItemDTO item;
	/**
	 * Line Number
	 */
	private int lineNumber;

	public DealerPoLineDTO(DealerPoDTO dealerPo,ItemDTO item){
		this.dealerPo = dealerPo;
		this.item = item;
	}
	
	public DealerPoDTO getDealerPo() {
		return dealerPo;
	}

	public void setDealerPo(DealerPoDTO dealerPo) {
		this.dealerPo = dealerPo;
	}

	public ItemDTO getItem() {
		return item;
	}

	public void setItem(ItemDTO item) {
		this.item = item;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}
