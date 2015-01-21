package nested.inner.classes;

/**
 * Created by Serg on 22.01.2015.
 */
public class InnerClassesExamples {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("Is Person hungry? - " + person.getWantEat());

		Person.Stomach stomach = new Person.Stomach();
		stomach.stomackIsFull();
		System.out.println("Is Person hungry? - " + person.getWantEat());

		Person.LeftHand leftHand = person.new LeftHand();
		System.out.println("Is Person's left hand broken? - " + person.isLeftHandIsBroken());
		leftHand.breakHand();
		System.out.println("Is Person's left hand broken? - " + person.isLeftHandIsBroken());

	}

}
