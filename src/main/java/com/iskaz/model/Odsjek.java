package com.iskaz.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Odsjek {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idOdsjek")
	private int idOdsjek;
	@Column(name="brojOdsjeka")
	private String brojOdsjeka;
	@Column(name="GK")
	private int GK;
	@Column(name="knigaPremjerdbe")
	private String knigaPremjerdbe;
	@Column(name="knjigaDoznake")
	private String knjigaDoznake;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "listaVrsta")
	private Collection<Vrsta> listaVrsta = new ArrayList<>();

	public Odsjek() {
	}

	// za konstruktor koji nema doznaku(knjige)
	public Odsjek(String brojOdsjeka, int gK) {
		this.brojOdsjeka = brojOdsjeka;
		GK = gK;
		this.knigaPremjerdbe = "-";
		this.knjigaDoznake = "-";
	} public Odsjek(String brojOdsjeka)  {
		this.brojOdsjeka = brojOdsjeka;
		 
		this.knigaPremjerdbe = "-";
		this.knjigaDoznake = "-";
	}

	// konstruktor za registraciju odsjeka u kojem ima doznaka i otprema
	public Odsjek(String brojOdsjeka, int gK, String knigaPremjerdbe,
			String knjigaDoznake) {

		this.brojOdsjeka = brojOdsjeka;
		GK = gK;
		this.knigaPremjerdbe = knigaPremjerdbe;
		this.knjigaDoznake = knjigaDoznake;
	}

	 
	public int getGK() {
		return GK;
	}

	public void setGK(int gK) {
		GK = gK;
	}

	public String getBrojOdsjeka() {
		return brojOdsjeka;
	}

	public void setBrojOdsjeka(String brojOdsjeka) {
		this.brojOdsjeka = brojOdsjeka;
	}

	public String getKnigaPremjerdbe() {
		return knigaPremjerdbe;
	}

	public void setKnigaPremjerdbe(String knigaPremjerdbe) {
		this.knigaPremjerdbe = knigaPremjerdbe;
	}

	public String getKnjigaDoznake() {
		return knjigaDoznake;
	}

	public void setKnjigaDoznake(String knjigaDoznake) {
		this.knjigaDoznake = knjigaDoznake;
	}

	public Collection<Vrsta> getListaVrsta() {
		return listaVrsta;
	}

	public void setListaVrsta(Collection<Vrsta> listaVrsta) {
		this.listaVrsta = listaVrsta;
	}

	@Override
	public String toString() {
		return "Broj Odsjeka=" + brojOdsjeka
				+ ", GK=" + GK + ", knigaPremjerdbe=" + knigaPremjerdbe
				+ ", knjigaDoznake=" + knjigaDoznake + ", Vrste"
				+ listaVrsta + "]";
	}

}
