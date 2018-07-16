package com.iskaz.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Odjel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//@Column(name="idOdjela")
	private int id_odjela;
	@Min(value=1, message="ne moze biti br odjela 0 ili negativan")
	@Column(name="brojOdjela")
	private int brojOdjela;

	@OneToMany  (fetch=FetchType.EAGER, cascade=CascadeType.ALL ) 
	// @JoinTable(name = "odsjeci")
	@Column(name="listaOdsjeka")
	private Collection<Odsjek> listaOdsjeka = new ArrayList<>();

	public Odjel() {
		 
	}
	public Odjel(int br) {
		brojOdjela=br;
	}
	public int getId_odjela() {
		return id_odjela;
	}

	public void setId_odjela(int id_odjela) {
		this.id_odjela = id_odjela;
	}

	public int getBrojOdjela() {
		return brojOdjela;
	}

	public void setBrojOdjela(int brojOdjela) {
		this.brojOdjela = brojOdjela;
	}

	public Collection<Odsjek> getListaOdsjeka() {
		return listaOdsjeka;
	}

	public void setListaOdsjeka(Collection<Odsjek> listaOdsjeka) {
		this.listaOdsjeka = listaOdsjeka;
	}

	@Override
	public String toString() {
		return "Odjel [id_odjela=" + id_odjela + ", brojOdjela=" + brojOdjela + ", listaOdsjeka=" + listaOdsjeka + "]";
	}

	 

	 
}
