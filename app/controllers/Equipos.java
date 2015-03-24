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
    
    
    public static void editar(Long id){
    	Equipo equipo= Equipo.findById(id);//buscando el equipo a editar
    
    	render(equipo);
    }
    
    public static void actualizarEquipo(Long id, String nombre, String ciudad, String seudonimo, int añoFundacion){
    	
    	Equipo equipo =Equipo.findById(id);
    	equipo.nombre=nombre;
    	equipo.ciudad=ciudad;
    	equipo.seudonimo=seudonimo;
    	equipo.añoFundacion=añoFundacion;
    	equipo.save();
    	redirect("/equipos");
    	
    	
    	
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



















