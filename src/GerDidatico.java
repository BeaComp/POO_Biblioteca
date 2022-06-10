
import java.util.List;
import java.util.ArrayList;


public class GerDidatico {
    
        private Didatico didatico;
	private List<Didatico> bdDidatico = new ArrayList<Didatico>();

        public List<Didatico> getBdDidatico(){
            return bdDidatico;
        }
        
	public Didatico cadDidatico(Didatico didatico){

		if(consDidaticoCod(didatico)== null){
			bdDidatico.add(didatico);
			return didatico;
		}
		else{
			return null;
		}

	}

	public Didatico consDidaticoCod(Didatico didat){
		for(int i = 0; i < bdDidatico.size(); i++){
			if(didat.getArea() == bdDidatico.get(i).getDisciplina()){
				return bdDidatico.get(i);
			}
		}
		return null;
	}
}

