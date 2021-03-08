package com.encore.service;

import com.encore.util.MyDate;

public class Programmer {
	public String name;
	public MyDate birthDate;
	public String tech;
	public String company;	
	public NoteBook noteBook;	
	//////////////////////////////
	public Programmer(String name, MyDate birthDate, String tech, String company) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.tech = tech;
		this.company = company;
	}	
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}	
	public NoteBook getNoteBook() {
		return noteBook;
	}	
	public String getProgrammerInfo() {
		return name+","+birthDate.getDate()+","+tech+","+company;
	}	
}
