package org.example;

public class NumberClassifier {

    public static void main(String[] args) {

        //######  if-else
        //int number = 1; // Cambia valor para probar diferentes casos

      //  if (number > 0) {
     //       System.out.println("El número es positivo.");
     //   } else if (number < 0) {
     //       System.out.println("El número es negativo.");
     //   } else {
     //       System.out.println("El número es cero.");
     //   }


     //###################  switch

        int dayNumber = 3; // Cambia este valor para probar diferentes días (1-7)

        switch (dayNumber) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor ingrese un número entre 1 y 7.");
                break;
        }
    

    }
}
