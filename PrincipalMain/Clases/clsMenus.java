package Clases;

public class clsMenus {
    public static void Menutipo(){
        System.out.printf("""
            
                -----------------------
                        USUARIO   
                -----------------------
                    1. CLIENTE
                    2. ENCARGADO
                    3. SALIR    
                -----------------------

                """);
    }
    public static void MenuCliente (){
        System.out.printf("""

                -----------------------------
                        JJC AIRLINE            
                -----------------------------
                    1. VUELOS DISPONIBLES   
                    2. RESERVAR BOLETO
                    3. ESTADO DE RESERVA
                    4. CANCELAR RESERVA
                    5. ACTUALIZAR DATOS
                    6. VOLVER
                -----------------------------

                """);
    }
    public static void SubMenuVuelos(){
        System.out.printf("""

            --------------------------
                VUELOS DISPONIBLES    
            --------------------------
              1. ORIGEN Y DESTINO
              2. FECHA DE SALIDA
              3. VUELOS DISPONIBLES
              4. VOLVER
            --------------------------

                """);

    }
    public static void SubMenuReserva(){
        System.out.printf("""

            ---------------------------
                  RESERVAR BOLETO       
            ---------------------------
              1. SELECCIONAR VUELO
              2. DATOS DEL PASAJERO
              3. SELECCIONAR ASIENTO
              4. REALIZAR PAGO
              5. VOLVER
            ---------------------------

                """);
    }
    public static void SubMenuEstadoReserva(){
        System.out.printf("""

            -----------------------------
                  ESTADO DE RESERVA
            -----------------------------
              1. NÚMERO DE BOLETO
              2. DETALLE DE RESERVA
                 Y ESTADO.
              3. VOLVER
            -----------------------------

                """);
    }
    public static void SubMenuCancelar(){
        System.out.printf("""

            ----------------------------
                  CANCELAR RESERVA
            ----------------------------
              1. NÚMERO DE BOLETO
              2. CONFIRMAR CANCELACIÓN
              3. VOLVER
            ----------------------------

                """);
    }
    public static void SubMenuActuDatos(){
        System.out.printf("""

            ----------------------------
                  ACTUALIZAR DATOS
            ----------------------------
              1. ACTUALIZAR E-MAIL
              2. ATUALIZAR TELEFONO.
              3. VOLVER
            ---------------------------- 

                """);
    }
    public static void MenuEncargado(){
        System.out.printf("""

            ----------------------------
                    JJC AIRLINES
            ----------------------------
              1. GESTIÓN DE VUELOS
              2. GESTIÓN DE BOLETOS
              3. GESTIÓN DE PASAJEROS
              4. VOLVER
            ----------------------------

                """);
    }
    public static void MenuGesVuelos(){
        System.out.printf("""

            -------------------------
                GESTIÓN DE VUELOS
            -------------------------
              1. CREAR NUEVO VUELO
              2. ACTUALIZAR VUELO    
              3. ELIMINAR VUELO
              4. LISTA DE VUELOS
              5. VOLVER
            -------------------------

                """);
    }
    public static void MenuGesBoletos(){
        System.out.printf("""

            -----------------------------------
                    GESTIÓN DE BOLETOS
            -----------------------------------
              1. BOLETOS POR VUELOS
              2. CAMBIAR ESTADO DE UN BOLETO    
              3. DETALLES DE BOLETO
              4. VOLVER
            -----------------------------------

                """);
    }
    public static void MenuGesPasajeros(){
        System.out.printf("""

            -----------------------------------
                    GESTIÓN DE PASAJEROS
            -----------------------------------
              1. VER LISTA DE PASAJEROS
              2. ELIMINAR PASAJERO
              3. VOLVER 
            -----------------------------------
            
                """);
    }
}
