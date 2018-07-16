package com.iskaz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

@Entity
public class Doznaka {
	@Id @GeneratedValue
	private int idDoznaka;
 
private	int bruto;
private double procenat ;
private	int neto;
private	int tehnika;
private	int ogrev;

	public Doznaka() { 
}

	public int getBruto() {
		bruto=(int) ((getNeto()/getProcenat ())*100);
 		return bruto;
	}

	public void setBruto(int bruto) {
		this.bruto=bruto;
	}

	public int getNeto() {
		neto=ogrev+tehnika;
		return neto;
	}

	public void setNeto(int neto) {
		this.neto = tehnika+ogrev;
	}

	public int getOgrev() {
		return ogrev;
	}

	public void setOgrev(int ogrev) {
		this.ogrev = ogrev;
	}

	public int getTehnika() {
		return tehnika;
	}

	public void setTehnika(int tehnika) {
		this.tehnika = tehnika;
	}

	public double getProcenat() {
		return procenat;
	}

	public void setProcenat(int procenat) {
		this.procenat = procenat;
	}

}
