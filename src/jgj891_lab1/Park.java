package jgj891_lab1;

public class Park {
	String parkName;
	int dinoMaxCapacity;
	static int dinoCount = 0;
	static String ret = "";
	private Dinosaur[] dinoArr ;
	
	
	public Park(String parkName, int dinoMaxCapacity){
		System.out.println("Welcome to Jurassic Park!");
		System.out.println("- - - - - - - - - - - - - ");
		this.parkName = parkName;
		this.dinoMaxCapacity = dinoMaxCapacity;
		this.dinoArr = new Dinosaur[this.dinoMaxCapacity];
	}
	
	
	public String toString() {
		for(int i = 0; i < dinoArr.length; i++) {
            if(dinoArr[i] == null) {
            	break;
            }
            ret = ret + dinoArr[i].toString() + "\n";
        }
		return(ret);
	}
	
	public void addDino(Dinosaur d) {
		dinoArr[dinoCount++] = d;
	}
}
