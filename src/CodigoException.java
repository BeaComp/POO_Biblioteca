//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computa��o C31

import javax.swing.JOptionPane;

public class CodigoException extends Exception{
  
  
    public void limCodigo(){
        
                  JOptionPane.showMessageDialog(null, "O código deve ser menor que 5 caracteres!", "Erro!", JOptionPane.ERROR_MESSAGE);
            
        
    }
}
