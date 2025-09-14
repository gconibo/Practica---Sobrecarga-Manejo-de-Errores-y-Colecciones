import java.util.ArrayList;

public class ListaEstudiantes {
    public static void main(String[] args) {

        // crear un ArrayList para almacenar nombres de estudiantes
        ArrayList<String> estudiantes = new ArrayList<>();

        //Agregar al menos 5 nombres
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Maria");
        estudiantes.add("Carlos");
        estudiantes.add("Sofia");

        //Mostrar la lista completa
        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }

        //Eliminar el tercer nombre ingresado (índice 2, porque empieza en 0)
        estudiantes.remove(2);  // Elimina "Maria"

        //Mostrar la lista después de eliminar
        System.out.println("\nLista despues de eliminar el tercer nombre:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }
    }
}

