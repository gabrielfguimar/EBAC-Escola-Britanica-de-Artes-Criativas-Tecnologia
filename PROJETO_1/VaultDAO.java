import java.util.List;

public interface VaultDAO {
    void salvar(VaultItem item);
    List<VaultItem> listarTodos();
    void atualizar(VaultItem item);
    void deletar(int id);
}