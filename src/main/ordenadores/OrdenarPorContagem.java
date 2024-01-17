package ordenadores;
public class OrdenarPorContagem implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int size = 0;
        if (min < 0) {
            size = max - min + 1;
        }
        else {
            size = max + 1;
        }
        int[] order = new int[size];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            index = array[i] - min;
            order[index]++;        
        }
        int j = 0;
        for (int i = 0; i < order.length; i++) {
            if(order[i] > 0){
                while(order[i] > 0) {
                    array[j] = i + min;
                    order[i]--;
                    j++;
                }
            }
        }
        return array;
    }

}
