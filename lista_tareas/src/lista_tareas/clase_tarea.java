/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tareas;


import java.time.LocalDate;

/**
 *
 * @author domin
 */
public class clase_tarea {
    private String nombre;
    private String descripcion_tarea;
    private int prioridad;  
    private boolean estado = false;
    private LocalDate fechaVencimiento;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizacion;
    
    
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public int getPrioridad() {
        return prioridad;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
     public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public clase_tarea(String nombre,String description,LocalDate fecha,LocalDate fechaRecordatorio){
        this.nombre = nombre;
        this.descripcion_tarea = description;
        this.fechaRecordatorio = fechaRecordatorio;
        this.prioridad = calcularPrioirdad(fecha);
        this.fechaVencimiento = fecha;
    }
    
    public int calcularPrioirdad(LocalDate fecha){
        if (fecha.isBefore(LocalDate.now().plusDays(7))){
            if(fechaRecordatorio.isAfter(LocalDate.now())){
                return 1;
            }else{
                return 2;
            }
        }else{
            return 2;
        }
    }
    
    public int vencido(){
        if(fechaVencimiento.isBefore(LocalDate.now())){
            return 1;
        }else if(fechaRecordatorio.isBefore(LocalDate.now())){
            return 2; 
        }else{
            return 3;
        }
       
    }
    
    
    public void mostrar(){
        System.out.println("nombre_tarea: " + nombre);
        if (vencido() == 1){
            System.out.println("vencido.. descripcion: " + descripcion_tarea);
        }else if (vencido() == 2){
            System.out.println("por vencer..descripcion: " + descripcion_tarea);
        }else{
            System.out.println("descripcion: " + descripcion_tarea);
        }
        System.out.println("prioridad: " + prioridad);
        System.out.println("estado: " + estado);
        System.out.println("fecha vencimiento: " + fechaVencimiento);
        System.out.println("fecha recordatorio: " + fechaRecordatorio + "\n");
    }
    
    

}
