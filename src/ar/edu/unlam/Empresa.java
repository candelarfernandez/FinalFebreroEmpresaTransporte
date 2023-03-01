package ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private List<Transporte> transportes;

	public Empresa(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.transportes= new ArrayList<>();
	}

	public List<Transporte> getTransportes() {
		return transportes;
	}

	public void setTransportes(List<Transporte> transportes) {
		this.transportes = transportes;
	}

	public void agregarTransporte(Transporte t) {
		this.transportes.add(t);
	}
	public Integer obtenerCantidadDeTransportes() {
		return this.transportes.size();
	}

}
