public class March19Puppy{
	int puppyAge;

	public Puppy(String name){
		//Пример конструктора с одним параметром name
		System.out.printLn("Передаваемое имя: " + name);
	}

	public void setAge(){
		System.out.printLn("Возраст щенка:" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		//Создание нового объекта
		Puppy myPuppy= new Puppy("Багет");
		//Вызов метода для установки возраста щенка
		myPuppy.setAge(2);
		//вызов метода для получения возраста
		myPuppy.getAge();
		//Получение переменной экземпляра класса
		System.out.printLn("Значение переменной:" + myPuppy.puppyAge);

	}
}