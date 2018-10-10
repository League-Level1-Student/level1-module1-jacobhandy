

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		int position = 5;
		// 1. Create a RaceCar and place it in 5th position
	RaceCar car = new RaceCar("null", position);
		// 2. Print the RaceCar's position in the race
		// 3. Crash the RaceCar
	car.getPositionInRace();
		car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
car.isDamaged();
car.pit();
		// 5. Help the car move into first place.
car.overtake();
	}
}
