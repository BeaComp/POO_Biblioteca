//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computação C31

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Livro {
    private String nome;
    private Integer codigo;
    private int prateleira;
    private String secao;
    private Caracteristicas caracteristicas;

    public Livro(){
        this.nome = "";
        this.codigo = 0;
        this.prateleira = 0;
        this.secao = "";
        this.caracteristicas = new Caracteristicas();
    }
    
    //===============================


    public void dataCadastro() {
        GregorianCalendar data = new GregorianCalendar(); // trabalhando com datas

        System.out.println("Data de cadrastro: ");
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH) + 1;
        int ano = data.get(Calendar.YEAR);
        System.out.println("DATA ATUAL DO SISTEMA: " + dia + "/" + mes + "/" + ano + "\n");
    }

    //=========================
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) throws CodigoException{
        if(codigo.length() <= 5) {
            this.codigo = Integer.parseInt(codigo);
        } else{
            throw new CodigoException();
        }
        
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setPrateleira(int prateleira) throws PrateleiraException {
        if(prateleira <= 10){
            this.prateleira = prateleira;
        } else{
            throw new PrateleiraException();
        }
    }

    public int getPrateleira() {
        return prateleira;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getSecao() {
        return secao;
    }

    public void setCaracteristicas(Caracteristicas caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

}
