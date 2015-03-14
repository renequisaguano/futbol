package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Equipo extends Model {
	
	String nombre;
	String ciudad;
	String seudonimo;
	int añoFundacion;

	
	
	public Equipo(String nombre, String ciudad, String seudonimo,int añoFundacion) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.seudonimo = seudonimo;
		this.añoFundacion = añoFundacion;

	}

	//Constructor
	
}
