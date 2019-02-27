package com.svmapp.model;

import java.sql.Date;

public class Japaflow extends Entity {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String booklet_language;
	private String booklet_id;
	private Date date;
	private Long count;

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getBooklet_language() {
		return booklet_language;
	}

	public void setBooklet_language(String booklet_language) {
		this.booklet_language = booklet_language;
	}

	public String getBooklet_id() {
		return booklet_id;
	}

	public void setBooklet_id(String booklet_id) {
		this.booklet_id = booklet_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
