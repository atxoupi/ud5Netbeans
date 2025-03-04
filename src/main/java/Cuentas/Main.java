package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        operativa_cuenta(cuenta1);
           
    }
    public static void operativa_cuenta(CCuenta cuenta){
        double saldoActual = cuenta.estado();
        float cantidad;
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cantidad = 2300;
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            cantidad = 695;
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
