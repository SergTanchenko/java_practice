package nested.inner.classes;

/**
 * Created by Serg on 22.01.2015.
 */
public class Person {

	private Stomach stomach;
	private boolean leftHandIsBroken = false;
	private boolean rightHandIsBroken = false;

	private static boolean wantEat = true;

	public boolean getWantEat() {
		return wantEat;
	}

	public boolean isLeftHandIsBroken() {
		return leftHandIsBroken;
	}

	static class Stomach {
		public void stomackIsFull() {
			wantEat = false;
		}

		public void stomackIsEmpty() {
			wantEat = true;
		}
	}


	class LeftHand implements Hand {

		@Override
		public void breakHand() {
			leftHandIsBroken = true;
		}
	}

	class RightHand implements Hand {
		@Override
		public void breakHand() {
			rightHandIsBroken = true;
		}
	}

	interface Hand {
		void breakHand();
	}
}
