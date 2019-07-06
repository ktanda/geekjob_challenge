package org.camp.servlet;

import java.io.Serializable;
import java.util.Date;

public class ResultData implements Serializable {
	private Date d;
	private String luck;

	public ResultData() {}

	public Date getD() {
		return this.d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public String getLuck() {
		return this.luck;
	}

	public void setLuck(String luck) {
		this.luck = luck;
	}
}
