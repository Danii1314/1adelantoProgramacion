package Clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.HashMap;

public class Rutina {
    public String nombre;
    private TreeMap<Integer,ArrayList<ejercicios>>diasRUtina;
    public LocalDate fechaInicio;
    private LocalDate fechaFin;
    private HashMap<LocalDate,String>progresos;
    
    public Rutina() {
    }

    public Rutina(String nombre, TreeMap<Integer, ArrayList<ejercicios>> diasRUtina, LocalDate fechaInicio,
            LocalDate fechaFin, HashMap<LocalDate, String> progresos) {
        this.nombre = nombre;
        this.diasRUtina = diasRUtina;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.progresos = progresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeMap<Integer, ArrayList<ejercicios>> getDiasRUtina() {
        return diasRUtina;
    }

    public void setDiasRUtina(TreeMap<Integer, ArrayList<ejercicios>> diasRUtina) {
        this.diasRUtina = diasRUtina;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public HashMap<LocalDate, String> getProgresos() {
        return progresos;
    }

    public void setProgresos(HashMap<LocalDate, String> progresos) {
        this.progresos = progresos;
    }

    @Override
    public String toString() {
        return "Rutina [nombre=" + nombre + ", diasRUtina=" + diasRUtina + ", fechaInicio=" + fechaInicio
                + ", fechaFin=" + fechaFin + ", progresos=" + progresos + "]";
    }
    
    
    
    


}
