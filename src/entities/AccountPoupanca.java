package entities;

public class AccountPoupanca extends Account{

    public AccountPoupanca(String name, int number, double saldo, String tipo) {
        super(name, number, saldo, tipo);
    }

    @Override
    public Double deposito(Double valor) {
        // TODO Auto-generated method stub
        return super.deposito(valor);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public int getNumber() {
        // TODO Auto-generated method stub
        return super.getNumber();
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        return super.getTipo();
    }

    @Override
    public void saque(Double valor) {
        // TODO Auto-generated method stub
         super.saque(valor);
    }

    @Override
    public void setTipo(String tipo) {
        // TODO Auto-generated method stub
        super.setTipo(tipo);
    }
    
    public double jurosLucro(){
        return super.getSaldo() * 0.10;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
        + "Number: " + getNumber() + "\n"
        + "Saldo: " + getSaldo() + "\n"
        + "Tipo: " + getTipo() + "\n"
        + "Juros lucro: " + jurosLucro();
    }
}
