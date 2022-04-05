/**
 * Lista
 */
package src;

public class Lista {

    public Lista(int size){
        setSize(size);
        lista = new int [size];
    }

    /* Private atributes */
    private int size;
    private int emptyPosition = 0;
    private int lista [];
    private boolean enabled = true;

    private void setSize(int size) {
        this.size = size;
    }
    
    private void disable(){
        this.enabled = false;
    }

    public void add(int data){
        if(this.enabled){
            lista[this.emptyPosition] = data;
            this.emptyPosition = this.emptyPosition + 1;
            if(this.emptyPosition == size - 1){
                System.out.println("List is full!");
            }
        }
        else{
            System.out.println("List if full!");
        }
    }

    public void add(int data, int index){
        if(index > size - 1){
            System.out.println("Index out of range!");
            return;
        }
        lista[index] = data;
    }

    public int remove(int index){
        int removed = this.lista[index];
        add(0, index);
        return removed;
    }

    public boolean contains(int data){

        boolean result = false;

        for(int i = 0; i < this.size; i++){
            if(lista[i] == data){
                result = true;
            }
        }

        return result;
    }

    public int getSize(){
        return this.size;
    }

    public void read(){
        System.out.print("{ ");
        for (int i = 0; i < size; i++){
            if (i == size - 1){
                System.out.print(this.lista[i] + " }");
            }
            else{
                System.out.print(this.lista[i] + ", ");
            }
        }
        System.out.println("\n");
    }

    public void read(int index){
        System.out.println("\n");
        System.out.print("[" + this.lista[index] + "]");
        System.out.println("\n");
    }
}