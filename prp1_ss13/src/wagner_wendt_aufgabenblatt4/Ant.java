package wagner_wendt_aufgabenblatt4;

public class Ant {

	int load;
	Ant successor;

	public Ant(int load) {

		
		setLoad(load);
		
		//System.out.println(this);
	}

	public int getLoad() {
		return this.load;

		
	}
	

	public void setLoad(int l) {
		
		if (l>10||l<0){
			
		}else
		
		this.load = l;
	}
	
	public Ant getSuccessor(){
		
		
		
		return successor;
		
	}
	public void setSucessor(Ant s){
		
	}
	
	public String toString(){
		return String.format("%s",load);
	}
}
