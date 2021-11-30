package com.example.demo.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personaje")
public class Persona {
	
	@Id
	@Column(name = "id_persona")
	private float idpersona;
	@Column(name = "nombre")
	private String nombrePersona;
	@Column(name = "apellido")
	private String apellidoPersona;
	@Column(name = "direccion")
	private String direccionPersona;
	@Column(name = "telefono")
	private String telefonoPersona;	
	
	public Persona() {
		
	}
	public Persona(float idpersona, String nombrePersona, String apellidoPersona, String direccionPersona,
			String telefonoPersona) {
		
		this.idpersona = idpersona;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.direccionPersona = direccionPersona;
		this.telefonoPersona = telefonoPersona;
	}
	public float getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(float idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidoPersona() {
		return apellidoPersona;
	}
	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}
	public String getDireccionPersona() {
		return direccionPersona;
	}
	public void setDireccionPersona(String direccionPersona) {
		this.direccionPersona = direccionPersona;
	}
	public String getTelefonoPersona() {
		return telefonoPersona;
	}
	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}
	
	

}
