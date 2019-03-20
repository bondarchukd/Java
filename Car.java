public class Car {

	String type;

	public Car(){

	}

	public String getTypr() {

		return type;
	}



	public void setType(String type) {

		this.type = type;
	}

	public String toString() {

		return "\n==============\n" +
				"Car:" + 
				"\nType:" + type +
				"\n============\n";
	}
}