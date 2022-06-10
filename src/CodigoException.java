//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31

import javax.swing.JOptionPane;

public class CodigoException extends Exception{
  
    public int codigo = 0;
    
    public CodigoException() {

    }
    
    public void limCodigo(){
        JOptionPane.showMessageDialog(null, "O tamanho do codigo deve ser menor 5 caracteres!", "Erro!", JOptionPane.ERROR_MESSAGE);
        
    }
}
