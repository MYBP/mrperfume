package com.mybp.cus.mrperfume.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.dto.ItemDTO;
import com.mybp.cus.mrperfume.dto.PaggingWrapper;
import com.mybp.cus.mrperfume.service.DealerPoService;
@Service("dealerPoService")
public class DealerPoServiceImpl implements DealerPoService {

	public DealerPoServiceImpl(){
		System.out.println("DealerPoServiceImpl !!!!");
	}
	
	@Override
	public PaggingWrapper<DealerPoDTO> searchDealerPO(DealerPoDTO criteria,int page,int rowPerPage) {
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

	@Override
	public PaggingWrapper<ItemDTO> searchItem(ItemDTO criteria, int rowStart, int rowPerPage) {
		// TODO Auto-generated method stub
		PaggingWrapper<ItemDTO> result = new PaggingWrapper<ItemDTO>();
		
		Long id = new Long(""+ (++rowStart));
		for(int x=0;x<10;x++){
			result.getValues().add(this.getItem(id++));
		}
		result.setCurrentPage(1);
		result.setDataSize(100);
		return result;
	}

	@Override
	public ItemDTO getItem(Long id) {
		ItemDTO item = new ItemDTO();
		item.setId(id);
		item.setCode("item code# "+id);
		item.setName("item name # " + id);
		return item;
	}
	
}
