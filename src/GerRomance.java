
import java.util.List;
import java.util.ArrayList;


public class GerRomance {
    
        private Romance romance;
	private List<Romance> bdRomance = new ArrayList<Romance>();

        public List<Romance> getBdRomance(){
            return bdRomance;
        }
        
	public Romance cadRomance(Romance romance){

		if(consRomanceCod(romance)== null){
			bdRomance.add(romance);
			return romance;
		}
		else{
			return null;
		}

	}//fim cadPes

	public Romance consRomanceCod(Romance romance){
		for(int i = 0; i < bdRomance.size(); i++){
			
				return bdRomance.get(i);
			
		}
		return null;
	}
}
