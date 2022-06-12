
//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31
import javax.swing.JOptionPane;

public class NarradorException extends Exception{
    
    public Integer narrador = 0;
    
    public NarradorException() {

    }
    
    public void limNarrador(){
        JOptionPane.showMessageDialog(null, "O narrador deve ser de 1a ou 3a pessoa.", "Erro!", JOptionPane.ERROR_MESSAGE);
    }
}
