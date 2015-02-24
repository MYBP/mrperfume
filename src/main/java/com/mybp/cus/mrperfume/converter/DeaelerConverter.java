package com.mybp.cus.mrperfume.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybp.cus.mrperfume.dto.DealerDTO;
import com.mybp.cus.mrperfume.service.DealerPoService;

@Service
public class DeaelerConverter implements Converter {

	@Autowired
	private DealerPoService dealerPoService;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 == null || arg2.isEmpty())
			return null;		
		try {            
            Object obj =  dealerPoService.getDealer(new Long(arg2));
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ConverterException(new FacesMessage(String.format("Cannot convert %s to DealerDTO", arg2)), e);
        }
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 == null)
			return "";

		if (!(arg2 instanceof DealerDTO)) {
			return null;
		}

		String s = String.valueOf(((DealerDTO) arg2).getId());

		return s;
	}

	public DealerPoService getDealerPoService() {
		return dealerPoService;
	}

	public void setDealerPoService(DealerPoService dealerPoService) {
		this.dealerPoService = dealerPoService;
	}

}
