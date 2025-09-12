package bancos;

public class Banco {
    protected double saldo;
    public Banco(double saldo) {
        this.saldo = saldo;
    }
}
class Hack extends Banco {
    public Hack(double saldo){
        super(saldo);
    }
    public void robar(){
        this.saldo = 999999;
    }

    public static void main(String[] args) {
        var usuarioSinSaldo = new Banco(0);
        System.out.println("Dinero del usuario: " + usuarioSinSaldo.saldo);
        System.out.println("Usuario despues de hackear:");
        var eseMismoUsuario = new Hack(0);
        eseMismoUsuario.robar();
        System.out.println("Dinero del usuario: " + eseMismoUsuario.saldo);
    }
}


