package eva1_2_modificadores;
public class EVA1_2_MODIFICADORES {
    public static void main(String[] args) {
        Persona perso = new Persona(
            "flac flacoman",
              "mariposa monarca",
                 19,
                  "Hombre",
                    "no me lo se"
        );
        System.out.println(perso);
   }}
class Persona {
    private String nombre;
     private String apellidos;
      private int edad;
     private String genero;
    private String curp;
   public Persona(String nombre, String apellidos, int edad, String genero, String curp) {
      this.nombre = nombre;
       this.apellidos = apellidos;
         setEdad(edad);    
          this.genero = genero;
            setCurp(curp);     
    }
          public String getNombre() { return nombre; }
        public String getApellidos() { return apellidos; }
      public int getEdad() { return edad; }
     public String getGenero() { return genero; }
    public String getCurp() { return curp; }
     public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }}
    public void setCurp(String curp) {
        if (curp.length() == 18) {
            this.curp = curp;
        } else {
            System.out.println("error: La curp debe tener 18 caracteres.");
        }}
    public String toString() {
        return "Nombre: " + nombre +
               "Apellidos: " + apellidos +
                 "Edad: " + edad +
                  "Género: " + genero +
                    "CURP: " + curp;

    }}
