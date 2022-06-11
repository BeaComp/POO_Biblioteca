
//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import java.util.ArrayList;
import java.util.List;

public class BdDidatico {
     private List<Didatico> bdDidatico = new ArrayList<Didatico>();

    public List<Didatico> getBdDidatico() {
        return bdDidatico;
    }

    public Didatico cadDidatico(Didatico alt) {

        if (verifyLivro(alt.getNome()) == null) {
            bdDidatico.add(alt);
            return alt;
        } else {
            return null;
        }

    }

    public Didatico verifyLivro(String alt) {
        for (int i = 0; i < bdDidatico.size(); i++) {
            if (alt.equals(bdDidatico.get(i).getNome())) {
                return bdDidatico.get(i);
            }
        }
        return null;
    }

    public Didatico removeDidatico(Didatico alt) {

        if (verifyLivro(alt.getNome()) != null) {
            bdDidatico.remove(alt);
            return null;
        } else {
            return alt;
        }

    }

    public Didatico atualizaLivroDidatico(Didatico alt) {
        for (int i = 0; i < bdDidatico.size(); i++) {
            if (alt.getNome().equals(bdDidatico.get(i).getNome())) {
                bdDidatico.set(i, alt);
                return bdDidatico.get(i);
            }
        }
        return null;
    }

}

