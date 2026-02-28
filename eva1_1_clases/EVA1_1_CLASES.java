
package eva1_1_clases;
public class EVA1_1_CLASES {
    public static void main(String[] args) {
     Persona persol;       
       persol = new Persona();
         System.out.println(persol);   
           persol.nombre = "flac";
         persol.apellido = "monarca";
      persol.edad = 19;
    }
}
class Persona{
    String nombre;
     String apellido;
       int edad;
         void imprimir(){
          System.out.println("nombre: " + nombre);
           System.out.println("apellido: " + apellido);
            System.out.println("edad: " + edad); 
     }  
}