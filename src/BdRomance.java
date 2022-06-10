
//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import java.util.ArrayList;
import java.util.List;

public class BdRomance {
     private List<Romance> bdRomance = new ArrayList<Romance>();

    public List<Romance> getBdRomance() {
        return bdRomance;
    }

    public Romance cadRomance(Romance alt) {

        if (verifyLivro(alt.getNome()) == null) {
            bdRomance.add(alt);
            return alt;
        } else {
            return null;
        }

    }

    public Romance verifyLivro(String alt) {
        for (int i = 0; i < bdRomance.size(); i++) {
            if (alt.equals(bdRomance.get(i).getNome())) {
                return bdRomance.get(i);
            }
        }
        return null;
    }

    public Romance removeRomance(Romance alt) {

        if (verifyLivro(alt.getNome()) != null) {
            bdRomance.remove(alt);
            return null;
        } else {
            return alt;
        }

    }

    public Romance atualizaLivroRomance(Romance alt) {
        for (int i = 0; i < bdRomance.size(); i++) {
            if (alt.getNome().equals(bdRomance.get(i).getNome())) {
                bdRomance.set(i, alt);
                return bdRomance.get(i);
            }
        }
        return null;
    }

}

