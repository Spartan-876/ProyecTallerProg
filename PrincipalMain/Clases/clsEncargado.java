package Clases;

public class clsEncargado {
    String usuario;
    String contraseña;

    public clsEncargado(String us, String ctr){
        this.usuario=us;
        this.contraseña=ctr;
    }

    public boolean verificarUsuario (String usingreso){
        if (usuario.equalsIgnoreCase(usingreso)) {
            return false;
        }else{
            return true;
        }
    }

    
    public boolean verificarContraseña (String ctringreso){
        if (contraseña.equalsIgnoreCase(ctringreso)) {
            return false;
        }else{
            return true;
        }
    }

}
