
public class NumeroFlotanteZulli {
    public static void main( String[] args) {
        // Número flotante de ejemplo
        float numeroFloat = 123.456f;

        // Convierto el número a cadena para manipularlo
        String numeroComoCadena = Float.toString(numeroFloat);

        // Separo la parte entera y la parte decimal
        String[] partes = numeroComoCadena.split("\\.");

        // Muestro la parte entera y la parte decimal por separado
        System.out.println("Parte entera: " + partes[0]);
        System.out.println("Parte decimal: " + partes[1]);
    }
}