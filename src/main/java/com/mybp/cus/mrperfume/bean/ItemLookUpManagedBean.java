package com.mybp.cus.mrperfume.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.dto.PaggingWrapper;
import com.mybp.cus.mrperfume.service.DealerPoService;
/**
 * @author MrMai
 *
 */
@ManagedBean
@SessionScoped
public class ItemLookUpManagedBean {

	@ManagedProperty(value="#{dealerPoService}")
	private DealerPoService dealerPoService;
	
	private ItemDTO criteria = new ItemDTO();
	
	PaggingWrapper<ItemDTO> searchItem = new PaggingWrapper<ItemDTO>();
	
	int currentPage = 1;
	
	int rowPerPage = 10;
	
	private List<ItemDTO> selectedItem;

	@PostConstruct
	public void init(){
		
	}
	
	public void search(){
		this.searchItem = dealerPoService.searchItem(criteria, currentPage, rowPerPage);
	}
	
	public void search(ActionEvent actionEvent){
		this.search();
	}
	
	public void reset(){
		
	}
	
	public void reset(ActionEvent actionEvent){
		this.reset();
	}
	
	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

	public PaggingWrapper<ItemDTO> getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(PaggingWrapper<ItemDTO> searchItem) {
		this.searchItem = searchItem;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRowPerPage() {
		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}

	public ItemDTO getCriteria() {
		return criteria;
	}

	public void setCriteria(ItemDTO criteria) {
		this.criteria = criteria;
	}
	
	public void selectItemFromDialog(ItemDTO item) {
        RequestContext.getCurrentInstance().closeDialog(item);
    }

	public List<ItemDTO> getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(List<ItemDTO> selectedItem) {
		this.selectedItem = selectedItem;
	}
	
	
}