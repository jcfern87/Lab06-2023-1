package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int inicio = array[0];
        int fim = array.length-1;
        quickParticio(array, inicio, fim);
        

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo = array[inicio];
        int i = inicio;
        for (int j = inicio + 1; j <= fim; j++) {
            if(array[j]<=pivo){
                i++;
                int x = array[i];
                array[i] = array[j];
                array[j] = x;
            }
        }
        int y = array[i];
        array[i] = array[inicio];
        array[inicio] = y;
        return i;

        
    }
    
}
