package br.com.operadora.sms;

import br.com.operadora.sms.dominio.Message;
import br.com.operadora.sms.dominio.Response;
import br.com.operadora.sms.util.Validator;



public class OperadoraSms {

	public Response enviarSms(Message message) {
		
		if (!new Validator().isValidSms(message)) {
			return new Response(405, "Validation Exception");
		}
		//Mensagem ok, enviar a Mensagem
		return new Response(201, "Sms sent");
	}
	
		
}