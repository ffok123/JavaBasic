public class GreetingApplet extends Applet
{
	private Label prompt;
	private Label greeting;
	private TextField inputLine;

	public init() {
	prompt= new Label("Please enter your name");
	greeting = new Label();
	inputLine= new TextField(15);

	add(prompt);
	add(greeting);
	add(inputLine);


	}
}