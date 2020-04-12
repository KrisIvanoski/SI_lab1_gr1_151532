class Student {
	String index;
	String firstName;
	String lastName;

	//TODO constructor
	public Student(index, firstName, lastName){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	//TODO seters & getters
	public void setName(String firstName){
		this.firstName = firstName;
	}
	public void setIndex(String index){
		this.index = index;
	}
	public void lastName(String lastName){
		this.lastName = lastName;
	}

	public String lastName(){
		return lastName;
	}
	public String firstName(){
		return firstName;
	}
	public String index(){
		return index;
	}

	public double getAverage() {
		//TODO
		// nemam idea kako da go napravam toa bidejki nemam od kade da vidam poeni zatoa sekoj ke ima poeni -1 :)
		
		return -1;
	}

	public boolean hasSignature() {
		//TODO
		// nemam idea kako da go napravam toa bidejki nemam od kade da vidam lab taka da sekoj ke ima potpis :)
		return true;
	}
}
