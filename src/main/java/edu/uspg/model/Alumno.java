package edu.uspg.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class alumno {
	
	int carnet;
	String mombres;
	String apellidos; 
	String correo;
	
	
	public alumno() {
		super();
	}


	public alumno(int carnet, String mombres, String apellidos, String correo) {
		super();
		this.carnet = carnet;
		this.mombres = mombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}


	public int getCarnet() {
		return carnet;
	}

	@XmlAttribute
	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}


	public String getMombres() {
		return mombres;
	}

	@XmlAttribute
	public void setMombres(String mombres) {
		this.mombres = mombres;
	}


	public String getApellidos() {
		return apellidos;
	}

	@XmlElement
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	

}
