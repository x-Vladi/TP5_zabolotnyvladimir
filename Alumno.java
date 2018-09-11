package org.openxava.alumno;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.gimnasio.*;
import org.openxava.persona.*;

@Entity
public class Alumno extends Persona {
	@ManyToOne
	
	private Gimnasio gimnasio;
	
@Column (length=6) @Id @Required
	public String identificador;

public String getIdentificador() {
	return identificador;
}

public void setIdentificador(String identificador) {
	this.identificador = identificador;
}

public Gimnasio getGimnasio() {
	return gimnasio;
}

public void setGimnasio(Gimnasio gimnasio) {
	this.gimnasio = gimnasio;
}


	
}
