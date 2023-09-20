public class Cuenta {
    
    private String id;
    private String nombre;
    private int balance = 0;

    // >>> CONSTRUCTORES <<<
    public Cuenta(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cuenta(String id, String nombre, int balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    // >>> GETTERS <<<
    public String getId() {
        return id;
    }

    public String getNombe() {
        return nombre;
    }

    public int getBalance() {
        return balance;
    }

    // >>> METODOS <<<
    public int credito(int monto){
        balance = balance + monto;
        return balance;
    }

    public int debito(int monto){

        if(monto <= balance){
            balance = balance - monto;
            
        }else{
            System.out.println("=== Saldo Insuficiente ===");
        }
        return balance;
    }

    public int tansferirA(Cuenta otro,int monto){

        if(monto <= balance){
            balance -= monto;
            otro.credito(monto);
        }else{
            System.out.println("\n=== El saldo es insuficienta para realizar la transferencia ===");
        }
        return balance;
    }

    @Override
    public String toString(){
        return "Cuenta [ID= " + id + " ---- Nombre= " + nombre + " ---- Balance= " + balance + "]";
    }
}
