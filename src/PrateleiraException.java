
//Beatriz Cristina de Faria RA: 2349710
//Engenharia de Computacao C31 POO

import javax.swing.JOptionPane;

public class PrateleiraException extends Exception{
    
    
    public void limPrateleira(){
                        
             JOptionPane.showMessageDialog(null, "Ha somente 10 prateleiras.", "Erro!", JOptionPane.ERROR_MESSAGE);
           
    }
}
