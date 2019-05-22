package mayo2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tablero{

    private List<Barco> flota;

    public Tablero(){
        flota = new ArrayList<>();
    }

    public List<Barco> getFlota() {
        return flota;
    }

    public void setFlota(List<Barco> flota) {
        this.flota = flota;
    }

    public ArrayList<Casilla> dispararMisilBOOM(int pFila, int pCol){
        ArrayList<Casilla> listaCaillas = new ArrayList<>();
        flota.stream().forEach(b->b.getListaCasillas().stream().filter(c->c.haImpactado(pFila, pCol)).forEach(ci->listaCaillas.add(ci)));
        return listaCaillas;

    }

    public void add(Barco pB){
        flota.add(pB);
    }
    
    public ArrayList<Casilla> obtenerTodasLasCasillas() {
        ArrayList<Casilla> lCasillas = new ArrayList<>();
        flota.stream().forEach(b->b.getListaCasillas().stream().forEach(c->lCasillas.add(c)));
        return lCasillas;
    }

    public void imprimirCasillas(int pFila, int pCol){
        ArrayList<Casilla> casillasImpactadas = this.dispararMisilBOOM(pFila, pCol);
        flota.stream().forEach(b->b.getListaCasillas().stream().filter(c->casillasImpactadas.contains(c)).forEach(c1->System.out.println(b.getIdentificador()+" "+c1)));
    }
}