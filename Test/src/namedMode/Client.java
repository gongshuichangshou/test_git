package namedMode;

import javax.sound.sampled.Control;

public class Client {
	public static void main(String[] args) {
		Tv tv = new Tv();// 有电视机
		CommanOn commanOn = new CommanOn(tv);
		TvControl tvControl1 = new TvControl();
		CommandOff off = new CommandOff(tv);
		TvControl tvControl2 = new TvControl();
		tvControl1.controlTv(commanOn);
		tvControl2.controlTv(off);
	}
}
