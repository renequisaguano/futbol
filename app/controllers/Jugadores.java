package controllers;

import java.util.List;

import models.Equipo;
import models.Jugador;
import play.mvc.*;

public class Jugadores extends Controller {

    public static void index() {
        render();
    }
    
    
    public static void nuevo(){
    	List<Equipo> equipos=Equipo.findAll();
    	
    	render(equipos);
    }
    
    public static void guardarJugador(Jugador j){
    	j.save();
    	index();
    }

}
