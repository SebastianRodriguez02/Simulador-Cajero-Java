package appcajero;

import java.util.Scanner;

public class AppCajero {

    public static void menuOpciones() {
        // Aquí van las instrucciones del ayudante

        System.out.println("Para continuar, selecciona la opción deseada  \n1 Consulta tu saldo \n2 Retirar dinero \n3 Consignar dinero \n4 Ver historial de movimientos \n5 Hablar con un asesor \n6 Salir");

    }

    public static void verHistorial(int indiceHistorial, String[] historial) {
        for (int i = 0; i < indiceHistorial; i++) {
            System.out.println(historial[i]);
        }

    }

    public static int calcularNuevoSaldo(int saldoActual, int dineroIngresado) {
        int nuevoSaldo = saldoActual + dineroIngresado;
        return nuevoSaldo;

    }
    
    public static boolean validarRetiro(int retiro, int ahorros) {
        if (retiro > ahorros) {
            return false;
        } else {
            return true;
        }

    }
    
    
    
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        int pin = 1234;
        int intentos = 3;
        int pinIngresado = 0;
        int opcion = 0;
        int ahorros = 1000;
        int ingreso;
        int retiro;
        String[] historial = new String[10];
        int indiceHistorial = 0;

        while (pinIngresado != pin && intentos > 0) {

            System.out.println("Ingresa la contraseña de tu tarjeta");
            pinIngresado = objScanner.nextInt();

            intentos--;

            if (pinIngresado != pin && intentos > 0) {
                System.out.println("PIN incorrecto. Te quedan " + intentos + " intentos");
            }
        }
        if (pinIngresado == pin) {
            System.out.println("--Bienvenido al Banco InterAmericando de Colombia--");

            while (opcion != 5 && opcion !=6) {

                menuOpciones();
                opcion = objScanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Tu saldo actual es de $ " + ahorros);
                        break;
                    case 2:
                        System.out.println("Cuánto dinero desea retirar");
                        retiro = objScanner.nextInt();
                        boolean aprobado = validarRetiro(retiro, ahorros);
                        if (aprobado) {
                            
                            System.out.println("Has retirado $ " + retiro + " tu saldo actual es de: $ " + (ahorros - retiro));
                            ahorros -= retiro;
                            historial[indiceHistorial] = "Retiro: $" + retiro;
                            indiceHistorial++;  
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;
                    case 3:
                        System.out.println("Cuánto dinero desea consignar");
                        ingreso = objScanner.nextInt();
                        ahorros = calcularNuevoSaldo(ahorros, ingreso);
                        historial[indiceHistorial] = "Consignaste: $" + ingreso;
                        indiceHistorial++;
                        break;
                    case 4:
                        System.out.println("Historial de movimientos");
                        verHistorial(indiceHistorial, historial);

                        break;
                    case 5:
                        System.out.println("Estás siendo redireccionado con un asesor disponible para atender tu solicitud");
                        break;
                    case 6:
                        System.out.println("Gracias por usar nuestros servicios");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }
        } else {
            System.out.println("TARJETA BLOQUEADA, Comuniquese con el banco al número de teléfono 42203030 para desbloquearla");
        }

    }
}
