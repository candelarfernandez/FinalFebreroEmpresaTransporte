package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Auto extends Transporte implements Transportar{
	private Set<Paquete> paquetes;

	public Auto(String ciudad, Double volumenPermitido, Double pesoPermitido) {
		super(ciudad, volumenPermitido, pesoPermitido);
		// TODO Auto-generated constructor stub
		this.paquetes= new HashSet<>();
	}


	public Set<Paquete> getPaquetes() {
		return paquetes;
	}


	public void setPaquetes(Set<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	public void cambiarDestinoSiElDelTransporteEsNulo(Paquete p) {
		if(ciudad == null) {
			setCiudad(p.getDestino());
		}
	}


	@Override
	public void agregarPaquete(Paquete p) {
		if(p.calcularVolumen()<volumenPermitido && p.getPeso()<pesoPermitido) {
			this.paquetes.add(p);
		}
		
	}

	@Override
	public void transportarPaquete(Paquete p) {
		if(this.paquetes.contains(p)) {
			if(ciudad.equals("moron") || ciudad.equals("san justo") || ciudad.equals("ramos mejia")) {
				this.paquetes.remove(p);
			}
		}
		
	}
	public Integer obtenerCantidadDePaquetes() {
		return this.paquetes.size();
	}

}
