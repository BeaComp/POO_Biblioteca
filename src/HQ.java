//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31

public class HQ extends Livro implements LivroEditora{
    
    private String ilustrador;

    private boolean cor;

    private String franquia;
    
    
    
    public void setIlustrador(String autor) {
        this.ilustrador = autor;
    }
    public String getIlustrador() {
        return ilustrador;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public boolean getCor(){
        return cor;
    }
    
    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }

    public String getFranquia() {
        return franquia;
    }
    
    //POLIMORFISMO SOBRESCRITA
    @Override
    public double calcTaxaEditora(int fee) {
        try {
            return fee * 0.5;
        } catch (Exception e) {
            return 0;
        }

    }
}
