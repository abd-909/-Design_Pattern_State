import java.awt.*;

public class RedState extends State {
	// Next state for the Black state:
	// On a push(), go to "red"
	// On a pull(), go to "green"
	public void handlePush(Context c) {
	c.setState(new BlueState());
	}
	public void handlePull(Context c) {
	c.setState(new BlackState());
	}
	
	public Color getColor() {return (Color.red);}
}
