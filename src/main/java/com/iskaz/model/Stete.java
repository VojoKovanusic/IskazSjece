package com.iskaz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stete {

	@Id
	@GeneratedValue
	private int idStete;
	private int brutoStete;
	private double procenatStete;
	private int netoStete;
	private int tehnikaStete;
	private int ogrevStete;

	public Stete() {
 	}

	public int getIdStete() {
		return idStete;
	}

	public void setIdStete(int idStete) {
		this.idStete = idStete;
	}

	public int getBrutoStete() {
		brutoStete=(int) ((getNetoStete()/getProcenatStete ())*100);

		return brutoStete;
	}

	public void setBrutoStete(int brutoStete) {
		this.brutoStete = brutoStete;
	}

	public int getOgrevStete() {
		return ogrevStete;
	}

	public void setOgrevStete(int ogrevStete) {
		this.ogrevStete = ogrevStete;
	}

	public int getTehnikaStete() {
		return tehnikaStete;
	}

	public void setTehnikaStete(int tehnikaStete) {
		this.tehnikaStete = tehnikaStete;
	}

	public int getNetoStete() {
		netoStete=ogrevStete+tehnikaStete;

		return netoStete;
	}

	public void setNetoStete(int netoStete) {
		this.netoStete = netoStete;
	}

	public double getProcenatStete() {
		return procenatStete;
	}

	public void setProcenatStete(double procenatStete) {
		this.procenatStete = procenatStete;
	}

}
