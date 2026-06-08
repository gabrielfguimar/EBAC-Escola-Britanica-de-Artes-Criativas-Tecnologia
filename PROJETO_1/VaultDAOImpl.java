import java.util.ArrayList;
import java.util.List;

public class VaultDAOImpl implements VaultDAO {
    private List<VaultItem> bancoDeDadosMemoria = new ArrayList<>();

    @Override
    public void salvar(VaultItem item) {
        bancoDeDadosMemoria.add(item);
    }

    @Override
    public List<VaultItem> listarTodos() {
        return new ArrayList<>(bancoDeDadosMemoria);
    }

    @Override
    public void atualizar(VaultItem itemAtualizado) {
        for (VaultItem item : bancoDeDadosMemoria) {
            if (item.getId() == itemAtualizado.getId()) {
                item.setDescricao(itemAtualizado.getDescricao());
                item.setConteudo(itemAtualizado.getConteudo());
                break;
            }
        }
    }

    @Override
    public void deletar(int id) {
        bancoDeDadosMemoria.removeIf(item -> item.getId() == id);
    }
}