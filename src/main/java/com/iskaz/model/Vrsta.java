package com.iskaz.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

@Entity
public class Vrsta {
	@Id
	@GeneratedValue
	private int vrstaId;
	private String nazivVrste;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "doznakaID")
	 
	private Doznaka doznaka;
	 
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "redovnaID")
	private Redovna redovna;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "uziciID")
	private Uzici uzici;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "njegaID")
	private Njega njega;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "proredaID")
	private Proreda proreda;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "stetaID")
	
	private Stete steta;

	private int sumaBruto;
	private int sumaNeto;
	private int neposjecenoBruto;
	private String primjedba;

	public Vrsta(String ime) {
		this.nazivVrste = ime;
	}

	public Vrsta() {
	 
	}

	public int getVrstaId() {
		return vrstaId;
	}

	public void setVrstaId(int vrstaId) {
		this.vrstaId = vrstaId;
	}

	public Stete getSteta() {
		return steta;
	}

	public void setSteta(Stete steta) {
		this.steta = steta;
	}

	public String getNazivVrste() {
		return nazivVrste;
	}

	public void setNazivVrste(String nazivVrste) {
		this.nazivVrste = nazivVrste;
	}

	public Doznaka getDoznaka() {
		return doznaka;
	}

	public void setDoznaka(Doznaka doznaka) {
		this.doznaka = doznaka;
	}

	public Njega getNjega() {
		return njega;
	}

	public void setNjega(Njega sjeca2) {
		this.njega =  sjeca2;
	}

	public Uzici getUzici() {
		return uzici;
	}

	public void setUzici(Uzici sjeca2) {
		this.uzici =   sjeca2;
	}

	public Proreda getProreda() {
		return proreda;
	}

	public void setProreda(Proreda proreda) {
		this.proreda = proreda;
	}

	public Redovna getRedovna() {
		return redovna;
	}

	public void setRedovna(Redovna redovna) {
		this.redovna =   redovna;
	}

 

	public int getSumaBruto() {
		return sumaBruto;
	}

	public void setSumaBruto(int sumaBruto) {
		this.sumaBruto = sumaBruto;
	}

	public int getSumaNeto() {
		return sumaNeto;
	}

	public void setSumaNeto(int sumaNeto) {
		this.sumaNeto = sumaNeto;
	}

	public int getNeposjecenoBruto() {
		return neposjecenoBruto;
	}

	public void setNeposjecenoBruto(int prelaz) {
		if (prelaz < 0) {
			this.neposjecenoBruto = 0;
			setPrimjedba(" manjak " + prelaz);
		} else {
			this.neposjecenoBruto = prelaz;
			setPrimjedba(" prelaz: " + prelaz);
		}
	}

	public String getPrimjedba() {
		return primjedba;
	}

	private void setPrimjedba(String primjedba) {
		this.primjedba = primjedba;
	}

	 
}