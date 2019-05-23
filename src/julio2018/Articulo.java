package julio2018;

import java.util.List;

public class Articulo{

    private String titulo;
    private String fichero;
    private List<String> listaTemas;

    public Articulo(String pTit, String pFicher){
        titulo = pTit;
        fichero = pFicher;
        
    }

    public List<String> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(List<String> listaTemas) {
        this.listaTemas = listaTemas;
    }

    
    
}