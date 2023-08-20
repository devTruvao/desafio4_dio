package entities;

public abstract class Account implements AccountServices{
   
    private String name;
    private int number;
    private double saldo;
    private String tipo;

    public Account(String name, int number, double saldo, String tipo){
        this.name = name;
        this.number = number;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public Double deposito(Double valor) {
        return saldo += valor;
    }

    @Override
    public void saque(Double valor) {
        saldo = getSaldo() - valor;
    }

}
