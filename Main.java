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

        /*Insira os números [1, 2, 3, 4 e 5] em uma lista com 5 células*/
        System.out.println("Passo 1:\n");
        for(int i = 0; i < lista.getSize(); i++){
            lista.add(conjunto01[i]);
        }
        lista.read();

        /*Remova todos os dados da lista e insira-os em uma Pilha com 5 células*/
        System.out.println("Passo 2:\n");
        for(int i = 0; i < pilha.getSize(); i++){
            pilha.add(lista.remove(i));
        }
        lista.read();
        pilha.read();

        /*Remova os dados da Pilha e insira-os em uma Fila com 10 células*/
        System.out.println("Passo 3:\n");
        for(int i = 0; i < pilha.getSize(); i++){
            fila.add(pilha.remove());
        }
        pilha.read();
        fila.read();

        /*Insira os números [6, 7, 8, 9 e 10] na lista*/
        System.out.println("Passo 4:\n");
        for(int i = 0; i < lista.getSize(); i++){
            lista.add(conjunto02[i]);
        }
        lista.read();

        /*Remova todos os dados da lista e insira-os em uma Pilha com 5 células*/
        System.out.println("Passo 5:\n");
        for(int i = 0; i < pilha.getSize(); i++){
            pilha.add(lista.remove(i));
        }
        lista.read();
        pilha.read();

        /*Remova os dados da Pilha e insira-os em uma Fila com 10 células*/
        System.out.println("Passo 6:\n");
        for(int i = 0; i < pilha.getSize(); i++){
            fila.add(pilha.remove());
        }
        pilha.read();
        fila.read();
    }
}
/*
Output:
Passo 1:
Lista = { 1, 2, 3, 4, 5 }

Passo 2:
Pile is full!
Lista = { 0, 0, 0, 0, 0 }
Pilha = { 1, 2, 3, 4, 5 }

Passo 3:
Pilha = { 0, 0, 0, 0, 0 }
Fila = { 5, 4, 3, 2, 1, 0, 0, 0, 0, 0 }

Passo 4:
Lista = { 6, 7, 8, 9, 10 }

Passo 5:
Pile is full!
Lista = { 0, 0, 0, 0, 0 }
Pilha = { 6, 7, 8, 9, 10 }

Passo 6:
Queue is full!
Pilha = { 0, 0, 0, 0, 0 }
Fila = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 }

Explicação:
A fila está ordenada de forma diferente da inserida por causa da presença de pilhas.
A lista recebe os números em ordem (Passo 1), seus membros são removidos em ordem também
e inseridos corretamente na pilha (Passo 2)

*/