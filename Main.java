import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        ArrayList<Cuenta> Cuentas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Cuentas.add(new Cuenta(i, 100));
        }

        while (true) {
            System.out.println("Ingrese un identificador válido: ");
            int opcion = s1.nextInt();

            if (opcion >= 0 && opcion < 10){
                Cuenta actual = Cuentas.get(opcion);
                int opcion2;
                do {
                    System.out.println("---Ingrese la accion que desee realizar---");
                    System.out.println("1.Consultar Saldo \n 2.Retirar \n 3. Depositar \n 4.Salir");
                    System.out.println("Ingrese una opción: ");
                    opcion2 = s1.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Saldo actual: "+ actual.getBalance());
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad que desee retirar: ");
                            double cantidad = s1.nextInt();
                            actual.withdraw(cantidad);
                                if (cantidad < actual.getBalance()) {
                                    System.out.println("Se retiro: "+ cantidad);
                                }
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad que desee ingresar: ");
                            double cant = s1.nextInt();
                            actual.deposit(cant);
                            System.out.println("Se ingreso: "+ cant);
                            break;
                        case 4:
                            System.out.println("Saliendo del programa... ");
                            break;
                        default:
                            System.out.println("Elija un opción que se encuentre en el menú");
                            break;
                    }
                } while (opcion2 != 4);
            }
        } 
    }
}