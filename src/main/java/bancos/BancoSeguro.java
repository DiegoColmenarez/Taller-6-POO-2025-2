package bancos;

public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
}
class Ladron{
    public static void main(String[] args) {
        var hack = new BancoSeguro(0);
       // hack.saldo = -9999;
        hack.setSaldo(-99999);
        System.out.println(hack.getSaldo());
    }
}
