public class App {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(1122, 20000.0, 4.5, null);
        
        c1.withdraw(2000.0);
        System.out.println("Se ingreso dinero \n Total: " );
        c1.getBalance();

        c1.deposit(3000.0);
        System.out.println("Se retiro dinero \n Total: ");
        c1.getBalance();

        System.out.println("Interes mensual: ");
        c1.getMonthlyInterest();

        c1.getDateCreated();
    }
}
