package mayo2017;

import java.util.ArrayList;
import java.util.List;

public class Barco{

    private String identificador;
    private List<Casilla> listaCasillas;

    public Barco(String pId){
        identificador = pId;
        listaCasillas = new ArrayList<Casilla>();
    }

    public List<Casilla> getListaCasillas() {
        return listaCasillas;
    }

    public void setListaCasillas(List<Casilla> listaCasillas) {
        this.listaCasillas = listaCasillas;
    }

    public void add(Casilla pC){
        listaCasillas.add(pC);
    }

    @Override
    public String toString() {
        return "Barco [identificador=" + identificador + ", listaCasillas=" + listaCasillas + "]";
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

}