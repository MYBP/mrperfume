package com.mybp.cus.mrperfume.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybp.cus.mrperfume.service.DealerPoService;

@Service
public class DeaelerConverter implements Converter {
	
	@Autowired
	private DealerPoService dealerPoService;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if(arg2==null)
			return null;
        return dealerPoService.getDealer(new Long(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2==null)
			return "";
		
		return arg2.toString();
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

}
