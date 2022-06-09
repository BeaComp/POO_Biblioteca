//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computação C31


public class Caracteristicas {
    
    private int paginas;
    private int capitulos;
    private String publicacao;
    private String autor;
    private int edicao;
    private String editora;

    

    public Caracteristicas(){
        
    }

    //===========================
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    public int getCapitulos() {
        return capitulos;
    }
    
    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }
    public String getPublicacao() {
        return publicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }


}
