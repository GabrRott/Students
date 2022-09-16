/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.

En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:

Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
Ejemplo de una colección como atributo: ColeccionAtributo
*/
package entidades;

import java.util.ArrayList;

/**
 *
 * @author GbR
 */
public class Alumno {
    private String alumnos;
    private ArrayList<Integer> nota1;

    public Alumno() {
    }

    public Alumno(String alumnos, ArrayList<Integer> nota1) {
        this.alumnos = alumnos;
        this.nota1 = nota1;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public ArrayList<Integer> getNota1() {
        return nota1;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public void setNota1(ArrayList<Integer> nota1) {
        this.nota1 = nota1;
    }
    
    
    
}
