package org.openxava.aulas;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.persona.*;

@Entity
@MappedSuperclass
public class Aulas {
	@ManyToOne
	private Persona persona;
	
@Column (length= 4) @Required @Id
	public String id;
@Column (length= 4)
	public String ciclo;
@Column (length= 20)	
	public String nombre;
@Column (length= 15)
	public String curso;
@Column (length= 50)	
	public String estado;


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCiclo() {
	return ciclo;
}
public void setCiclo(String ciclo) {
	this.ciclo = ciclo;
}
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
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
	
public Persona getPersona() {
	return persona;
}
public void setPersona(Persona persona) {
	this.persona = persona;
}

}
