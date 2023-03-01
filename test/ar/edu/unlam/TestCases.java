package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void crearEmpresaYAgregarTransportes() {
		final double volumenBici = 0.125;
		final double pesoBici=15.0;
		final double volumenAuto=2.0;
		final double pesoAuto=500.0;
		final double volumenCamion=20.0;
		final double pesoCamion=16256.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte b = new Bicicleta("moron", volumenBici, pesoBici);
		Transporte a = new Auto("san justo", volumenAuto, pesoAuto);
		Transporte c = new Camion("ramos mejia", volumenCamion, pesoCamion);
		e.agregarTransporte(b);
		e.agregarTransporte(a);
		e.agregarTransporte(c);
		assertEquals((Integer)3, e.obtenerCantidadDeTransportes());
	}
	@Test
	public void agregarPaqueteAUnaBici() {
		final double volumenBici = 0.125;
		final double pesoBici=15.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte b = new Bicicleta("moron", volumenBici, pesoBici);
		Paquete p = new Paquete(0.2,0.5,0.3,12.5);
		e.agregarTransporte(b);
		((Bicicleta) b).agregarPaquete(p);
		assertEquals((Integer)1, ((Bicicleta) b).obtenerCantidadDePaquetes());
	}
	@Test
	public void agregarPaqueteAUnAuto() {
		final double volumenAuto=2.0;
		final double pesoAuto=500.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte a = new Auto("san justo", volumenAuto, pesoAuto);
		Paquete p = new Paquete(1.2,0.5,1.3,30.5);
		e.agregarTransporte(a);
		((Auto) a).agregarPaquete(p);
		assertEquals((Integer)1, ((Auto) a).obtenerCantidadDePaquetes());
	}

	@Test
	public void agregarPaqueteAUnCamion() {
		final double volumenCamion=20.0;
		final double pesoCamion=16256.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte c = new Camion("ramos mejia", volumenCamion, pesoCamion);
		Paquete p = new Paquete(1.2,5.5,2.3,500.5);
		e.agregarTransporte(c);
		((Camion) c).agregarPaquete(p);
		assertEquals((Integer)1, ((Camion) c).obtenerCantidadDePaquetes());
	}
	@Test
	public void transportarPaqueteEnCamion() {
		final double volumenCamion=20.0;
		final double pesoCamion=16256.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte c = new Camion("ramos mejia", volumenCamion, pesoCamion);
		Paquete p = new Paquete(1.2,5.5,2.3,500.5);
		e.agregarTransporte(c);
		((Camion) c).agregarPaquete(p);
		((Camion) c).transportarPaquete(p);
		assertEquals((Integer)0, ((Camion) c).obtenerCantidadDePaquetes());
	}
	@Test
	public void transportarPaqueteEnAuto() {
		final double volumenAuto=2.0;
		final double pesoAuto=500.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte a = new Auto("san justo", volumenAuto, pesoAuto);
		Paquete p = new Paquete(1.2,0.5,1.3,30.5);
		e.agregarTransporte(a);
		((Auto) a).agregarPaquete(p);
		((Auto) a).transportarPaquete(p);
		assertEquals((Integer)0, ((Auto) a).obtenerCantidadDePaquetes());
	}
	@Test
	public void transportarPaqueteEnBicicleta() {
		final double volumenBici = 0.125;
		final double pesoBici=15.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte b = new Bicicleta("moron", volumenBici, pesoBici);
		Paquete p = new Paquete(0.2,0.5,0.3,12.5);
		e.agregarTransporte(b);
		((Bicicleta) b).agregarPaquete(p);
		((Bicicleta) b).transportarPaquete(p);
		assertEquals((Integer)0, ((Bicicleta) b).obtenerCantidadDePaquetes());
	}
	@Test
	public void transportarPaqueteEnBicicletaConDestinoDePaquete() {
		String destino = "moron";
		final double volumenBici = 0.125;
		final double pesoBici=15.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte b = new Bicicleta(null, volumenBici, pesoBici);
		Paquete p = new Paquete(0.2,0.5,0.3,12.5);
		e.agregarTransporte(b);
		((Bicicleta) b).agregarPaquete(p);
		p.setDestino(destino);
		((Bicicleta) b).cambiarDestinoSiElDelTransporteEsNulo(p);
		((Bicicleta) b).transportarPaquete(p);	
		assertEquals("moron", b.getCiudad());
	}
	@Test
	public void transportarPaqueteEnAutoConDestinoDePaquete() {
		String destino = "san justo";
		final double volumenAuto=2.0;
		final double pesoAuto=500.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte a = new Auto(null, volumenAuto, pesoAuto);
		Paquete p = new Paquete(1.2,0.5,1.3,30.5);
		e.agregarTransporte(a);
		((Auto) a).agregarPaquete(p);
		p.setDestino(destino);
		((Auto) a).cambiarDestinoSiElDelTransporteEsNulo(p);
		((Auto) a).transportarPaquete(p);
		assertEquals("san justo", ((Auto) a).ciudad);
	}
	@Test
	public void transportarPaqueteEnCamionConDestinoDePaquete() {
		String destino = "ramos mejia";
		final double volumenCamion=20.0;
		final double pesoCamion=16256.0;
		Empresa e = new Empresa("empresaTransporte");
		Transporte c = new Camion(null, volumenCamion, pesoCamion);
		Paquete p = new Paquete(1.2,5.5,2.3,500.5);
		e.agregarTransporte(c);
		((Camion) c).agregarPaquete(p);
		p.setDestino(destino);
		((Camion) c).cambiarDestinoSiElDelTransporteEsNulo(p);
		((Camion) c).transportarPaquete(p);
		assertEquals("ramos mejia", ((Camion)c).ciudad);
	}


}
