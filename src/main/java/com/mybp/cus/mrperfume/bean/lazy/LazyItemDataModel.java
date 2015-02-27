package com.mybp.cus.mrperfume.bean.lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.dto.PaggingWrapper;
import com.mybp.cus.mrperfume.service.DealerPoService;

public class LazyItemDataModel extends LazyDataModel<ItemDTO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2330019645917074960L;
	
	private DealerPoService dealerPoService;
	
	List<ItemDTO> listData = new ArrayList<ItemDTO>();
	
	ItemDTO criteria = new ItemDTO();
	
	@SuppressWarnings("unused")
	private LazyItemDataModel(){}
	
	public LazyItemDataModel(DealerPoService dealerPoService){
		this.dealerPoService = dealerPoService;
	}
	
	@Override
    public ItemDTO getRowData(String rowKey) {
        for(ItemDTO item : this.listData) {
            if(item.getId().equals(rowKey))
                return item;
        }
 
        return null;
    }
 
    @Override
    public Object getRowKey(ItemDTO item) {
        return item.getId();
    }
	
	@Override
    public List<ItemDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String,Object> filters) {

		PaggingWrapper<ItemDTO> searchItem = dealerPoService.searchItem(criteria, first, pageSize);
		this.listData = searchItem.getValues();
		this.setRowCount(searchItem.getDataSize());
		
		//paginate
/*        if(this.getRowCount() > pageSize) {
            try {
                return data.subList(first, first + pageSize);
            }
            catch(IndexOutOfBoundsException e) {
                return data.subList(first, first + (dataSize % pageSize));
            }
        }
        else {
            return data;
        }*/
		
		return listData;
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

	public ItemDTO getCriteria() {
		return criteria;
	}

	public void setCriteria(ItemDTO criteria) {
		this.criteria = criteria;
	}
}
