package ar.edu.unlam;

public abstract class Transporte {
	protected String ciudad;
	protected Double volumenPermitido;
	protected Double pesoPermitido;
	
	public Transporte(String ciudad, Double volumenPermitido, Double pesoPermitido) {
		super();
		this.ciudad = ciudad;
		this.volumenPermitido = volumenPermitido;
		this.pesoPermitido = pesoPermitido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

}
