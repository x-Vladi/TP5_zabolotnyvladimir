package org.openxava.materiastaller;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.programas.*;

@Entity
public class Materiastaller extends Programas {
	@Column (length=25) @Required
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
