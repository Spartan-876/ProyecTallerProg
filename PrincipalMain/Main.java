import java.util.Scanner;

import Clases.clsEncargado;
import Clases.clsMenus;

public class Main {
    public static void main(String[] args) {    
        Scanner lector = new Scanner(System.in);
        clsEncargado encagado1=new clsEncargado("EncargadoPEPE","913782pp");
        String usuario;
        String contraseña;
        int intentos=1;
        int opcion;
        
        do{
            clsMenus.Menutipo();
            do{
                System.out.print("Ingrese la opción: ");
                opcion=lector.nextInt();
                if (opcion<1||opcion>3) {
                    System.out.println("Opción incorrecta");
                }
                lector.nextLine();
            }while(opcion<1||opcion>3);    
             switch (opcion) {
                case 1:
                    do{
                        clsMenus.MenuCliente();    
                        do{
                            System.out.print("Ingrese la opción: ");
                            opcion=lector.nextInt();
                            if (opcion<1|| opcion>6) {
                                System.out.println("Opción incorrecta");
                            }
                        }while (opcion<1||opcion>6);
                    switch (opcion) {
                        case 1:
                            do{
                                clsMenus.SubMenuVuelos();
                                do{
                                    System.out.print("Ingrese la opción: ");
                                    opcion=lector.nextInt();
                                    if (opcion<1||opcion>4) {
                                        System.out.println("Opción incorrecta");
                                    }
                                }while (opcion<1||opcion>4);
                            }while (opcion!=4);
                            break;
                    
                        case 2:
                            do{
                                clsMenus.SubMenuReserva();
                                do{
                                    System.out.print("Ingrese la opción: ");
                                    opcion=lector.nextInt();
                                    if (opcion<1||opcion>5) {
                                        System.out.println("Opción incorrecta");
                                    }
                                }while (opcion<1||opcion>5);
                            }while (opcion!=5);
                            break;
                        
                        case 3:
                            do{
                                clsMenus.SubMenuEstadoReserva();
                                do{
                                    System.out.print("Ingrese la opción: ");
                                    opcion=lector.nextInt();
                                    if (opcion<1||opcion>3) {
                                        System.out.println("Opción incorrecta");
                                    }
                                }while (opcion<1||opcion>3);
                            }while (opcion!=3);
                            break;

                        case 4:
                            do{
                                clsMenus.SubMenuCancelar();
                                do{
                                    System.out.print("Ingrese la opción: ");
                                    opcion=lector.nextInt();
                                    if (opcion<1||opcion>3) {
                                        System.out.println("Opción incorrecta");
                                    }
                                }while (opcion<1||opcion>3);
                            }while (opcion!=3);
                            break;
                    
                        case 5:
                            do{
                                clsMenus.SubMenuActuDatos();
                                do{
                                    System.out.print("Ingrese la opción: ");
                                    opcion=lector.nextInt();
                                    if (opcion<1||opcion>3) {
                                        System.out.println("Opción incorrecta");
                                    }
                                }while (opcion<1||opcion>3);
                            }while (opcion!=3);  
                            break;
                    }
                }while (opcion!=6);
                    break;
                case 2:
                    do{
                        System.out.println("""
                            --------------------------
                                  INICIAR SESIÓN
                            -------------------------- """);
                        System.out.print("USUARIO: ");
                        usuario=lector.nextLine();
                        System.out.print("CONTRASEÑA: ");
                        contraseña=lector.nextLine();
                        System.out.println("--------------------------");
                        intentos++;
                        if (intentos==5) {
                            break;
                        }
                    }while (encagado1.verificarUsuario(usuario)&&encagado1.verificarContraseña(contraseña));
                    if (intentos==5) {
                        break;
                    }
                    do{
                        clsMenus.MenuEncargado();
                        do{
                            System.out.print("Ingrese la opción: ");
                            opcion=lector.nextInt();
                            if (opcion<1||opcion>4) {
                                System.out.println("Opción incorrecta");
                            }
                        }while (opcion<1||opcion>4);
                        switch (opcion) {
                            case 1:
                                do{
                                    clsMenus.MenuGesVuelos();
                                    do{
                                        System.out.print("Ingrese la opción: ");
                                        opcion=lector.nextInt();
                                        if (opcion<1||opcion>5) {
                                            System.out.println("Opción incorrecta");
                                        }
                                    }while (opcion<1||opcion>5);
                                }while (opcion!=5);
                                break;
                            
                            case 2:
                                do{
                                    clsMenus.MenuGesBoletos();
                                    do{
                                        System.out.print("Ingrese la opción: ");
                                        opcion=lector.nextInt();
                                        if (opcion<1||opcion>4) {
                                            System.out.println("Opción incorrecta");
                                        }
                                    }while (opcion<1||opcion>4);
                                }while (opcion!=4);
                                break;
                            case 3:
                                do{
                                    clsMenus.MenuGesPasajeros();
                                    do{
                                        System.out.print("Ingrese la opción: ");
                                        opcion=lector.nextInt();
                                        if (opcion<1||opcion>3) {
                                            System.out.println("Opción incorrecta");
                                        }
                                    }while (opcion<1||opcion>3);
                                }while (opcion!=3);
                                break;
                        }
                    }while (opcion!=4);
                    break;
                }
        }while(opcion!=3);
        lector.close();
    }
}