package com.cg.mts.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Admission {
	@Id
	int admid;
	int courseid;
	int appid;
	LocalDate admdate;
	public int getAdmid() {
		return admid;
	}
	public void setAdmid(int admid) {
		this.admid = admid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public LocalDate getAdmdate() {
		return admdate;
	}
	public void setAdmdate(LocalDate admdate) {
		this.admdate = admdate;
	}
	public Admission(int admid, int courseid, int appid, LocalDate admdate) {
		super();
		this.admid = admid;
		this.courseid = courseid;
		this.appid = appid;
		this.admdate = admdate;
	}
}
