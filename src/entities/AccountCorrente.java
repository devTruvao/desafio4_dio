package entities;

public class AccountCorrente extends Account{

    private double limiteDeCredito;

    public AccountCorrente(String name, int number, double saldo, String tipo, double limiteDeCredito) {
        super(name, number, saldo, tipo);
        this.limiteDeCredito = limiteDeCredito;
        
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
    public void saque(Double valor) {
        
        super.saque(valor + 5.0);
    }

    @Override
    public String getTipo() {
        return super.getTipo();
    }
     @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }


    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
        + "Number: " + getNumber() + "\n"
        + "Saldo: " + getSaldo() + "\n"
        + "Tipo: " + getTipo() + "\n"
        + "Limite de credito: " + getLimiteDeCredito();
    }
  
}
