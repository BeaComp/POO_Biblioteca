
//Beatriz Cristina de Faria RA: 2349710
//POO C31

import java.util.ArrayList;
import java.util.List;

public class BdLivro {
    
    private List<Livro> bdLivro = new ArrayList<Livro>();

    public List<Livro> getBdLivro() {
        return bdLivro;
    }

    public Livro cadLivro(Livro alt) {

        if (verifyLivro(alt.getNome()) == null) {
            bdLivro.add(alt);
            return alt;
        } else {
            return null;
        }

    }

    public Livro verifyLivro(String alt) {
        for (int i = 0; i < bdLivro.size(); i++) {
            if (alt.equals(bdLivro.get(i).getNome())) {
                return bdLivro.get(i);
            }
        }
        return null;
    }

    public Livro removeLivro(Livro alt) {

        if (verifyLivro(alt.getNome()) != null) {
            bdLivro.remove(alt);
            return null;
        } else {
            return alt;
        }

    }

    public Livro atualizaLivro(Livro alt) {
        for (int i = 0; i < bdLivro.size(); i++) {
            if (alt.getNome().equals(bdLivro.get(i).getNome())) {
                bdLivro.set(i, alt);
                return bdLivro.get(i);
            }
        }
        return null;
    }

}
