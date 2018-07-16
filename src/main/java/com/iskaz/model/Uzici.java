package com.iskaz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Uzici {
	@Id
	@GeneratedValue
	private int idUzici;
	private int brutoUzici;
	private double procenatUzici;
	private int netoUzici;
	private int tehnikaUzici;
	private int ogrevUzici;

	public Uzici() {
 
	}

	public int getIdUzici() {
		return idUzici;
	}

	public void setIdUzici(int idUzici) {
		this.idUzici = idUzici;
	}

	public int getBrutoUzici() {
		brutoUzici=(int) ((getNetoUzici()/getProcenatUzici ())*100);

		return brutoUzici;
	}

	public void setBrutoUzici(int brutoUzici) {
		this.brutoUzici = brutoUzici;
	}

	public int getOgrevUzici() {
		return ogrevUzici;
	}

	public void setOgrevUzici(int ogrevUzici) {
		this.ogrevUzici = ogrevUzici;
	}

	public int getTehnikaUzici() {
		return tehnikaUzici;
	}

	public void setTehnikaUzici(int tehnikaUzici) {
		this.tehnikaUzici = tehnikaUzici;
	}

	public int getNetoUzici() {
		netoUzici=ogrevUzici+tehnikaUzici;
		return netoUzici;
	}

	public void setNetoUzici(int netoUzici) {
		this.netoUzici = netoUzici;
	}

	public double getProcenatUzici() {
		return procenatUzici;
	}

	public void setProcenatUzici(double procenatUzici) {
		this.procenatUzici = procenatUzici;
	}

}
