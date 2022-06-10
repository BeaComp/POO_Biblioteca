
import java.util.List;
import java.util.ArrayList;


public class GerCientifico {
    
        private Cientificos cientifico;
	private List<Cientificos> bdCientifico = new ArrayList<Cientificos>();

        public List<Cientificos> getBdCientifico(){
            return bdCientifico;
        }
        
	public Cientificos cadCientifico(Cientificos cient){

		if(consCientCod(cient)== null){
			bdCientifico.add(cient);
			return cient;
		}
		else{
			return null;
		}

	}//fim cadPes

	public Cientificos consCientCod(Cientificos cient){
		for(int i = 0; i < bdCientifico.size(); i++){
			if(cient.getEstudos() == bdCientifico.get(i).getGrau_academico()){
				return bdCientifico.get(i);
			}
		}
		return null;
	}
}
