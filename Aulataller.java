package org.openxava.aulataller;

import javax.persistence.*;

import org.openxava.aulas.*;

@Entity
public class Aulataller extends Aulas {
	
	@Column (length=4) 
	public int cantidadbancos;

	public int getCantidadbancos() {
		return cantidadbancos;
	}

	public void setCantidadbancos(int cantidadbancos) {
		this.cantidadbancos = cantidadbancos;
	}
	
}
