package examenR;

public class Elemento{

    private int fila;
    private Par elem;

    public Elemento(int pFila, Par pPar){
        fila = pFila;
        elem = pPar;
    }

    public Elemento(int pFila, double pValor, int pColumna){
        fila = pFila;
        elem = new Par(pColumna, pValor);
    }

    public int getFila() {
        return fila;
    }

    public Par getElem() {
        return elem;
    }
}