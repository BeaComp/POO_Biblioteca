
//Beatriz Cristina de Faria RA: 2349710
//POO - C31

import java.util.ArrayList;
import java.util.List;

public class BdCientifico {
     private List<Cientificos> bdCientifico = new ArrayList<Cientificos>();

    public List<Cientificos> getBdCientifico() {
        return bdCientifico;
    }

    public Cientificos cadCientifico(Cientificos alt) {

        if (verifyLivro(alt.getNome()) == null) {
            bdCientifico.add(alt);
            return alt;
        } else {
            return null;
        }

    }

    public Cientificos verifyLivro(String alt) {
        for (int i = 0; i < bdCientifico.size(); i++) {
            if (alt.equals(bdCientifico.get(i).getNome())) {
                return bdCientifico.get(i);
            }
        }
        return null;
    }

    public Cientificos removeAlternate(Cientificos alt) {

        if (verifyLivro(alt.getNome()) != null) {
            bdCientifico.remove(alt);
            return null;
        } else {
            return alt;
        }

    }

    public Cientificos atualizaMotorAlternado(Cientificos alt) {
        for (int i = 0; i < bdCientifico.size(); i++) {
            if (alt.getNome().equals(bdCientifico.get(i).getNome())) {
                bdCientifico.set(i, alt);
                return bdCientifico.get(i);
            }
        }
        return null;
    }

}

