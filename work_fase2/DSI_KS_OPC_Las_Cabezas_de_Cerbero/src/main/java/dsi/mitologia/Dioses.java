package dsi.mitologia;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Dioses extends Seres {
	
	private Set<Seres> da_favor_a = new HashSet<>();
	private Set<Seres> esta_enojado_con = new HashSet<>();
	
	public Dioses(String tiene_nombre, Set<Estados> tiene_condicion) {
		super(tiene_nombre, tiene_condicion);
		this.addCapacidad("INMORTAL");;		// TODO Cuando tenga la clase "Capacidades" creada
	}
}
