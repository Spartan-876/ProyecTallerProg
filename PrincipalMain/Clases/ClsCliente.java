package Clases;

import java.util.Scanner;

public class clsCliente {
    //Atributos
    public static final int max =20;
    private int Psj_cantidad=0;
    private String[] nombre = new String[max];
    private String[] email = new String[max];
    private int[] telefono = new int[max];
    private Scanner Leer = new Scanner(System.in);

    //Getter y Setter
    public int getCantidad(){
        return this.Psj_cantidad;
    }

    // Constructores
    


    //Metodos
    public void registrar(){
        String Psj_nombre, Psj_email;
        int Psj_telefono;
        int Cantidad_Registro;
        
        do{
        System.out.println("¿Cuantas personas son?");
        Cantidad_Registro = Leer.nextInt();
        Leer.nextLine();
        }while (Psj_cantidad+Cantidad_Registro < this.max);
        
        for ( int i=0;i < Cantidad_Registro;i++){
            if (Psj_cantidad <= (max -1) ){
            //Registrar Pasajero
            System.out.println("Registrar Datos del Pasajero");
            System.out.println("==============================");

            System.out.println("Ingresa los siguientes datos " + (this.getCantidad() + 1) + "/" + max);
            System.out.println("Nombre: ");
            Psj_nombre = Leer.nextLine();

            System.out.println("Email: ");
            Psj_email = Leer.nextLine();

            System.out.println("Telefono: ");
            Psj_telefono = Leer.nextInt();
            Leer.nextLine();

            this.nombre[Psj_cantidad] = Psj_nombre;
            this.email[Psj_cantidad] = Psj_email;
            this.telefono[Psj_cantidad] = Psj_telefono;

            System.out.println("Registro exitoso.");
            Psj_cantidad ++;

        }else{
            System.out.println("Error. Vuelva a registrar.");
        }
        }
        
    }

    public void actualizar_info(){

    }
    

}
