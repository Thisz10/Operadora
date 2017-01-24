package br.com.operadora.sms.util;

import org.junit.Test;

import br.com.operadora.sms.dominio.Message;
import junit.framework.Assert;


public class ValidadorTest {

	@Test
	public void testIsValidSms(){
		
		Message message = new Message(1L,"sender", "destination", "body");
		
		Assert.assertTrue(new Validator().isValidSms(message));
		
	}
	
	@Test
	public void testIsValidSmsWhenIdSmsNull(){
		
		Message message = new Message(null,"sender", "destination", "body");
		
		Assert.assertFalse(new Validator().isValidSms(message));
	}
	
	@Test
	public void testIsValidSmsWhenSenderEmpty(){
		
		Message message = new Message(1L,"", "destination", "body");
		
		Assert.assertFalse(new Validator().isValidSms(message));
	}
	
	@Test
	public void testIsValidSmsWhenDestinationEmpty(){
		
		Message message = new Message(1L,"sender", "", "body");
		
		Assert.assertFalse(new Validator().isValidSms(message));
	}
	
	@Test
	public void testIsValidSmsWhenBodyEmpty(){
		
		Message message = new Message(1L,"sender", "destination", "");
		
		Assert.assertFalse(new Validator().isValidSms(message));
		
	}
	
	@Test
	public void testIsValidSmsWhenMessagemNull(){
		
		Assert.assertFalse(new Validator().isValidSms(null));
		
	}
	
}
