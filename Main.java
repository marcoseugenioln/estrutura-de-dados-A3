import src.*;

/**
 * Main
 */
public class Main {

    public static int [] conjunto01 =  {1, 2, 3, 4 , 5};
    public static int [] conjunto02 =  {6, 7, 8, 9 , 10};

    public static void main(String[] args) {

        Lista lista = new Lista(5);
        Pilha pilha = new Pilha(5);
        Fila fila = new Fila(10);

        for(int i = 0; i < lista.getSize(); i++){
            lista.add(conjunto01[i]);
        }

        for(int i = 0; i < pilha.getSize(); i++){
            pilha.add(lista.remove(i));
        }

        pilha.read();

        for(int i = 0; i < pilha.getSize(); i++){
            System.out.println(pilha.remove(i));
        }

        pilha.read();
        fila.read();
    }
}