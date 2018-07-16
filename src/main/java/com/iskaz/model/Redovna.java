package com.iskaz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Redovna {
	@Id
	@GeneratedValue
	private int idRedovna;
	private int brutoRedovna;
	private double procenatRedovna;
	private int netoRedovna;
	private int tehnikaRedovna;
	private int ogrevRedovna;

	public Redovna() {
	}

	public int getIdRedovna() {
		return idRedovna;
	}

	public void setIdRedovna(int idRedovna) {
		this.idRedovna = idRedovna;
	}

	public int getBrutoRedovna() {
		brutoRedovna = (int) ((getNetoRedovna() / getProcenatRedovna()) * 100);
		return brutoRedovna;
	}

	public void setBrutoRedovna(int brutoRedovna) {
		this.brutoRedovna = brutoRedovna;
	}

	public int getOgrevRedovna() {
		return ogrevRedovna;
	}

	public void setOgrevRedovna(int ogrevRedovna) {
		this.ogrevRedovna = ogrevRedovna;
	}

	public int getTehnikaRedovna() {
		return tehnikaRedovna;
	}

	public void setTehnikaRedovna(int tehnikaRedovna) {
		this.tehnikaRedovna = tehnikaRedovna;
	}

	public int getNetoRedovna() {
		netoRedovna = getTehnikaRedovna() + getOgrevRedovna();
		return netoRedovna;

	}

	public void setNetoRedovna(int netoRedovna) {
		this.netoRedovna = netoRedovna;
	}

	public double getProcenatRedovna() {
		return procenatRedovna;
	}

	public void setProcenatRedovna(double procenatRedovna) {
		this.procenatRedovna = procenatRedovna;
	}

}
