package com.example.demo.ex4;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ClassEx4 
{
	private int id;
	private String name;
	@JsonIgnore
	private String page;
	
	public ClassEx4() {}

	public ClassEx4(int id, String name, String page) {
		super();
		this.id = id;
		this.name = name;
		this.page = page;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}