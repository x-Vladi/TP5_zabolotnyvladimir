package org.openxava.profesor;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.persona.*;

@Entity
public class Profesor extends Persona {
	
	@Column (length=6) @Id @Required
	public String identificador;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	

}
