/**
 * 
 */
package com.mybp.cus.mrperfume.dto;


import java.util.Calendar;
import java.util.List;

/**
 * @author sakon
 *
 */
public class DealerPoDTO extends AbstractDTO{

	/**
	 * Document No
	 */
	private String docNo;
	/**
	 * Document date
	 */
	private Calendar docDate;
	/**
	 * Dealer
	 */
	private DealerDTO dealer;
	
	private List<DealerPoLineDTO> dealerPoLines;

	public DealerDTO getDealer() {
		return dealer;
	}

	public void setDealer(DealerDTO dealer) {
		this.dealer = dealer;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public List<DealerPoLineDTO> getDealerPoLines() {
		return dealerPoLines;
	}

	public void setDealerPoLines(List<DealerPoLineDTO> dealerPoLines) {
		this.dealerPoLines = dealerPoLines;
	}

	public Calendar getDocDate() {
		return docDate;
	}

	public void setDocDate(Calendar docDate) {
		this.docDate = docDate;
	}
	
	
}
