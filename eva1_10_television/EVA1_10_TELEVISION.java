package eva1_10_television;

public class EVA1_10_TELEVISION {

    private boolean encendido;
    private int volumen;
    private int canal;

    public EVA1_10_TELEVISION() {
        System.out.println("Creando objeto tipo Television!!!!!");
        encendido = false;
        volumen = 10;
        canal = 3;
    }
    public EVA1_10_TELEVISION(boolean On, int vol, int can) {
        System.out.println("Creando objeto tipo Television con parametros!!!!!");
        encendido = On;
        volumen = vol;
        canal = can;
    }

    public void encenderApagar() {
        encendido = !encendido;
    }

    public void imprimirDatos() {
        if (encendido) {
            System.out.println("TV encendida!!");
        } else {
            System.out.println("TV apagada");
        }
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("-------------------------");
    }

    public void subirVolumen() {
      
        if (encendido && (volumen < 100)) {
            volumen += 5;
        }
    }

    public void bajarVolumen() {
       
        if (encendido && (volumen > 0)) {
            volumen -= 5;
        }
    }

    public void subirCanal() {
        if (encendido) {
            if (canal >= 10) {
                canal = 0;
            } else {
                canal += 1;
            }
        }
    }

    public void bajarCanal() {
        if (encendido) {
            if (canal <= 0) {
                canal = 10;
            } else {
                canal -= 1;
            }
        }
    }

    public void setCanal(int valor) {
        if (encendido) {
            canal = valor;
        }
    }

    public static void main(String[] args) {
        EVA1_10_TELEVISION miTv = new EVA1_10_TELEVISION();
        
        miTv.encenderApagar(); 
        miTv.subirVolumen();   
        miTv.subirCanal();     
        
        miTv.imprimirDatos();
    }
}