public abstract class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    protected double saldo;
    private final double COMISION;

    public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.COMISION = 1.2;
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    public CuentaBancaria() {
        this("", TipoDeCuenta.AHORRO, 0.0);
    }

    public void sacarDinero(double cantidad) {
        if (!(cantidad < 0.0)) {
            this.saldo -= cantidad;
        }
    }

    public void ingresarDinero(double cantidad) {
        if (!(cantidad < 0.0)) {
            this.saldo += cantidad;
        }
    }

    public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
        this.tipoDeCuenta = nuevoTipo;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }

    public abstract void informarSobreCondicionesLegales();
}
