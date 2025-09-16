import entidades.FuncionarioPF;
import entidades.FuncionarioPJ;

public class Main {
    public static void main(String[] args) {
        System.out.println("FuncionarioPF:");
        
        FuncionarioPF pf1 = new FuncionarioPF("Thiago", 2500.0, "123.456.789-09"); 
        System.out.println(pf1.imprimirDados());
        System.out.println("========================================\n");
        
        FuncionarioPF pf2 = new FuncionarioPF("Ana", 3000.0, "111.111.111-11");
        System.out.println(pf2.imprimirDados());
        System.out.println("========================================\n");
        
        pf1.setCPF("000.000.000-00");
        System.out.println("========================================\n");
        
        pf1.setCPF("987.654.321-00"); 
        System.out.println(pf1.imprimirDados());
        System.out.println("========================================\n");

        System.out.println("\nFuncionarioPJ:");
        System.out.println("========================================\n");
        
        FuncionarioPJ pj1 = new FuncionarioPJ("Empresa X", 5000.0, "12.345.678/0001-95");
        System.out.println(pj1.imprimirDados());
        System.out.println("========================================\n");
        
        FuncionarioPJ pj2 = new FuncionarioPJ("Empresa Y", 7000.0, "11.111.111/1111-11");
        System.out.println(pj2.imprimirDados());
        System.out.println("========================================\n");
        
        pj1.setCNPJ("00.000.000/0000-00");
        System.out.println("========================================\n");
        
        pj1.setCNPJ("98.765.432/0001-10"); 
        System.out.println(pj1.imprimirDados());
        System.out.println("========================================\n");
    }
}