package br.com.operadora.sms.dominio;

public class Message {
	
	private Long id;
	private String sender;
	private String destination;
	private String body;
	
	public Message(Long id, String sender, String destination, String body) {
		this.id = id;
		this.sender = sender;
		this.destination = destination;
		this.body = body;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
