public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // 1. Testando push() - Adicionando ao fim
        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));
        System.out.print("Lista inicial: ");
        lista.printList(); // Deve ser 10 -> 20 -> 30 -> null

        // 2. Testando insert() - Inserindo no índice 1
        lista.insert(1, new Node(15));
        System.out.print("Após inserir 15 no índice 1: ");
        lista.printList(); // Deve ser 10 -> 15 -> 20 -> 30 -> null

        // 3. Testando elementAt()
        Node n = lista.elementAt(2);
        System.out.println("Elemento no índice 2: " + (n != null ? n.valor : "null"));

        // 4. Testando remove() - Removendo índice 2 (o valor 20)
        lista.remove(2);
        System.out.print("Após remover índice 2: ");
        lista.printList();

        // 5. Testando pop() - Removendo do fim
        Node removido = lista.pop();
        System.out.println("Nó removido pelo pop: " + removido.valor);
        System.out.print("Lista final: ");
        lista.printList();
        
        System.out.println("Tamanho final da lista: " + lista.size());
    }
}