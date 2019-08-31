package jums;
import java.io.Serializable;

public class UserDataBeans implements Serializable {
	private String name;
	private String year;
	private String month;
	private String day;
	private String type;
	private String tell;
	private String comment;

	public UserDataBeans() {}

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getyear() {
		return this.year;
	}

	public void setyear(String year) {
		this.year = year;
	}
	public String getmonth() {
		return this.month;
	}

	public void setmonth(String month) {
		this.month = month;
	}

	public String getday() {
		return this.day;
	}

	public void setday(String day) {
		this.day = day;
	}

	public String gettype() {
		return this.type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String gettell() {
		return this.tell;
	}

	public void settell(String tell) {
		this.tell = tell;
	}

	public String getcomment() {
		return this.comment;
	}

	public void setcomment(String comment) {
		this.comment = comment;
	}
}