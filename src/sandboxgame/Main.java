package sandboxgame;

public class Main {

	public static void main(String[] args) {
		FrameMan.init();
		while(true) {
			FrameMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
			System.out.println(FrameLog.fps());
		}
	}

}
