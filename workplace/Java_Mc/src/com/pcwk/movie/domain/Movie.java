package com.pcwk.movie.domain;

import com.pcwk.cmn.DTO;

public class Movie extends DTO{
	
	private String title;//제목
	private	String genre;//장르
	//boolean available;//대출가능여부
	private int point;
	//Default 생성자
	public Movie() {
		super();
	}
	
	public Movie(String title, String genre, int point) {
		super();
		this.title = title;
		this.genre = genre;
		//this.available = available;
		this.point = point;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

//	public boolean isAvailable() {
//		return available;
//	}
//
//	public void setAvailable(boolean available) {
//		this.available = available;
//	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "제목  ▶▷ " + title + "\n장르  ▶▷ " + genre + "\n포인트 ▶▷ " + point;
	}
	
}










