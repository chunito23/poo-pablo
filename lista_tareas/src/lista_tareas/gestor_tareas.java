/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tareas;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author domin
 */
public class gestor_tareas {
    List<clase_tarea> tareas = new ArrayList<>();
    List<colaboradores> colaboradores = new ArrayList<>();
    
    public void agregarColaboradores(String nombre){
        colaboradores colaborador = new colaboradores(nombre);
        colaboradores.add(colaborador);
    }
    
    public void agregar_tarea(String nombre,String description,LocalDate fechaVencimiento,LocalDate fechaRecordatorio){
        clase_tarea tarea = new clase_tarea(nombre, description, fechaVencimiento, fechaRecordatorio);
        tareas.add(tarea);
    }
    
    
    public void marcaFinalizadoPorNombre(String nombreTarea,String colaboradorNombre){
        int tareaInidice = 0;
        for(int i = 0;i<tareas.size();i++){
          if (tareas.get(i).getNombre().equals(nombreTarea)){
              tareas.get(i).setEstado(true);
              tareaInidice = i;
              break;
          }
        } 
        for(int i = 0;i<colaboradores.size();i++){
            if (colaboradores.get(i).getNombre().equals(colaboradorNombre)){
                colaboradores.get(i).registrarTarea(tareas.get(tareaInidice), LocalDate.now());
            }
        
       }
    }
    
    public colaboradores obtenerColaborador(String nombre){
        for(int i = 0;i<colaboradores.size();i++){
            if(colaboradores.get(i).getNombre().equals(nombre)){
                return colaboradores.get(i);
                
            }
        }
        return null;
    }
    
    public void ordenarTareas(){
        for(int i = 0;i<tareas.size()-1;i++){
            for(int j = i + 1;j<tareas.size();j++){
                if(tareas.get(i).getPrioridad() > tareas.get(j).getPrioridad()){
                    clase_tarea aux = tareas.get(i);
                    tareas.set(i, tareas.get(j));
                    tareas.set(j, aux);
                }
            }
        }
    }


    
    public void mostrar_tareas(){
       ordenarTareas();
       for(int i = 0;i<tareas.size();i++){
          tareas.get(i).mostrar();
       }
    }
    
}


