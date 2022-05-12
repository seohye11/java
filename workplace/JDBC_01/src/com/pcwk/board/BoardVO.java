package com.pcwk.board;

import com.pcwk.cmn.DTO;

public class BoardVO extends DTO {

	private int seq       ;
	private String title     ;
	private String contents  ;
	private int read_cnt  ;
	private String reg_dt	 ;
	private String reg_id	 ;
	private String mod_dt	 ;
	private String mod_id	 ;
	
	public BoardVO() {}

	public BoardVO(int seq, String title, String contents, int read_cnt, String reg_dt, String reg_id, String mod_dt,
			String mod_id) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.read_cnt = read_cnt;
		this.reg_dt = reg_dt;
		this.reg_id = reg_id;
		this.mod_dt = mod_dt;
		this.mod_id = mod_id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getRead_cnt() {
		return read_cnt;
	}

	public void setRead_cnt(int read_cnt) {
		this.read_cnt = read_cnt;
	}

	public String getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getMod_dt() {
		return mod_dt;
	}

	public void setMod_dt(String mod_dt) {
		this.mod_dt = mod_dt;
	}

	public String getMod_id() {
		return mod_id;
	}

	public void setMod_id(String mod_id) {
		this.mod_id = mod_id;
	}

	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", contents=" + contents + ", read_cnt=" + read_cnt
				+ ", reg_dt=" + reg_dt + ", reg_id=" + reg_id + ", mod_dt=" + mod_dt + ", mod_id=" + mod_id
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
