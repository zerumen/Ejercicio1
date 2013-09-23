/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author alumno
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Persona> mapPersonas=new HashMap<String,Persona>();
        List<Persona> personas=new LinkedList<Persona>();
        
        Persona persona1 = new Persona("22586755l","Pepin", "Junen", Sexo.HOMBRE);
        Persona persona2 = new Persona("56498294m","Luchin", "Junes", Sexo.HOMBRE);
        Persona persona3 = new Persona("73290203N","Kitol", "Hermosilla", Sexo.HOMBRE);
        
       /* personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);*/
        

        mapPersonas.put(persona3.getDni(), persona3);
        mapPersonas.put(persona2.getDni(), persona2);
        mapPersonas.put(persona1.getDni(), persona1);
        
        mapPersonas.get(persona3.getDni());
        
        System.out.println("Numero de personas: "+personas.size());
        /*for(Persona persona:personas){
            String dni="22586755l";
            if(persona.getDni().equals(dni)){
            System.out.println("Nombre Persona: "+persona.getNombreCompleto());
        }
        }*/

       /* System.out.println(persona.getNombre());
        System.out.println(persona.getApe1());
        System.out.println(persona.getsexos());
*/


    }
}
