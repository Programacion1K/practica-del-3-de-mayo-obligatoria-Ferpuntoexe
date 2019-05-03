import javax.swing.*;

public class Contacto {
    private final String nombre;
    private final String numero;
    private final String email;


    public Contacto(String nombre, String numero, String email) {
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Contacto contacto1=new Contacto( "John","117117117","JefeMaestro@UNSCmail.com");
        Contacto contacto2=new Contacto( "Cortana","117117117","Cortana@UNSCmail.com");
        System.out.println( contacto1 +"\n" +contacto2 );
    }
}

