/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;


/**
 *
 * @author 54343
 */
    public class ServicioCurso {
       Scanner leer = new Scanner(System.in);
        Curso C1 = new Curso();
    
    public void cargarAlumnos(){
       
        String [] aux = new String [5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese nombre del alumno");
            aux[i] = leer.nextLine();
            
        }
        C1.setAlumnos(aux);
        
    }
    
    public Curso crearCurso(){
        
        System.out.println("Ingrese nombre del curso");
        C1.setNombreCurso(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de horas");
        C1.setCantidadHoras(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de días");
        C1.setCantidadDias(leer.nextInt());
        
        System.out.println("Ingrese el turno");
        C1.setTurno(leer.nextLine());
        
        System.out.println("Ingrese el precio por hora");
        C1.setPrecioHora(leer.nextInt());
        
        return C1;
        
    }
    
}   
    
    

