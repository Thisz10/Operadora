package br.com.operadora.sms.util;

import org.apache.commons.lang3.StringUtils;

import br.com.operadora.sms.dominio.Message;

public class Validator {
	
	public boolean isValidSms(Message message) {
		
		if (message == null){
			return false;
		}

		if (message.getId() == null){
			return false;
		}
		
		if(StringUtils.isBlank(message.getSender())){
			return false;
		}
		
		if(StringUtils.isBlank(message.getDestination())){
			return false;
		}
		
		if(StringUtils.isBlank(message.getBody()) || message.getBody().length() > 160  ){
			return false;
		}

		return true;
	}
	
	

}
