package org.openxava.materiasteoria;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.programas.*;

@Entity
public class Materiasteoria extends Programas {

	@Column (length=30) @Required
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
