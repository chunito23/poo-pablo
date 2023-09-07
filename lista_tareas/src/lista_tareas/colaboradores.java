/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tareas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author domin
 */
public class colaboradores {
    private String nombre;
    List<clase_tarea> listaTareasFinalizadas = new ArrayList<>();
    
    
    public String getNombre() {
        return nombre;
    }
    
    public colaboradores(String nombre){
        this.nombre = nombre;
    }
    
    public void registrarTarea(clase_tarea tarea,LocalDate fechaFinalizacion){
        tarea.setFechaFinalizacion(fechaFinalizacion);
        listaTareasFinalizadas.add(tarea);
    }
    
    public void mostrarListaColaboradores(){
        for(int i = 0;i<listaTareasFinalizadas.size();i++){
            listaTareasFinalizadas.get(i).mostrar();
            System.out.println("fecha de finalizacion: " + listaTareasFinalizadas.get(i).getFechaVencimiento());
        }
    }
}
