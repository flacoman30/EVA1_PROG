package eva1_7_construcciones;
public class EVA1_7_CONSTRUCCIONES {
    public static class Persona {   
             private int edad;
                private String apellido;
                    private String nombre;
        public Persona() {
            System.out.println("ejecucion del const");
                this.nombre = "----";
                   this.apellido = "----";
                      this.edad = 0; 
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String valor) {
            this.nombre = valor;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String valor) {
            this.apellido = valor;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int valor) {
            this.edad = valor;
        }
        public void imprimirDatos() {
            System.out.println("nombre: " + nombre + "apellido " + apellido + "edad:" + edad);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            Persona p = new Persona();
              p.setNombre("flac");
                p.setApellido("monarca");
                     p.setEdad(19 + i);
                        p.imprimirDatos();
        }
          }
             }