import ordenadores.Ordenador;
import ordenadores.OrdenarPorContagem;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 4, -2, 2};
        Ordenador o = new OrdenarPorContagem();
        o.ordene(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
