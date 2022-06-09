//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computação C31

import javax.swing.JOptionPane;

public class CodigoException extends Exception{
  
    public void limCodigo(){
        JOptionPane.showMessageDialog(null, "O tamanho do codigo deve ser menor 5 caracteres!", "Erro!", JOptionPane.ERROR_MESSAGE);
        
    }
}
