//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31

public class Didatico extends Livro implements LivroEditora{
    
    private String area; //humanas, exatas
    private String disciplina;
    
    
     
    public void setDisciplina(String editora) {
        this.disciplina = editora;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    //POLIMORFISMO SOBRESCRITA
    @Override
    public double calcTaxaEditora(int fee) {
        try {
            return fee * 2.5;
        } catch (Exception e) {
            return 0;
        }

    }

    
    
}
