
//Beatriz Cristina de Faria RA:2349710
//POO C31

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class GerLivro {
        private Livro livro;
	private List<Livro> bdLivro = new ArrayList<Livro>();

        public List<Livro> getBdLivro(){
            return bdLivro;
        }
        
	public Livro cadLivro(Livro l){

		if(consLivroCod(l)== null){
			bdLivro.add(l);
			return l;
		}
		else{
			return null;
		}

	}
        
        

	public Livro consLivroCod(Livro livro){
		for(int i = 0; i < bdLivro.size(); i++){
			if(livro.getNome() == bdLivro.get(i).getNome()){
				return bdLivro.get(i);
			}
		}
		return null;
	}

	public Livro removeLivroCod(Livro livro){
                livro = consLivroCod(livro);
            	if(livro != null){
                    bdLivro.remove(livro);
                    return null;
		}
		else{
                    return livro;
		}
		
	}

	public Livro atualizaLivroCod(Livro livro){
		for(int i = 0; i < bdLivro.size(); i++){
			if(livro.getNome() == bdLivro.get(i).getNome()){
                                String nome = JOptionPane.showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                                livro.setNome(nome);
				bdLivro.set(i, livro);  
                                return bdLivro.get(i);
			}
		}
                return null;
	}

   
}
