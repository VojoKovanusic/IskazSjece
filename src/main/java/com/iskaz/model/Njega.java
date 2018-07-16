package com.iskaz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Njega   {
	 
	 @Id
	 @GeneratedValue
		private int idNjega;
	    private int brutoNjega;
	    private double procenatNjega;
	    private int netoNjega;
	    private int tehnikaNjega;
		private int ogrevNjega;
		
			
		public Njega( ) {
			 
		}

		public int getIdNjega() {
			return idNjega;
		}

		public void setIdNjega(int idNjega) {
			this.idNjega = idNjega;
		}

		public int getBrutoNjega() {
			brutoNjega=(int) ((getNetoNjega()/getProcenatNjega())*100);
			return brutoNjega;
		}



		public void setBrutoNjega(int brutoNjega) {
			this.brutoNjega = brutoNjega;
		}



		public int getOgrevNjega() {
			return ogrevNjega;
		}



		public void setOgrevNjega(int ogrevNjega) {
			this.ogrevNjega = ogrevNjega;
		}



		public int getTehnikaNjega() {
			return tehnikaNjega;
		}



		public void setTehnikaNjega(int tehnikaNjega) {
			this.tehnikaNjega = tehnikaNjega;
		}



		public int getNetoNjega() {
			netoNjega=tehnikaNjega+ogrevNjega;
			return netoNjega;
		}



		public void setNetoNjega(int netoNjega) {
			this.netoNjega = netoNjega;
		}



		public double getProcenatNjega() {
			return procenatNjega;
		}



		public void setProcenatNjega(double procenatNjega) {
			this.procenatNjega = procenatNjega;
		}
	 
		 
}
