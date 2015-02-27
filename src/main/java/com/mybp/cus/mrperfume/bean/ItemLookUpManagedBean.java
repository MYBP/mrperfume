package com.mybp.cus.mrperfume.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.mybp.cus.mrperfume.bean.lazy.LazyItemDataModel;
import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.service.DealerPoService;
/**
 * @author MrMai
 *
 */
@ManagedBean
@SessionScoped
public class ItemLookUpManagedBean implements Serializable   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8498446381029727272L;


	@ManagedProperty(value="#{dealerPoService}")
	private DealerPoService dealerPoService;
	
	
	LazyItemDataModel lazyItemModel = null;
	
	private List<ItemDTO> selectedItem;

	@PostConstruct
	public void init(){
		lazyItemModel = new LazyItemDataModel(dealerPoService);
	}
	
	public void reset(){
		
	}
	
	public void reset(ActionEvent actionEvent){
		this.reset();
	}

	public void selectItemFromDialog() {
        RequestContext.getCurrentInstance().closeDialog(selectedItem);
    }

	public List<ItemDTO> getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(List<ItemDTO> selectedItem) {
		this.selectedItem = selectedItem;
	}

	public LazyItemDataModel getLazyItemModel() {
		return lazyItemModel;
	}

	public void setLazyItemModel(LazyItemDataModel lazyItemModel) {
		this.lazyItemModel = lazyItemModel;
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}
	
	
}