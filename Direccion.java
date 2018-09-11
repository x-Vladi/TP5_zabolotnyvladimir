package org.openxava.direccion;

import javax.persistence.*;

import org.openxava.escuela.*;

@Entity
public class Direccion {
@ManyToOne
private Escuela escuela;

@Column (length= 7)
public int cantidaddirectivos;

public int getCantidaddirectivos() {
	return cantidaddirectivos;
}

public void setCantidaddirectivos(int cantidaddirectivos) {
	this.cantidaddirectivos = cantidaddirectivos;
}

public Escuela getEscuela() {
	return escuela;
}

public void setEscuela(Escuela escuela) {
	this.escuela = escuela;
}

}
