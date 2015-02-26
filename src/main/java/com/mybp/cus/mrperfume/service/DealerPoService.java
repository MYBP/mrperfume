package com.mybp.cus.mrperfume.service;

import com.mybp.cus.mrperfume.dto.*;
import java.util.List;

public interface DealerPoService {

	public List<DealerDTO> loadAllDealer();
	
	public DealerDTO getDealer(Long id);
	
	public PaggingWrapper<DealerPoDTO> searchDealerPO(DealerPoDTO criteria,int page,int rowPerPage);
	
	public boolean saveOrUpdateDealerPO(DealerPoDTO dealerPoDto);
	
	public PaggingWrapper<ItemDTO> searchItem(ItemDTO criteria,int page,int rowPerPage);
	
	public ItemDTO getItem(Long id);
}
