package com.nt;

public class Student {
		private int ID;
		private String ADDRESS;
		private String EMAIL;
		private String NAME;
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getADDRESS() {
			return ADDRESS;
		}
		public void setADDRESS(String aDDRESS) {
			ADDRESS = aDDRESS;
		}
		public String getEMAIL() {
			return EMAIL;
		}
		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}
		public String getNAME() {
			return NAME;
		}
		public void setNAME(String nAME) {
			NAME = nAME;
		}
		@Override
		public String toString() {
			return "Student [ID=" + ID + ", ADDRESS=" + ADDRESS + ", EMAIL=" + EMAIL + ", NAME=" + NAME + "]";
		}
		
		
		
		
}
