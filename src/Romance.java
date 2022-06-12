
import javax.swing.JOptionPane;

//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31
public class Romance extends Livro implements LivroEditora {

    private int personagens;
    private Integer narrador;
    private String tipo_romance;

    public void setNarrador(Integer narrador) throws NarradorException {
        if (narrador >= 1 && narrador <= 3) {
            this.narrador = narrador;
        } else {
            throw new NarradorException();
        }
    }

    public int getNarrador() {
        return narrador;
    }

    public void setPersonagens(int personagens) {
        this.personagens = personagens;
    }

    public int getPersonagens() {
        return personagens;
    }

    public void setTipo_romance(String tipo_romance) {
        this.tipo_romance = tipo_romance;
    }

    public String getTipo_romance() {
        return tipo_romance;
    }

    @Override
    public double calcTaxaEditora(int fee) {
        try {
            return fee * 4.3;
        } catch (Exception e) {
            return 0;
        }

    }
}
