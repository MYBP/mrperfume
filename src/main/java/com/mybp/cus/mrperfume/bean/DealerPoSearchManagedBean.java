package com.mybp.cus.mrperfume.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.dto.PaggingWrapper;
import com.mybp.cus.mrperfume.service.DealerPoService;
@ManagedBean
@SessionScoped
public class DealerPoSearchManagedBean extends LazyDataModel<DealerPoDTO> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1747487047898207166L;
	
	@ManagedProperty(value="#{dealerPoService}")
	private DealerPoService dealerPoService;
	
	private DealerPoDTO criteria;
	
	private List<DealerPoDTO> listData = new ArrayList<DealerPoDTO>();

	/**
	 * List of dealer
	 */
	private List<DealerDTO> dealerList;
	

	public List<DealerDTO> getDealerList() {
		return dealerList;
	}

	public void setDealerList(List<DealerDTO> dealerList) {
		this.dealerList = dealerList;
	}

	@PostConstruct
	private void init(){
		setDealerList(dealerPoService.loadAllDealer());
	}
	
	@Override
    public DealerPoDTO getRowData(String rowKey) {
        for(DealerPoDTO dealerPo : this.listData) {
            if(dealerPo.getId().equals(rowKey))
                return dealerPo;
        }
 
        return null;
    }
 
    @Override
    public Object getRowKey(DealerPoDTO dealerPo) {
        return dealerPo.getId();
    }
	
    @Override
    public List<DealerPoDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {
    	PaggingWrapper<DealerPoDTO> searchItem = dealerPoService.searchDealerPO(criteria,first,pageSize);
    	
    	this.listData = searchItem.getValues();
		this.setRowCount(searchItem.getDataSize());
		
		return listData;
    }
    
	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

	public DealerPoDTO getCriteria() {
		return criteria;
	}

	public void setCriteria(DealerPoDTO criteria) {
		this.criteria = criteria;
	}

	public List<DealerPoDTO> getListData() {
		return listData;
	}

	public void setListData(List<DealerPoDTO> listData) {
		this.listData = listData;
	}
	
	public void search(){
		
	}

}
