package app;

import java.applet.Applet;
import java.awt.Graphics;

public class Display extends Applet implements Runnable {

	public Thread thread = new Thread(this);

	public static int width = 640;
	public static int height = 640;

	@Override
	public void init() {
		setSize(width, height);
		super.init();
	}

	@Override
	public void start() {
		thread.start();
		super.start();
	}

	@Override
	public void stop() {
		thread.stop();
		super.stop();
	}

	Graphics g;

	@Override
	public void paint(Graphics g) {
		add(new Screen(g));

		try {
			thread.sleep(2000);
			Screen screen = new Screen(g);
			screen.update(g);

			if (thread.interrupted()) {
				thread.destroy();
			}

			System.gc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		repaint(7000);

		super.paint(g);
	}

	@Override
	public void run() {
		// try {
		// thread.sleep(2000);
		// Screen screen = new Screen(g);
		// screen.update(g);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
