package com.mybp.cus.mrperfume.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.dto.DealerPoDTO;
import com.mybp.cus.mrperfume.dto.DealerPoLineDTO;
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
		PaggingWrapper<DealerPoDTO> result = new PaggingWrapper<DealerPoDTO>();
		Long id = new Long(""+ (++page));
		for(int x=0;x<10;x++){
			result.getValues().add(this.getDealerPo(id++));
		}
		result.setCurrentPage(1);
		result.setDataSize(100);
		return result;
	}
	
	@Override
	public DealerPoDTO getDealerPo(Long id){
		DealerPoDTO dto = new DealerPoDTO();
		dto.setId(id);
		dto.setDealer(getDealer(id));
		dto.setDocDate(java.util.Calendar.getInstance());
		dto.setDocNo("Doc no : " + id);
		
		//
		dto.getDealerPoLines().add(new DealerPoLineDTO(dto,this.getItem(id++)));
		dto.getDealerPoLines().add(new DealerPoLineDTO(dto,this.getItem(id++)));
		dto.getDealerPoLines().add(new DealerPoLineDTO(dto,this.getItem(id++)));
		dto.getDealerPoLines().add(new DealerPoLineDTO(dto,this.getItem(id++)));
		dto.getDealerPoLines().add(new DealerPoLineDTO(dto,this.getItem(id++)));
		return dto;
	}

	@Override
	public boolean saveOrUpdateDealerPO(DealerPoDTO dealerPoDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DealerDTO> loadAllDealer() {
		ArrayList<DealerDTO> dealerList = new ArrayList<DealerDTO>();
		for(int x=0;x<10;x++){
			dealerList.add(this.getDealer(new Long(""+ (x+1))));
		}
		return dealerList;
	}

	@Override
	public DealerDTO getDealer(Long id) {
		DealerDTO dealer = new DealerDTO();
		dealer.setId(id);
		dealer.setCode("Code#" + id);
		dealer.setName("Name#" + id);
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
