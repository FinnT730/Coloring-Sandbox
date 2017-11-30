package app;

import java.applet.Applet;
import java.awt.Graphics;

public class Display extends Applet {

	public static int width = 640;
	public static int height = 640;

	@Override
	public void init() {
		setSize(width, height);
		super.init();
	}

	
	Graphics g;
	@Override
	public void paint(Graphics g) {
		add(new Screen(g));
		super.paint(g);
	}

}
