package org.openxava.persona;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;
import org.openxava.escuela.*;
import org.openxava.preceptor.*;

@Entity
@MappedSuperclass
public class Persona {
	
@ManyToOne
private Preceptor preceptor;
private Escuela escuela; 

	@OneToMany (mappedBy= "Persona")
	private collection <Aulas> aulas;
	
	@OneToMany (mappedBy= "Persona")
	private collection <Programas> programas;
	
@Column (length= 20) @Required
public String nombre;

@Column (length= 15) @Required
public String apellido;

@Email
public String mail;

@Column (length= 12)
public int celular;

@Column (length= 30) @Required
public String direccion; 

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

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public int getCelular() {
	return celular;
}

public void setCelular(int celular) {
	this.celular = celular;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public collection<Aulas> getAulas() {
	return aulas;
}

public void setAulas(collection<Aulas> aulas) {
	this.aulas = aulas;
}

public collection<Programas> getProgramas() {
	return programas;
}

public void setProgramas(collection<Programas> programas) {
	this.programas = programas;
}

public Preceptor getPreceptor() {
	return preceptor;
}

public void setPreceptor(Preceptor preceptor) {
	this.preceptor = preceptor;
}





}
