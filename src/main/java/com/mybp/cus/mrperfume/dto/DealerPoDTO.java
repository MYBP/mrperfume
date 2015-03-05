/**
 * 
 */
package com.mybp.cus.mrperfume.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author sakon
 *
 */
public class DealerPoDTO extends AbstractDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4492931514958440478L;
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
	
	private List<DealerPoLineDTO> dealerPoLines=new ArrayList<DealerPoLineDTO>();

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
