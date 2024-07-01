package Clases;

import java.util.Scanner;

public class clsValidadores {
    private static Scanner lector = new Scanner(System.in);
    public static int validar_opciones(int liminf, int limsup) {
        
        int opcion = 0;
        boolean valido = false;
        
        do {
            try {
                System.out.print("Ingrese la opción: ");
                opcion = Integer.parseInt(lector.nextLine());
                if (opcion >= liminf && opcion <= limsup) {
                    valido = true;
                } else {
                    System.out.println("Opción incorrecta");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: el valor ingresado no es un número.");
            }
        } while (!valido);
        
        return opcion;
    }
}
