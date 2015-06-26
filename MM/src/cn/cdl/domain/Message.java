package cn.cdl.domain;

import javax.sql.rowset.serial.SerialClob;

public class Message {
	private String messageid;
	private String usename;
	private String title;
	private SerialClob messagetext;
	public String getMessageid() {
		return messageid;
	}
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public SerialClob getMessagetext() {
		return messagetext;
	}
	public void setMessagetext(SerialClob messagetext) {
		this.messagetext = messagetext;
	}
}