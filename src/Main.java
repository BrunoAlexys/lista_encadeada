public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();


        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);

        System.out.println(lista.last());




    }
}