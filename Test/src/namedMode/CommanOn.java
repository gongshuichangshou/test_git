package namedMode;

public class CommanOn implements Command {
	private Tv tv;

	public CommanOn(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

}
