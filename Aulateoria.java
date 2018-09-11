package org.openxava.aulateoria;

import javax.persistence.*;

import org.openxava.aulas.*;

@Entity
public class Aulateoria extends Aulas{
	@Column (length=10) 
	public String cantidadcomputadoras;

	public String getCantidadcomputadoras() {
		return cantidadcomputadoras;
	}

	public void setCantidadcomputadoras(String cantidadcomputadoras) {
		this.cantidadcomputadoras = cantidadcomputadoras;
	}
	
}
