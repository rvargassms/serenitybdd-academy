package shop.model;

public class ActorUsuario {
   private final String nombre;
   private final String apellido;
   private final String email;
   private final String contrasenia;

   public ActorUsuario(String nombre, String apellido, String email, String contrasenia ){
       this.nombre = nombre;
       this.apellido = apellido;
       this.email = email;
       this.contrasenia = contrasenia;
   }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasenia() {
        return contrasenia;
    }
}
