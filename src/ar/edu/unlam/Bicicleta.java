package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Bicicleta extends Transporte implements Transportar{
	private Set<Paquete> paquetes;

	public Bicicleta(String ciudad, Double volumenPermitido, Double pesoPermitido) {
		super(ciudad, volumenPermitido, pesoPermitido);
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
		if(p.calcularVolumen()<volumenPermitido && p.getPeso()<pesoPermitido && this.paquetes.size()<=2) {
			this.paquetes.add(p);
		}
		
	}

	@Override
	public void transportarPaquete(Paquete p) {
		if(this.paquetes.contains(p)) {
	      if(getCiudad().equals("moron")) {
		     this.paquetes.remove(p);
	      }
		}

	}

	public Integer obtenerCantidadDePaquetes() {
		return this.paquetes.size();
	}

	

}
