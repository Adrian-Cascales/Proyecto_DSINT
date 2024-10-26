package dsi.mitologia;

import java.util.HashSet;		// TODO Hay que reescribir el equals y el hashcode
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Seres {
	private final String tiene_nombre;				// REQUERIDO
	private List<Capacidades> tiene_capacidad = new LinkedList<>();			// Es el �nico que debe ser una lista (pq puede tener varios objetos con mismas capacidades)
	private Set<Estados> tiene_condicion = new HashSet<>();		// REQUERIDO
	private Set<Dioses> tiene_enojo_de = new HashSet<>();
	private Set<Dioses> tiene_favor_de = new HashSet<>();
	private Set<Seres> tiene_localizado_a = new HashSet<>();
	private Set<Objetos> tiene_objeto = new HashSet<>();
	private Lugares ubicado_en;
	
	
	
	public Seres(String tiene_nombre, Set<Estados> tiene_condicion) {
		this.tiene_nombre = tiene_nombre;
		this.tiene_condicion = tiene_condicion;
	}
	
	
	// CAPACIDADES
	
	public List<Capacidades> getTiene_capacidad() {
		return tiene_capacidad;
	}
	
	public void setTiene_capacidad(List<Capacidades> tiene_capacidad) {
		this.tiene_capacidad = tiene_capacidad;
	}
	
	public void addCapacidad(Capacidades capacidad) {		// TODO REVISAR
		this.tiene_capacidad.add(capacidad);				// Aqu� permitimos a�adir capacidades repetidas (pq es una List)
	}
	
	public void removeCapacidad(Capacidades capacidad) {	// TODO REVISAR
		if ( this.tiene_capacidad.remove(capacidad) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Capacidad quitada
		}
		else {
			// No ten�a esa capacidad
		}
	}
	
	
	// CONDICIONES (estados)
	
	public List<Estados> getTiene_condicion() {
		return tiene_condicion;
	}
	
	public void setTiene_condicion(Set<Estados> tiene_condicion) {
		this.tiene_condicion = tiene_condicion;
	}
	
	public void addEstado(Estados estado) {		// TODO REVISAR
		this.tiene_condicion.add(estado);
	}
	
	public void removeEstado(Estados estado) {	// TODO REVISAR
		if ( this.tiene_condicion.remove(estado) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Estado quitado
		}
		else {
			// No ten�a ese estado
		}
	}
	
	
	// ENOJOS (enfados)
	
	public List<Dioses> getTiene_enojo_de() {
		return tiene_enojo_de;
	}
	
	public void setTiene_enojo_de(List<Dioses> tiene_enojo_de) {
		this.tiene_enojo_de = tiene_enojo_de;
	}
	
	public void addEnojo(Dioses dios) {		// TODO REVISAR
		this.tiene_enojo_de.add(dios);
	}
	
	public void removeEnojo(Dioses dios) {	// TODO REVISAR
		if ( this.tiene_enojo_de.remove(dios) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Dios enojado quitado
		}
		else {
			// No tenia ese Dios enojado
		}
	}
	
	
	// FAVORES (ayudas)
	
	public List<Dioses> getTiene_favor_de() {
		return tiene_favor_de;
	}
	
	public void setTiene_favor_de(List<Dioses> tiene_favor_de) {
		this.tiene_favor_de = tiene_favor_de;
	}
	
	public void addFavor(Dioses dios) {		// TODO REVISAR
		this.tiene_favor_de.add(dios);
	}
	
	public void removeFavor(Dioses dios) {	// TODO REVISAR
		if ( this.tiene_favor_de.remove(dios) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Dios que ayuda quitado
		}
		else {
			// No tenia esa ayuda
		}
	}
	
	
	// LOCALIZADO
	
	public List<Seres> getTiene_localizado_a() {
		return tiene_localizado_a;
	}
	
	public void setTiene_localizado_a(List<Seres> tiene_localizado_a) {
		this.tiene_localizado_a = tiene_localizado_a;
	}
	
	public void addLocalizado(Seres ser) {		// TODO REVISAR
		this.tiene_localizado_a.add(ser);
	}
	
	public void removeLocalizado(Seres ser) {	// TODO REVISAR
		if ( this.tiene_localizado_a.remove(ser) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Ser localizado quitado
		}
		else {
			// No ten�a a ese ser localizado
		}
	}
	
	
	// OBJETOS
	
	public List<Objetos> getTiene_objeto() {
		return tiene_objeto;
	}
	
	public void setTiene_objeto(List<Objetos> tiene_objeto) {
		this.tiene_objeto = tiene_objeto;
	}
	
	public void addObjeto(Objetos objeto) {		// TODO REVISAR
		this.tiene_objeto.add(objeto);
	}
	
	public void removeObjeto(Objetos objeto) {	// TODO REVISAR
		if ( this.tiene_objeto.remove(objeto) ) { 	// El "remove" ya comprueba si est� o no el objeto.
			// Objeto quitado
		}
		else {
			// No ten�a ese objeto
		}
	}
	
	
	// UBICACI�N
	
	public Lugares getUbicado_en() {
		return ubicado_en;
	}
	
	public void setUbicado_en(Lugares ubicado_en) {
		this.ubicado_en = ubicado_en;
	}
	
	
	// NOMBRE
	
	public String getTiene_nombre() {
		return tiene_nombre;
	}
	
	
}

