package src.ifma.lista03;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        // Definindo as variáveis como Strings
        String Cleide = "Cleide";
        String Maisa = "Maisa";
        String Cecilia = "Cecilia";
        String Guilherme = "Guilherme";

        // Adicionando as variáveis à lista
        list.adicionarInicio(Cleide);
        list.adicionarFim(Maisa);
        list.adicionarInicio(Cecilia);
        list.adicionarFim(Guilherme);

        System.out.println("Lista: " + list);

        System.out.println("Remover do começo: " + list.removerComeco());
        System.out.println("Lista após remoção: " + list);

        System.out.println("Remover do final: " + list.removerFinal());
        System.out.println("Lista após remoção: " + list);
    }
}
