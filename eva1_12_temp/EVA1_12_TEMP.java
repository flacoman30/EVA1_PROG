package eva1_12_temp;
public class EVA1_12_TEMP {
    public static void main(String[] args) {
        double fahrenheit=100;
            double celsius=convertirFaC(fahrenheit);
                System.out.println(fahrenheit+" F equivale a "+celsius+" C");
                    System.out.println("100 C a F: "+convertirCaF(100));
    }
    public static double convertirFaC(double fa) {
        double resu;
            resu = (fa - 32) * (5.0 / 9.0);
                return resu;
    }
    public static double convertirCaF(double ce) {
        double resu;
             resu = (ce * (9.0 / 5.0)) + 32;
                 return resu;
    }
    public static double convertirFaK(double fa) {
         double resu;
              resu = ((5.0 / 9.0) * (fa - 32) + 273.15);
                   return resu;
    }
    public static double convertirKaf(double ka) {
        double resu;
            resu = 1.8 * (ka - 273.15) + 32;
               return resu;
    }
}