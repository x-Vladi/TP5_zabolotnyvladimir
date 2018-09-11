package org.openxava.gimnasio;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Gimnasio {

	@OneToMany  (mappedBy="Gimnasio")
	private collection <Alumno> alumno;
	
@Required
public String horariosgimnasio;

	public String getHorariosgimnasio() {
		return horariosgimnasio;
	}

	public void setHorariosgimnasio(String horariosgimnasio) {
		this.horariosgimnasio = horariosgimnasio;
	}

	public collection<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(collection<Alumno> alumno) {
		this.alumno = alumno;
	}

	
}
