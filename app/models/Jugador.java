package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Jugador extends Model {
	
	public String nombre;
	public String apellido;
	public int edad;
	//para subir archivos, en este caso una imagen
	public Blob foto;
	public String pais;
	
	@ManyToOne
	public Equipo equipo;
	
    
}
