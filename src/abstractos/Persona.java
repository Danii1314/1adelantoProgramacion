package abstractos;

import java.time.LocalDate;

public abstract class Persona {

    protected String id;
    protected String nombre;
    protected String emaill;
    protected LocalDate fechaNacimiento;
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", emaill=" + emaill + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

   
    

}
