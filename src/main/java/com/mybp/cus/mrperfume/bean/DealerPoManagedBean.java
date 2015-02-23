package com.mybp.cus.mrperfume.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.dto.DealerDTO;
/**
 * @author MrMai
 *
 */
@ManagedBean
@SessionScoped
public class DealerPoManagedBean {

	/**
	 * Dealer PO
	 */
	private DealerPoDTO dealerPo=new DealerPoDTO();
	/**
	 * List of dealer
	 */
	private List<DealerDTO> dealerList;
	

	@PostConstruct
	private void init(){
		System.out.println("this is the init method");
		dealerList = new ArrayList<DealerDTO>();
		DealerDTO dealer = new DealerDTO();
		dealer.setId(1L);
		dealer.setCode("A001");
		dealer.setName("Name#A001");
		dealerList.add(dealer);
	}
	
	public DealerPoDTO getDealerPo() {
		return dealerPo;
	}

	public void setDealerPo(DealerPoDTO dealerPo) {
		this.dealerPo = dealerPo;
	}

	public List<DealerDTO> getDealerList() {
		return dealerList;
	}

	public void setDealerList(List<DealerDTO> dealerList) {
		this.dealerList = dealerList;
	}
	
	public void saveDealerPo(){
		
	}
	
}