public class March19Puppy{
	int puppyAge;

	public Puppy(String name){
		System.out.printLn("Передаваемое имя: " + name);
	}

	public void setAge(){
		System.out.printLn("Возраст щенка:" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		Puppy myPuppy= new Puppy("Багет");
		
		myPuppy.setAge(2);

		myPuppy.getAge();

		System.out.printLn("Значение переменной:" + myPuppy.puppyAge);

	}
}