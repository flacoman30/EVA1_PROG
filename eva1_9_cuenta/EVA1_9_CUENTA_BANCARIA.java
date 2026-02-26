package eva1_9_cuenta_bancaria;
public class EVA1_9_CUENTA_BANCARIA {
    private String titular;
       private double saldo;
    public String getTitular() {
        return titular;
    }
    public void setTitular(String valor) {
        titular = valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) {
        saldo = saldo + monto;
    }
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
        }else{
    System.out.println("error: fondo insuficientes para retirar" + monto);
        }}
    public void imprimirDatos() {
      System.out.println("---------Estado de cuenta---------");
        System.out.println("Titular: " + titular);
          System.out.println("Saldo Actual" + saldo);
    }
    public static void main(String[] args) {
      EVA1_9_CUENTA_BANCARIA cuenta = new EVA1_9_CUENTA_BANCARIA(); 
        cuenta.setTitular("Monarga");
             cuenta.depositar(500.0);
              cuenta.retirar(80.0);
               cuenta.retirar(280.0);
                cuenta.imprimirDatos();
    }
}