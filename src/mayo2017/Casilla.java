package mayo2017;

public class Casilla{
    private int fila;
    private int col;

    public Casilla(int pFila, int pCol){
        this.col = pCol;
        this.fila = pFila;
    }
    
    public int getFila() {
        return fila;
    }

    public int getCol() {
        return col;
    }

    public boolean haImpactado(int pFila, int pCol){
        if (fila==pFila || col==pCol) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Casilla [col=" + col + ", fila=" + fila + "]";
    }

    
}