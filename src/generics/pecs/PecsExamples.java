package generics.pecs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg on 20.01.2015.
 */
public class PecsExamples {

    public static void main(String[] args) {
        //PE
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());

		List<Orange> oranges = new ArrayList<Orange>();
		oranges.add(new Orange());

		List<? extends Fruits> fruitBasket = apples;

		for(Fruits fruit : fruitBasket) {
			fruit.print();
		}

		//CS
		List<? super Apple> appleBasket = apples;
		appleBasket.add(new SpecificTypeOfApple());
    }
}
