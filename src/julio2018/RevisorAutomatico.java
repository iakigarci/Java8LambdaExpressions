package julio2018;

import java.util.List;

public class RevisorAutomatico{

    private String id;
    private List<String> listaTemas;

    public RevisorAutomatico(String pId){
        id = pId;
    }

    public List<String> getListaTemas() {
        return listaTemas;
    }

    public void setListaTemas(List<String> listaTemas) {
        this.listaTemas = listaTemas;
    }

    public boolean esAdecuado(Articulo pArticulo){
        return false;
    }

    public boolean esExperto(String pTema){
        return false;
    }

    public float obtPorcentajeTemasExperto(Articulo pArticulo){
        long numTemasExpertos = listaTemas.stream().filter(t->pArticulo.getListaTemas().stream().anyMatch(t1->t1.equals(t))).count();
        int numArticulos = pArticulo.getListaTemas().size();
        return (100*numTemasExpertos)/numArticulos;
    }



}