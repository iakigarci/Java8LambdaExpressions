package julio2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RevisoresAutomaticos{

    private List<RevisorAutomatico> listaRevisores = new ArrayList<>();
    private static RevisoresAutomaticos mRevisoresAutomaticos = new RevisoresAutomaticos();


    private RevisoresAutomaticos(){
    }
    

    public RevisoresAutomaticos getmRevisoresAutomaticos() {
        return mRevisoresAutomaticos;
    }

    public void setmRevisoresAutomaticos(RevisoresAutomaticos mRevisoresAutomaticos) {
        this.mRevisoresAutomaticos = mRevisoresAutomaticos;
    }

    private Iterator<RevisorAutomatico> getIterator(){
        return listaRevisores.iterator();
    }

    public List<RevisorAutomatico> getListaRevisores() {
        return listaRevisores;
    }

    public void setListaRevisores(List<RevisorAutomatico> listaRevisores) {
        this.listaRevisores = listaRevisores;
    }

    
}