package com.mybp.cus.mrperfume.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.service.DealerPoService;
/**
 * @author MrMai
 *
 */
@ManagedBean
@SessionScoped
public class DealerPoManagedBean {

	@ManagedProperty(value="#{dealerPoService}")
	private DealerPoService dealerPoService;
	
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
		dealerList = dealerPoService.loadAllDealer();
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
	
	public void saveDealerPo(ActionEvent actionEvent){
		System.out.println("!!! "+this.dealerPo.getDealer().getName());
	}
	
	public void saveDealerPo(){
		System.out.println("!!! "+this.dealerPo.getDealer().getName());
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}
	
	public void chooseItem(ActionEvent actionEvent){
		chooseItem();
	}
	
	public void chooseItem() {
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("contentHeight", 340);
		options.put("height", 400);
		options.put("width",700);
        RequestContext.getCurrentInstance().openDialog("item",options,null);
    }
     
    public void onItemChosen(SelectEvent event) {
    	//TODO Extract result
        List<ItemDTO> items = (List<ItemDTO>) event.getObject();
    }
	
}