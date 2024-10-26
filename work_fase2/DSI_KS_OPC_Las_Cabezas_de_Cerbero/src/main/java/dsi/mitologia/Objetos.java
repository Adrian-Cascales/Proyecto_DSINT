package dsi.mitologia;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Objetos {
	private final String tiene_nombre;	// REQUERIDO
	private EstadoObjeto tiene_estado;	// REQUERIDO // TODO Este estado es distinto del estado de los Seres (yo creo que habr�a que poner un enum)
	private Seres en_manos_de;
	private List<Capacidades> tiene_capacidad = new LinkedList<>();	// REQUERIDO
	
	
	
	public Objetos(String tiene_nombre, EstadoObjeto tiene_estado, List<Capacidades> tiene_capacidad) {
		this.tiene_nombre = tiene_nombre;
		this.tiene_estado = tiene_estado;
		this.tiene_capacidad = tiene_capacidad;
	}


	// ESTADO

	public EstadoObjeto getTiene_estado() {
		return tiene_estado;
	}

	public void setTiene_estado(EstadoObjeto tiene_estado) {
		this.tiene_estado = tiene_estado;
	}


	
	// EN MANOS DE

	public Seres getEn_manos_de() {
		return en_manos_de;
	}

	public void setEn_manos_de(Seres en_manos_de) {
		this.en_manos_de = en_manos_de;
	}
	
	public void removeEn_manos_de() {	// TODO REVISAR
		this.en_manos_de = null;	// Lo he puesto por si alg�n objeto se destruye, no est� en manos de nadie (desaparece)
	}

	

	// CAPACIDADES

	public List<Capacidades> getTiene_capacidad() {
		return tiene_capacidad;
	}

	public void setTiene_capacidad(List<Capacidades> tiene_capacidad) {
		this.tiene_capacidad = tiene_capacidad;
	}
	
	public void removeAllCapacidad() {	// TODO REVISAR
		this.tiene_capacidad = null;	// Lo he puesto por si alg�n objeto se destruye, no tiene ninguna capacidad.
	}

	
	// NOMBRE

	public String getTiene_nombre() {
		return tiene_nombre;
	}
	
	
	
	
}
