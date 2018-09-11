package org.openxava.programas;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.persona.*;

@Entity
@MappedSuperclass
public class Programas {
	@ManyToOne
	private Persona persona;
	
@Column (length= 35) @Required
	public String nombre;
@Column (length= 15) @Required
	public String curso;
@Column (length= 4)
	public int ciclo;
@Column (length= 20 )
	public String profesor;


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public int getCiclo() {
	return ciclo;
}
public void setCiclo(int ciclo) {
	this.ciclo = ciclo;
}
public String getProfesor() {
	return profesor;
}
public void setProfesor(String profesor) {
	this.profesor = profesor;
}
public Persona getPersona() {
	return persona;
}
public void setPersona(Persona persona) {
	this.persona = persona;
}


}
