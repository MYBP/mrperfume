package com.mybp.cus.mrperfume.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 * @author MrMai
 *
 */
@ManagedBean
@SessionScoped
public class DealerPoManagedBean {

	private Date transactionDate;

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}