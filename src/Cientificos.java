
//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31

public class Cientificos extends Livro implements LivroEditora{
    
    private String estudo;
    private String grau_academico;

     
     
    public void setEstudos(String generos) {
        this.estudo = generos;
    }

    public String getEstudos() {
        return estudo;
    }
    public void setGrau_academico(String grau_academico) {
        this.grau_academico = grau_academico;
    }

    public String getGrau_academico() {
        return grau_academico;
    }

    //POLIMORFISMO SOBRESCRITA
    @Override
    public double calcTaxaEditora(int fee) {
        try {
            return fee * 5.0;
        } catch (Exception e) {
            return 0;
        }

    }

    
}
