package com.mybp.cus.mrperfume.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.service.DealerPoService;
@Service("dealerPoService")
public class DealerPoServiceImpl implements DealerPoService {

	public DealerPoServiceImpl(){
		System.out.println("DealerPoServiceImpl !!!!");
	}
	
	@Override
	public List<DealerPoDTO> searchDealerPO(DealerPoDTO criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveOrUpdateDealerPO(DealerPoDTO dealerPoDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DealerDTO> loadAllDealer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DealerDTO getDealer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
