package Clases;

import java.util.Scanner;

public class clsvuelos {
    Scanner leer = new Scanner(System.in);
    private String[] destino = new String[10];
    private String[] fecha = new String[10];
    private String[] hora = new String[10];

    public void registrar() {
        for (int i = 0; i < destino.length; i++) {
            System.out.println("Destino: ");
            destino[i] = leer.next();
            System.out.println("Fecha: ");
            fecha[i] = leer.next();
            System.out.println("Hora: ");
            hora[i] = leer.next();
        }
    }
}
