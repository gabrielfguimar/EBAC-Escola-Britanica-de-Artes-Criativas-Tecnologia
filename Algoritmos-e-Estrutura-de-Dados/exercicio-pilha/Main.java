public class Main {
    public static void main(String[] args) {
        // 1. Instancia a pilha com capacidade para 5 elementos
        MinhaPilha pilha = new MinhaPilha(5);

        // 2. Testando isEmpty()
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        // 3. Testando push()
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Tamanho atual: " + pilha.size()); // Deve ser 3

        // 4. Testando top()
        System.out.println("Elemento no topo: " + pilha.top()); // Deve ser 30

        // 5. Testando pop()
        System.out.println("Removido: " + pilha.pop()); // Deve remover 30
        System.out.println("Novo topo após pop: " + pilha.top()); // Deve ser 20

        // 6. Testando esvaziamento
        pilha.pop(); // Remove 20
        pilha.pop(); // Remove 10
        System.out.println("A pilha está vazia agora? " + pilha.isEmpty());
    }
}