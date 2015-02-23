package com.mybp.cus.mrperfume.service;

import com.mybp.cus.mrperfume.dto.*;
import java.util.List;

public interface DealerPoService {

	public List<DealerDTO> loadAllDealer();
	
	public DealerDTO getDealer(Long id);
	
	public List<DealerPoDTO> searchDealerPO(DealerPoDTO criteria);
	
	public boolean saveOrUpdateDealerPO(DealerPoDTO dealerPoDto);
	
	//public List<DealerPoDTO> getDealerPo
}
