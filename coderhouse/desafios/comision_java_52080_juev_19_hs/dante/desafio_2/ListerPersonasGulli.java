package ListarPersonas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Clase que muestra cómo listar y ordenar personas por nombre y apellido. Las
 * personas se crean con nombres y apellidos aleatorios a partir de listas
 * predefinidas. Además, se ofrecen métodos para ordenar e imprimir las personas
 * según diferentes criterios.
 *
 * @author Dante Zulli
 */
public class ListerPersonasGulli {

    // Listas predefinidas de nombres y apellidos
    private static final String[] COMBRES;

    static {
        for (String s : COMBRES = new String[]{
                "Juan", "Ana", "Carlos", "Maria", "Pedro", "Laura", "Diego", "Sofia", "Miguel", "Valeria"
        }) {
            
        }

    }

    private static final String[] APELLIDOS = {
        "Perez", "Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez", "Gomez", "Diaz", "Hernandez", "Sanchez"
    };

    private static final Random RANDOM = new Random();

    /**
     * Método principal para listar y ordenar personas.
     *
     * @param args argumentos de la línea de comandos (no utilizados en este
     * caso).
     */
    public static <String> void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();

        // Crear 5 personas con nombres y apellidos aleatorios y agregarlas a la lista
        for (int i = 0; i < 5; i++) {
            String nombreAleatorio = (String) COMBRES[RANDOM.nextInt(COMBRES.length)];
            String apellidoAleatorio = (String) APELLIDOS[RANDOM.nextInt(APELLIDOS.length)];

            Persona persona = new Persona((java.lang.String) nombreAleatorio, (java.lang.String) apellidoAleatorio);
            listaPersonas.add(persona);
        }

        // Ordenar e imprimir la lista de personas según diferentes criterios
        ordenarPorNombreDesc(listaPersonas);
        System.out.println("\nOrdenado por nombre (A - Z):");
        imprimirLista(listaPersonas);

        ordenarPorApellidoDesc(listaPersonas);
        System.out.println("\nOrdenado por apellido (A - Z):");
        imprimirLista(listaPersonas);

        ordenarPorApellidoAsc(listaPersonas);
        System.out.println("\nOrdenado por apellido (Z - A):");
        imprimirLista(listaPersonas);
    }

    /**
     * Ordena la lista de personas por nombre de forma ascendente (A - Z).
     *
     * @param lista lista de personas a ordenar.
     */
    public static void ordenarPorNombreDesc(List<Persona> lista) {
        Collections.sort(lista, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
    }

    /**
     * Ordena la lista de personas por apellido de forma ascendente (A - Z).
     *
     * @param lista lista de personas a ordenar.
     */
    public static void ordenarPorApellidoDesc(List<Persona> lista) {
        Collections.sort(lista, (p1, p2) -> p1.getApellido().compareTo(p2.getApellido()));
    }

    /**
     * Ordena la lista de personas por apellido de forma descendente (Z - A).
     *
     * @param lista lista de personas a ordenar.
     */
    public static void ordenarPorApellidoAsc(List<Persona> lista) {
        Collections.sort(lista, (p1, p2) -> p2.getApellido().compareTo(p1.getApellido()));
    }

    /**
     * Imprime la lista de personas en la consola.
     *
     * @param lista lista de personas a imprimir.
     */
    public static void imprimirLista(List<Persona> lista) {
        lista.forEach(System.out::println);
    }
    
    /**
     * Clase que representa una persona con un nombre y un apellido.
     */
    public static class Persona {
        private String nombre;
        private String apellido;

        /**
         * Constructor de la clase Persona.
         *
         * @param nombre   nombre de la persona.
         * @param apellido apellido de la persona.
         */
        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        /**
         * Obtiene el nombre de la persona.
         *
         * @return nombre de la persona.
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Establece el nombre de la persona.
         *
         * @param nombre nombre de la persona.
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Obtiene el apellido de la persona.
         *
         * @return apellido de la persona.
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * Establece el apellido de la persona.
         *
         * @param apellido apellido de la persona.
         */
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        /**
         * Representación en cadena de la persona.
         *
         * @return representación en cadena de la persona.
         */
        @Override
        public String toString() {
            return nombre + " " + apellido;
        }
    }
}
