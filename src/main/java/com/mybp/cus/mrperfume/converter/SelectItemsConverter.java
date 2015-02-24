/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybp.cus.mrperfume.converter;


import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mr.Sakon Hamatulin
 */
@ManagedBean
@FacesConverter("selectItemsConverter")
public class SelectItemsConverter implements Converter {
    @Override
        public Object getAsObject(FacesContext context, UIComponent component, String value) {
            if(value==null||"".equals(value))
                return null;
                
            return SelectItemsUtils.findValueByStringConversion(context, component, value, this);
        }

        @Override
        public String getAsString(FacesContext context, UIComponent component, Object value) {
                if (value == null) {
                        return "";
                }

                return value.toString();
        }
}
