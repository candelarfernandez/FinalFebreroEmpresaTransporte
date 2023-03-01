package ar.edu.unlam;

import java.util.Objects;

public class Paquete {
	private Double alto;
	private Double ancho;
	private Double profundidad;
	private Double peso;
	private String destino;

	public Paquete(Double alto, Double ancho, Double profundidad, Double peso) {
		// TODO Auto-generated constructor stub
		this.alto=alto;
		this.ancho=ancho;
		this.profundidad=profundidad;
		this.peso=peso;
	}
	public Double calcularVolumen() {
		return alto*ancho*profundidad;
	}
	public Double getAlto() {
		return alto;
	}
	public void setAlto(Double alto) {
		this.alto = alto;
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	public Double getProfundidad() {
		return profundidad;
	}
	public void setProfundo(Double profundidad) {
		this.profundidad = profundidad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho, destino, peso, profundidad);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return Objects.equals(alto, other.alto) && Objects.equals(ancho, other.ancho)
				&& Objects.equals(destino, other.destino) && Objects.equals(peso, other.peso)
				&& Objects.equals(profundidad, other.profundidad);
	}
	@Override
	public String toString() {
		return "Paquete [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", peso=" + peso
				+ ", destino=" + destino + "]";
	}

}
