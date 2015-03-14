package controllers;

import java.util.List;

import models.Equipo;
import play.mvc.*;

public class Equipos extends Controller {

    public static void index() {
    	
    	List<Equipo> equipos=Equipo.findAll();
        render(equipos);
    }
    
    public static void formulario(){
    	render();
    }
    
    
    public static void editar(){
    	render();
    }
    
    public static void guardarEquipo(String nombre, String ciudad, String seudonimo, int añoFundacion){
    	//Instanciando un objeto
    	Equipo equi=new Equipo(nombre,ciudad,seudonimo,añoFundacion);
    	//guardando
    	equi.save();
    	
    	//volver a Equipo
    	redirect("/equipos");
    	
    }
    
    public static void eliminarEquipo(Long id){
    	
    	Equipo equi=Equipo.findById(id);
    	equi.delete();
    	redirect("/equipos");
    	
    }
    
    
    
    
    

}



















