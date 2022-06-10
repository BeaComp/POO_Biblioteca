
import java.util.List;
import java.util.ArrayList;


public class GerHQ {
    
        private HQ hq;
	private List<HQ> bdHQ = new ArrayList<HQ>();

        public List<HQ> getBdHQ(){
            return bdHQ;
        }
        
	public HQ cadHQ(HQ hq){

		if(consHQCod(hq)== null){
			bdHQ.add(hq);
			return hq;
		}
		else{
			return null;
		}

	}//fim cadPes

	public HQ consHQCod(HQ hq){
		for(int i = 0; i < bdHQ.size(); i++){
			if(hq.getIlustrador() == bdHQ.get(i).getFranquia()){
				return bdHQ.get(i);
			}
		}
		return null;
	}
}
