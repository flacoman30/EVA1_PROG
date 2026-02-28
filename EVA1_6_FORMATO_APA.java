public class EVA1_6_FORMATO_APA {
   private String tipo;
    private String editorial;
        private String titulo;
         private String autor;
      private int año;
    public String getautor() {
        return autor;}
    public void setautor(String valor) {
        autor = valor;}
    public String gettitulo() {
        return titulo;}
    public void settitulo(String valor) {
        titulo = valor;}
    public String geteditorial() {
        return editorial;}
    public void seteditorial(String valor) {
        editorial = valor;}
    public String gettipo() {
        return tipo;}
    public void settipo(String valor) {
        tipo = valor;}
    public int getaño() {
        return año;}
    public void setaño(int valor) {
        año = valor;}
    public void imprimirdatos() {
        System.out.println("-------referencias ---------a"); 
         System.out.println("Título: " + titulo);
          System.out.println("Autor: " + autor);
            System.out.println("Año: (" + año + ")");
         System.out.println("Tipo de recurso: " + tipo);
           System.out.println("Editorial: " + editorial);
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            EVA1_6_FORMATO_APA datos = new EVA1_6_FORMATO_APA();
             datos.setautor("monarca");
               datos.seteditorial("moon studio");
                datos.setaño(2008);  
                  datos.settipo("Libro");
                     datos.settitulo("campo de maripozas");
             System.out.println("resgristro" + i);
              datos.imprimirdatos();
        }}}