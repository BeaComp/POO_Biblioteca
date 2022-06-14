//Beatriz Cristina de Faria RA: 2349710
//POO - C31


import java.util.ArrayList;
import java.util.List;

public class BdHQ {
     private List<HQ> bdHQ = new ArrayList<HQ>();

    public List<HQ> getBdHQ() {
        return bdHQ;
    }

    public HQ cadHQ(HQ alt) {

        if (verifyLivro(alt.getNome()) == null) {
            bdHQ.add(alt);
            return alt;
        } else {
            return null;
        }

    }

    public HQ verifyLivro(String alt) {
        for (int i = 0; i < bdHQ.size(); i++) {
            if (alt.equals(bdHQ.get(i).getNome())) {
                return bdHQ.get(i);
            }
        }
        return null;
    }

    public HQ removeHQ(HQ alt) {

        if (verifyLivro(alt.getNome()) != null) {
            bdHQ.remove(alt);
            return null;
        } else {
            return alt;
        }

    }

    public HQ atualizaLivroHQ(HQ alt) {
        for (int i = 0; i < bdHQ.size(); i++) {
            if (alt.getNome().equals(bdHQ.get(i).getNome())) {
                bdHQ.set(i, alt);
                return bdHQ.get(i);
            }
        }
        return null;
    }

}
