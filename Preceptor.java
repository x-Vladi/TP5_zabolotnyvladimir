package org.openxava.preceptor;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Preceptor {

	@OneToMany (mappedBy="Preceptor")
	private collection <Persona> persona;
	
@Column (length= 20)
public String nombre;

@Column (length=15)
public String apellido;

@Required
public String cursoasignado;


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getCursoasignado() {
	return cursoasignado;
}

public void setCursoasignado(String cursoasignado) {
	this.cursoasignado = cursoasignado;
}

public collection<Persona> getPersona() {
	return persona;
}

public void setPersona(collection<Persona> persona) {
	this.persona = persona;
}


}
