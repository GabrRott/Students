
package alumnos.servicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GbR
 */
public class ServiNotas {
    public Scanner leer;
    public ArrayList<Alumno>listado ;

    public ServiNotas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listado = new ArrayList();
    }
    
    public Alumno crearA(){
        String aux = "";
        ArrayList <Integer> notas = new ArrayList();
        do {  
            System.out.println("Ingrese el nombre del alumno o <<s>> para terminar la carga:");
            aux = leer.next();
            if (aux.equals("s")||aux.equals("S")) {
                break;
            } else {
                for (int i = 1; i < 4; i++) {
                System.out.println("ingrese la nota n°: "+i);
                int n = leer.nextInt();
                notas.add(n);
                }  
            }  
            
        } while (!aux.equals("s"));
        Alumno A = new Alumno(aux, notas);
        listado.add(A);
        return A;
    } 

    
    public void printA(){
        System.out.println("El listado final es de "+listado.size());
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
 
        }
    }
    
    
}
