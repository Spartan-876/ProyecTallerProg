import java.util.Scanner;

import Clases.clsCliente;
import Clases.clsEncargado;
import Clases.clsMenus;
import Clases.clsValidadores;

public class Main {
    public static void ejecutar() {    
        Scanner lector = new Scanner(System.in);
        clsEncargado encargado1=new clsEncargado("EncargadoPEPE","913782pp");
        clsCliente cliente1=new clsCliente();
        int correct_option=0;
        
        do {
            clsMenus.Menutipo();
            correct_option = clsValidadores.validar_opciones(1, 3);
            switch (correct_option) {
                case 1:
                    int clienteOption;
                    do {
                        clsMenus.MenuCliente();
                        clienteOption = clsValidadores.validar_opciones(1, 6);
                        switch (clienteOption) {
                            case 1:
                                int subMenuVuelosOption;
                                do {
                                    clsMenus.SubMenuVuelos();
                                    subMenuVuelosOption = clsValidadores.validar_opciones(1, 4);
                                } while (subMenuVuelosOption != 4);
                                break;
                            case 2:
                                int subMenuReservaOption;
                                do {
                                    clsMenus.SubMenuReserva();
                                    subMenuReservaOption = clsValidadores.validar_opciones(1, 5);
                                    switch (subMenuReservaOption) {
                                        case 1:
                                            cliente1.registrar();
                                            break;
                                        case 2:
                                            
                                            break;
                                        case 3:
                                            
                                            break;
                                        case 4:
                                            
                                            break;
                                        case 5:
                                            break;
                                    }
                                } while (subMenuReservaOption != 5);
                                break;
                            case 3:
                                int subMenuEstadoReservaOption;
                                do {
                                    clsMenus.SubMenuEstadoReserva();
                                    subMenuEstadoReservaOption = clsValidadores.validar_opciones(1, 3);
                                } while (subMenuEstadoReservaOption != 3);
                                break;
                            case 4:
                                int subMenuCancelarOption;
                                do {
                                    clsMenus.SubMenuCancelar();
                                    subMenuCancelarOption = clsValidadores.validar_opciones(1, 3);
                                } while (subMenuCancelarOption != 3);
                                break;
                            case 5:
                                int subMenuActuDatosOption;
                                do {
                                    clsMenus.SubMenuActuDatos();
                                    subMenuActuDatosOption = clsValidadores.validar_opciones(1, 3);
                                } while (subMenuActuDatosOption != 3);
                                break;
                        }
                    } while (clienteOption != 6);
                    break;
                case 2:
                    encargado1.IniciarSesion();
                    int encargadoOption;
                    do {
                        clsMenus.MenuEncargado();
                        encargadoOption = clsValidadores.validar_opciones(1, 4);
                        switch (encargadoOption) {
                            case 1:
                                int menuGesVuelosOption;
                                do {
                                    clsMenus.MenuGesVuelos();
                                    menuGesVuelosOption = clsValidadores.validar_opciones(1, 5);
                                } while (menuGesVuelosOption != 5);
                                break;
                            case 2:
                                int menuGesBoletosOption;
                                do {
                                    clsMenus.MenuGesBoletos();
                                    menuGesBoletosOption = clsValidadores.validar_opciones(1, 4);
                                } while (menuGesBoletosOption != 4);
                                break;
                            case 3:
                                int menuGesPasajerosOption;
                                do {
                                    clsMenus.MenuGesPasajeros();
                                    menuGesPasajerosOption = clsValidadores.validar_opciones(1, 3);
                                } while (menuGesPasajerosOption != 3);
                                break;
                        }
                    } while (encargadoOption != 4);
                    break;
            }
        } while (correct_option != 3);
        lector.close();
    }
}