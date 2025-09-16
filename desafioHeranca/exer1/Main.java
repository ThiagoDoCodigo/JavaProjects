import entidades.ContaPoupanca;
import entidades.ContaEmpresarial;

public class Main{
   public static void main(String[] args) {
        System.out.println("Conta Poupanca:");
        ContaPoupanca cp = new ContaPoupanca(123, "Joao", 0.05);

        cp.depositar(1000);
        cp.atualizarSaldo(); 
        cp.sacar(200);       

        System.out.println("\nConta Empresarial:");
        ContaEmpresarial ce = new ContaEmpresarial(456, "Maria", 5000);

        ce.depositar(3000);
        ce.emprestar(1000); 
        ce.emprestar(5000); 
        ce.emprestar(1200); 
        ce.sacar(400);      

        System.out.println("\nSaldos Finais:");
        System.out.println("Conta Poupança - Joao: " + cp.getSaldo());
        System.out.println("Conta Empresarial - Maria: " + ce.getSaldo());
    }
}