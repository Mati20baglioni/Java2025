public class CuentaBanco {
    int id;
    String usuario;
    double balance;

    public CuentaBanco(int id, String usuario, double balance) {
        this.id = id;
        this.usuario = usuario;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //metodos.


    public double acreditarBalance(double monto){
        this.balance+=monto;
        return balance;
    }

    public double debitarBalance(double monto){
        if(monto>balance){
            System.out.println("Saldo Insuficiente.");
        }else {
            System.out.println("Operacion Exitosa.");
            balance=balance-monto;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", balance=" + balance +
                '}';
    }
}
