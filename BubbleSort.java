import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int aux;
        int lista [] = new int [10];

        for (int l=0; l < lista.length; l++){ //alimentando lista
            lista [l] = random.nextInt(100);
        }

        for (int a =0; a<lista.length;a++){ //reordenando lista
            for (int i = 1; i < (lista.length-a-1); i++){
                if(lista[i-1]> lista [i]){
                    aux = lista[i-1];
                    lista [i-1]=lista[i];
                    lista [i]= aux;
                }
            }
        }

        for (int l : lista){ //exibindo lista
            System.out.println(l);
        }
    }
}
