package Clases;
import abstractos.Persona;

public class mienbro extends Persona{

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("mencion:"+getNombre()+"\n");
        System.out.println("E-mail:"+getEmaill()+"\n");
        System.out.println("Edad:"+fechaNacimiento+"\n");
 }
    
    
}
