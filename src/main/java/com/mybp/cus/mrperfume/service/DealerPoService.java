package com.mybp.cus.mrperfume.service;

import com.mybp.cus.mrperfume.dto.*;
import java.util.List;

public interface DealerPoService {

	public List<DealerPoDTO> searchDealerPO(DealerPoDTO criteria);
	
	public boolean saveOrUpdateDealerPO(DealerPoDTO dealerPoDto);
}
