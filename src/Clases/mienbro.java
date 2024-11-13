package Clases;
import Enums.EstadoMenbrecia;
import Enums.tipoMenbrecia;
import Interfaces.Innerpagable;
import Interfaces.asistible;
import Interfaces.evaluable;
import abstractos.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;

public class mienbro extends Persona implements asistible,evaluable,Innerpagable {
Scanner teclado = new Scanner(System.in)
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

    public void ActuallizarMedidas(int pecho, int espalda, int estatura ){

        System.out.println("ingrese las nueva medida de pecho");
        pecho=teclado.nextInt();
        System.out.println("ingrese las nueva medida de espalda");
        espalda=teclado.nextInt();
        System.out.println("ingrese las nueva medida de estatura");
        estatura=teclado.nextInt();
        
        
    }
    public void AgregarRutina(){}
    
    public void RegistrarPeso(int peso){
        System.out.println("ingrese su peso actual ");
        peso=teclado.nextInt();
     }       


    //comentario prueba 

    



  

    
}
