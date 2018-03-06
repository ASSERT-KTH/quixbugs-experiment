package java_programs;

public class EvoExample {

	private int value = 1;
	
	public int minZero(int number){
		
		if(number <= 1){
			return 0;
		}
		return number;
	}

	public void setValue(int v){
		this.value = v;	
	}

	public int getValue(){
		return this.value;	
	}
}
