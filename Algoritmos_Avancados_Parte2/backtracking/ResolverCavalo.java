public class ResolverCavalo {
    
    // Variáveis da classe
    private int[][] tabuleiro = new int[8][8];
    private int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    // Construtor para inicializar o tabuleiro com -1
    public ResolverCavalo() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = -1;
            }
        }
    }

    private boolean ehValido(int x, int y) {
        return (x >= 0 && x < 8 && y >= 0 && y < 8 && tabuleiro[x][y] == -1);
    }

    public boolean resolverCavalo(int x, int y, int contagem) {
        if (contagem == 64) return true;

        for (int i = 0; i < 8; i++) {
            int novoX = x + dx[i];
            int novoY = y + dy[i];

            if (ehValido(novoX, novoY)) {
                tabuleiro[novoX][novoY] = contagem;
                if (resolverCavalo(novoX, novoY, contagem + 1)) return true;
                tabuleiro[novoX][novoY] = -1; // Backtracking
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ResolverCavalo solver = new ResolverCavalo();
        solver.tabuleiro[0][0] = 0;
        
        if (solver.resolverCavalo(0, 0, 1)) {
            System.out.println("Solução encontrada!");
        } else {
            System.out.println("Sem solução encontrada para este início.");
        }
    }
}