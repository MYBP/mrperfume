package com.mybp.cus.mrperfume.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("primefacesCalendarConverter")
public class PrimefacesCalendarConverter implements Converter {

	@Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Calendar calendar = null;
        Date convertedToDate;

        if (value != null && !"".equals(value)) {
            convertedToDate = convertToDate(context, (org.primefaces.component.calendar.Calendar) component, value);
            calendar = Calendar.getInstance();
            calendar.setTime(convertedToDate);
        }

        return calendar;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        String convertedValue = null;

        if (value != null) {
            convertedValue = convertToString(context, (org.primefaces.component.calendar.Calendar) component, value);
        }

        return convertedValue;
    }

    protected Date convertToDate(FacesContext context, org.primefaces.component.calendar.Calendar pfCalendarComponent, String submittedValue) {
        Locale locale = pfCalendarComponent.calculateLocale(context);
        SimpleDateFormat format = new SimpleDateFormat(pfCalendarComponent.getPattern(), locale);
        format.setTimeZone(pfCalendarComponent.calculateTimeZone());

        try {
            return format.parse(submittedValue);
        } catch (ParseException e) {
            throw new ConverterException(e);
        }
    }

    protected String convertToString(FacesContext context, org.primefaces.component.calendar.Calendar pfCalendarComponent, Object value) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pfCalendarComponent.getPattern(), pfCalendarComponent.calculateLocale(context));

        dateFormat.setTimeZone(pfCalendarComponent.calculateTimeZone());

        return dateFormat.format(((Calendar) value).getTime());
    }
}
