public class VaultItem {
    private int id;
    private String descricao;
    private String conteudo;

    public VaultItem(int id, String descricao, String conteudo) {
        this.id = id;
        this.descricao = descricao;
        this.conteudo = conteudo;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getConteudo() { return conteudo; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    @Override
    public String toString() {
        return String.format("[ID: %d] | %s | Conteúdo: %s", id, descricao, conteudo);
    }
}