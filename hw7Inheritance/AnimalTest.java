package hw7Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n----------------------------------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		// mammal extends animal is the example of single inheritance

		System.out.println("\n----------------------------------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n----------------------------------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// BullDog extends Dog, Dog extends Mammal, Mammal extends Animal
		// Example of Multilevel Inheritance

		System.out.println("\n----------------------------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n----------------------------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n----------------------------------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n----------------------------------------------------");
		Birds bird = new Birds();
		bird.birdsInfo();
		bird.animalInfo();

		System.out.println("\n----------------------------------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		// Mammal extends Animal, Reptile extends Animal, Birds extends Animal
		// Example of Hierarchical Inheritance

	}

}
