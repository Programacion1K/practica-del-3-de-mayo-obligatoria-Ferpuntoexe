public class Contacto {
    private final String nombre;
    private final int numero;
    private final String email;


    public Contacto(String nombre, int numero, String email) {
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

}
