package namedMode;

public class CommandOff implements Command {
	private Tv tv;

	public CommandOff(Tv tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOff();
	}

}
