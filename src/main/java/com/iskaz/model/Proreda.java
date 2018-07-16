package com.iskaz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Proreda   {
	 @Id
	 @GeneratedValue
		private int idProreda;
	private int brutoProreda;
	private double procenatProreda;
	private int netoProreda;
	private int tehnikaProreda;
		private int ogrevProreda;
		

	public Proreda() {
		super();
	}


	public int getIdProreda() {
		return idProreda;
	}


	public void setIdProreda(int idProreda) {
		this.idProreda = idProreda;
	}


	public int getBrutoProreda() {
		brutoProreda=(int) ((getNetoProreda()/getProcenatProreda ())*100);
		return brutoProreda;
	}


	public void setBrutoProreda(int brutoProreda) {
		this.brutoProreda = brutoProreda;
	}


	public int getOgrevProreda() {
		return ogrevProreda;
	}


	public void setOgrevProreda(int ogrevProreda) {
		this.ogrevProreda = ogrevProreda;
	}


	public int getTehnikaProreda() {
		return tehnikaProreda;
	}


	public void setTehnikaProreda(int tehnikaProreda) {
		this.tehnikaProreda = tehnikaProreda;
	}


	public int getNetoProreda() {
		netoProreda=ogrevProreda+tehnikaProreda;

		return netoProreda;
	}


	public void setNetoProreda(int netoProreda) {
		this.netoProreda = netoProreda;
	}


	public double getProcenatProreda() {
		return procenatProreda;
	}


	public void setProcenatProreda(double procenatProreda) {
		this.procenatProreda = procenatProreda;
	}
 
}
