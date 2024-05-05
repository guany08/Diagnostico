package Listas;
import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    public static int contadorImpares(List<Integer> lista){
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i) % 2) != 0){
                cont = cont + 1;
            }
        }
        return cont;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> lista){
        List<Integer> listaConsec = new ArrayList<>();
        for (int i = 0; i < (lista.size()-1); i++) {
            if (lista.get(i) == lista.get(i+1)-1){
                listaConsec.add(lista.get(i));
                listaConsec.add(lista.get(i+1));
            }
        }
        return listaConsec;
    }
}