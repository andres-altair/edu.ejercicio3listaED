package Dtos;

public class meses {
	String mes = "";
	int nmes = 1213232;
	
	public meses(String mes, int nmes) 
	{
		super();
		this.mes = mes;
		this.nmes = nmes;
	}
	
	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getNmes() {
		return nmes;
	}

	public void setNmes(int nmes) {
		this.nmes = nmes;
	}
	
	
	
	@Override
	public String toString() {
		return "meses [mes=" + mes + ", nmes=" + nmes + "]";
	}

}
