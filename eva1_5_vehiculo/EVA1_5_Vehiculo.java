package eva1_5_vehiculo;
public class EVA1_5_Vehiculo {
    public static class Vehiculo {
       String marca;
        int kilometros;
           String color;
              int year;
              double precio;
                 String modelo;
                 public String getmarca() {
            return marca;
        }
        public void setmarca(String valor) {
            marca = valor;
        }
        public String getmodelo() {
            return modelo;
        }
        public void setmodelo(String valor) {
            modelo = valor;
        }
        public int getyear() {
            return year;
        }
        public void setyear(int valor) {
            year = valor;
        }//
        public String getcolor() {
            return color;
        }
        public void setcolor(String valor) {
            color = valor;
        }
        public double getprecio() {
            return precio;
        }
        public void setprecio(double valor) {
            precio = valor;
        }
        public void setkilomertraje(int valor) {
            kilometros = valor;
        }//iker pagame put la chona esta para bailar bien chidote para poner unos cumbiones bien insanotes
        public void imprimirDatos() {
            System.out.println("--------DATOS DEL VEHICULO--------");
               System.out.println("Marca: " + marca);
                 System.out.println("Modelo: " + modelo);
                   System.out.println("Año: " + year);
                 System.out.println("Color: " + color);
               System.out.println("Precio: " + precio);
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Vehiculo vehiculo = new Vehiculo();
              vehiculo.setmarca("CHE");
                vehiculo.setmodelo("chevy pop");
                  vehiculo.setyear(2004);
                   vehiculo.setcolor("NEGROTE");
                     vehiculo.setprecio(250000);
                       vehiculo.imprimirDatos();
                       
        }
    }
}