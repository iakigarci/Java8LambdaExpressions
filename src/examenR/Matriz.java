package examenR;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Matriz{

    private ArrayList<Elemento> lista;

    public Matriz(){
        lista = new ArrayList<>();
    }

    public ArrayList<Double> getVectorFila(int pFila){
       return (ArrayList<Double>) lista.stream().filter(e1->e1.getFila()==pFila).map(e2 -> e2.getElem().getValor()).collect(Collectors.toList());
    }

    public ArrayList<Double> getVectorColumna(int pColumna){
        ArrayList<Double> listaValoraciones = new ArrayList<>();
        lista.stream().filter(e1->e1.getElem().getColumna()==pColumna).forEach(e2->listaValoraciones.add(e2.getElem().getValor()));
        return listaValoraciones;
    }

    public ArrayList<Double> normalizarColumna(int pColumna){
        ArrayList<Double> listaValoraciones = getVectorColumna(pColumna);
        double modulo = calcularModuloVector(listaValoraciones);
        return (ArrayList<Double>) listaValoraciones.stream().map(a1->a1/modulo).collect(Collectors.toList());
    }

    public double calcularModuloVector(ArrayList<Double> pLista){
        double suma = pLista.stream().mapToDouble(a1->a1*a1).sum();
        return Math.sqrt(suma);
    }

    public List<Elemento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Elemento> lista) {
        this.lista = lista;
    }
}