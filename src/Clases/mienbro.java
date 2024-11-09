package Clases;
import Enums.EstadoMenbrecia;
import Enums.tipoMenbrecia;
import Interfaces.Innerpagable;
import Interfaces.asistible;
import Interfaces.evaluable;
import abstractos.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;

public class mienbro extends Persona implements asistible,evaluable,Innerpagable {

    private tipoMenbrecia tipoMenbrecia;
    private EstadoMenbrecia estado;
    private HashMap<LocalDate, Double>registroPeso;
    private ArrayList<Rutina>rutinas;
    private HashMap<String, String>medicionesCorporales;
   
    public mienbro(Enums.tipoMenbrecia tipoMenbrecia, EstadoMenbrecia estado, HashMap<LocalDate, Double> registroPeso,
            ArrayList<Rutina> rutinas, HashMap<String, String> medicionesCorporales) {
        this.tipoMenbrecia = tipoMenbrecia;
        this.estado = estado;
        this.registroPeso = registroPeso;
        this.rutinas = rutinas;
        this.medicionesCorporales = medicionesCorporales;
    }

    public void ActuallizarMedidas(){}
    public void AgregarRutina(){}
    public void RegistrarPeso(){}       //falta Implementar Logica (1 Adelanto)


    //comentario prueba 

    



  

    
}
