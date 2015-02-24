package com.mybp.cus.mrperfume.service.impl;

import java.util.ArrayList;
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
		ArrayList<DealerDTO> dealerList = new ArrayList<DealerDTO>();
		dealerList.add(this.getDealer(1L));
		dealerList.add(this.getDealer(2L));
		dealerList.add(this.getDealer(3L));
		return dealerList;
	}

	@Override
	public DealerDTO getDealer(Long id) {
		DealerDTO dealer = null;
		if(id == 1){
			dealer = new DealerDTO();
			dealer.setId(1L);
			dealer.setCode("A001");
			dealer.setName("Name#A001");
		}else if(id == 2){
			dealer = new DealerDTO();
			dealer.setId(2L);
			dealer.setCode("A002");
			dealer.setName("Name#A002");
		}else if(id == 3){
			dealer = new DealerDTO();
			dealer.setId(3L);
			dealer.setCode("A003");
			dealer.setName("Name#A003");
		}
		return dealer;
	}
	
}
