package my.com.smsreader;


public  class SMS {
	public String Sender;
	public String msgBody;
	
	public SMS(String sender,String msg){
		Sender= sender;
		msgBody=msg;
	}
	
	public String getSender(){
		return Sender;
	}
	public String getMsg(){
		return msgBody;
	}
}
