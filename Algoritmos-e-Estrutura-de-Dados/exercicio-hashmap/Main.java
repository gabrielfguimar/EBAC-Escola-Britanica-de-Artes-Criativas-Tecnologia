public class Main {
    public static void main(String[] args) {
        MeuHashMap mapa = new MeuHashMap();

        // Testando put()
        mapa.put(1, 100);
        mapa.put(11, 200); // Gera colisão com chave 1 (11 % 10 = 1)
        mapa.put(2, 300);

        // Testando get()
        System.out.println("Valor da chave 1: " + mapa.get(1));
        System.out.println("Valor da chave 11: " + mapa.get(11));

        // Testando delete()
        mapa.delete(1);
        System.out.println("Valor da chave 1 após delete: " + mapa.get(1));

        // Testando clear()
        mapa.clear();
        System.out.println("Valor da chave 11 após clear: " + mapa.get(11));
    }
}