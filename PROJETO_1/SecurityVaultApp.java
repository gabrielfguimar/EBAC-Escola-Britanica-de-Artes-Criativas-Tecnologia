import java.util.Scanner;

public class SecurityVaultApp {
    public static void main(String[] args) {
        VaultDAO vaultDAO = new VaultDAOImpl(); // Injeção de dependência
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Security-Vault-z4 Ativo ---");
        
        // Exemplo rápido de "Create"
        vaultDAO.salvar(new VaultItem(1, "Chave Pix", "ABC-123-XYZ"));
        
        // Listagem
        System.out.println("Itens no cofre: ");
        vaultDAO.listarTodos().forEach(System.out::println);
        
        scanner.close();
    }
}