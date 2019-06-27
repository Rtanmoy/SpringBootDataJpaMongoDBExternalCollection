package com.app.document;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;

public class Book {
	@Id
	private String id;
	
	private String bookCode;
	private String bookAuth;
	private Double bookCost;
	
	private List<String> codes;
	private String[] grades;
	
	private Map<String,String> forms;
	private Properties models;
	public Book() {
		super();
	}
	public Book(String bookCode, String bookAuth, Double bookCost, List<String> codes, String[] grades,
			Map<String, String> forms, Properties models) {
		super();
		this.bookCode = bookCode;
		this.bookAuth = bookAuth;
		this.bookCost = bookCost;
		this.codes = codes;
		this.grades = grades;
		this.forms = forms;
		this.models = models;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	public List<String> getCodes() {
		return codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}
	public String[] getGrades() {
		return grades;
	}
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	public Map<String, String> getForms() {
		return forms;
	}
	public void setForms(Map<String, String> forms) {
		this.forms = forms;
	}
	public Properties getModels() {
		return models;
	}
	public void setModels(Properties models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookCode=" + bookCode + ", bookAuth=" + bookAuth + ", bookCost=" + bookCost
				+ ", codes=" + codes + ", grades=" + Arrays.toString(grades) + ", forms=" + forms + ", models=" + models
				+ "]";
	}
	
}
