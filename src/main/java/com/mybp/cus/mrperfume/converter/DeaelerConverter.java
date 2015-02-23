package com.mybp.cus.mrperfume.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybp.cus.mrperfume.service.DealerPoService;
@FacesConverter("dealerConverter")
public class DeaelerConverter implements Converter {

	@Autowired
	private DealerPoService dealerPoService;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 == null)
			return null;
		
		dealerPoService.getDealer(1L);
		//TODO getDealer
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 == null)
			return "";
		
//		DealerDTO absDto = (DealerDTO)arg2;
//		String result = absDto.toString();
		return arg2.toString();
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

}
