package alumnos;

import alumnos.servicio.ServiNotas;
import java.util.Scanner;
import entidades.Alumno;

/**
 *
 * @author GbR
 */
public class Alumnos {

    public static void main(String[] args) {
       
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        ServiNotas SN = new ServiNotas();
        SN.crearA();
        SN.printA();
        
    }
    
}
