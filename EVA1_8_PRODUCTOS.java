
package eva1_8_productos;
public class EVA1_8_PRODUCTOS {
    public static class Producto {
        private String nombre;
            private String marca;
                private String unidad;
                   private double precio;
                   private double cantidad;
                  public String getNombre() { return nombre; }
                 public void setNombre(String valor) { this.nombre = valor; }
              public String getMarca() { return marca; }
        public void setMarca(String valor) { this.marca = valor; }
    public String getUnidad() { return unidad; } 
     public void setUnidad(String valor) { this.unidad = valor; }
        public double getPrecio() { return precio; }
           public void setPrecio(double valor) { this.precio = valor; } 
          public double getCantidad() { return cantidad; }
     public void setCantidad(double valor) { this.cantidad = valor; }
        public void imprimirDatos() {
            System.out.println("---------- DATOS DEL PRODUCTO ----------");
              System.out.println("Nombre:   " + nombre);
                System.out.println("Marca:    " + marca);
                  System.out.println("Unidad:   " + unidad);
                    System.out.println("Precio:   $" + precio);
                 System.out.println("Cantidad: " + cantidad);
              System.out.println("Subtotal: $" + (precio * cantidad));
        }
    }
    public static void main(String[] args) 
        for (int i = 1; i <= 4; i++) {
            System.out.println("REGISTRO NUMERO: " + i);
             Producto miProducto = new Producto();
                miProducto.setNombre("Monitor Gamer");
                  miProducto.setMarca("Samsung");
                   miProducto.setUnidad("Pieza");
                     miProducto.setPrecio(3500.00);
                  miProducto.setCantidad(i);
            miProducto.imprimirDatos();
        }
    }

}
