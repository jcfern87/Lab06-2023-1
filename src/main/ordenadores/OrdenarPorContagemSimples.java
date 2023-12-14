package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int maior = array[0];
        for (int i : array) {
            if(i> maior){
                maior = i;
            }
        }
        boolean[] novo = new boolean[maior+1]; 
        for(int i = 0; i < array.length; i++){
            novo[array[i]] = true; 
        } 
        int p = 0;
        for(int i = 0; i<novo.length;i++){
            if(novo[i] == true){
                array[p] = i;
                p++;
            }
        }
        array[array.length - 1] = maior;
        return array;
    }
    
}
