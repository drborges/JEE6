package org.elsa.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

@Named
public class DateConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

		try {
			SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
			return formater.parse(arg2);
			
		} catch (ParseException e) {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		return formater.format(arg2);
	}

}
