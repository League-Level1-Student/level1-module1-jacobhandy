
public class Dragon {
    private String favoriteGame;
	private float numberOfSecondsAirbourne;
	public void Fly() {
    	System.out.println("The dragon has taken flight");
    }
public void BreatheFire() {
	System.out.println("Temperature levels are exceeding 100 degrees F");
}
Dragon(String favoriteGame, float numberOfSecondsAirbourne){
	this.favoriteGame = favoriteGame;
	this.numberOfSecondsAirbourne = numberOfSecondsAirbourne;
}
}
