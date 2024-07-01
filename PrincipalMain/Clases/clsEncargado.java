package Clases;
import java.util.Scanner;
public class clsEncargado {
    String usuario;
    String contraseña;
    Scanner lector = new Scanner(System.in);

    public clsEncargado(String us, String ctr){
        this.usuario=us;
        this.contraseña=ctr;
    }

    public boolean verificarUsuario (String usingreso){
        return (usuario.equalsIgnoreCase(usingreso));
    }
    public boolean verificarContraseña (String ctringreso){
        return (contraseña.equalsIgnoreCase(ctringreso));
    }

    public void IniciarSesion(){
        String usuario_ingreso=null;
        String contraseña_ingreso=null;
        int intentos=0;
        boolean SesionIniciada = false;
        do {
            System.out.println("""
         --------------------------
                INICIAR SESIÓN
         -------------------------- """);
          System.out.print("USUARIO: ");
          usuario_ingreso=lector.nextLine();
          System.out.print("CONTRASEÑA: ");
          contraseña_ingreso=lector.nextLine();
          System.out.println("--------------------------");
          //validar usuario y contraseña
          intentos++;
          if (usuario.equalsIgnoreCase(usuario_ingreso) && contraseña.equalsIgnoreCase(contraseña_ingreso)) {
            SesionIniciada = true;
            System.out.println("BIENVENIDO "+usuario);
          }else {
              System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
          }
          if (intentos==5) {
            System.out.println("Se agotaron los intentos, no se puede iniciar sesion");
            break;
          }
        } while ( !SesionIniciada && intentos<5);
        
    }
    public void GestionVuelos(){
        
    }
        
    
    /* 
        public boolean verificarUsuario (String usingreso){
            if (usuario.equalsIgnoreCase(usingreso)) {
                return false;
            }else{
                return true;
            }

        
        public boolean verificarContraseña (String ctringreso){
            if (contraseña.equalsIgnoreCase(ctringreso)) {
                return false;
            }else{
                return true;
            }
        }
    */
}
