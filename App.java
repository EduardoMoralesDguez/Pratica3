import java.util.Date;

public class App {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1122, 20000.0, 4.5, new Date());
        
        c1.withdraw(2000.0);
        System.out.println("Se retiro 2000 pesos \n Total: " + c1.getBalance());

        c1.deposit(3000.0);
        System.out.println("Se ingreso 3000 pesos \n Total: " + c1.getBalance());

        System.out.println("Id: " + c1.getId());

        System.out.println("Interes mensual: "+ c1.getMonthlyInterest());

        System.out.println("Fecha de creacion: " + c1.getDateCreated());
    }
}
