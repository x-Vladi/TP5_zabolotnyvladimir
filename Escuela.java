package org.openxava.escuela;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity

public class Escuela {
@OneToMany (mappedBy="Escuela")
private collection <Persona> persona;

@OneToMany (mappedBy="Escuela")
private collection <Direccion> direccion;


@Column (length=20)
public String nombre;

@Column (length=40)
public String direccion;

@Column (length=20)
public String lugar;

@Column (length= 12) @Required
public int telefono;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getLugar() {
	return lugar;
}

public void setLugar(String lugar) {
	this.lugar = lugar;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public collection<Persona> getPersona() {
	return persona;
}

public void setPersona(collection<Persona> persona) {
	this.persona = persona;
}

public void setDireccion(collection<Direccion> direccion) {
	this.direccion = direccion;
}


}
