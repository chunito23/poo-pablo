/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_tareas;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author domin
 */
public class Lista_tareas {

    public static void main(String[] args) {

        
        gestor_tareas gt = new gestor_tareas();//creo el gesto de tareas
        
        //añado colaboradores
        gt.agregarColaboradores("tato");
        gt.agregarColaboradores("chuni");
        gt.agregarColaboradores("juli");
        
        //agrego tareas
        gt.agregar_tarea(
                "ir al supermercado",
                "ir al super",
                LocalDate.of(2023,9,16),
                LocalDate.of(2023,9,7));
        gt.agregar_tarea(
                "Consultar repuesto del auto",
                "Consultar repuesto del auto",
                LocalDate.of(2023,9,5),
                LocalDate.of(2023,10,20));
        gt.agregar_tarea(
                "Ir al cine a ver la nueva película de Marvel",
                "ir al super",
                LocalDate.of(2023,9,8),
                LocalDate.of(2023,10,20));

        //finalizo ir al supermecado por juli
        gt.marcaFinalizadoPorNombre("ir al supermercado","juli");
        gt.mostrar_tareas();
        System.out.println("-------------------------------------------------------------");
        gt.obtenerColaborador("juli").mostrarListaColaboradores();
        
    }
}
