/**
 * 
 */
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.ComponentListener;
import java.util.Random;

/**
 * @author FinnT730
 *
 */
public class Cube extends Component {

	public Cube(Graphics g, Color color, int x, int y, int w, int h) {
		g.drawLine(x, y, x + 10, y);
		g.drawLine(x, y, x, y + 10);

		g.setColor(color);
		g.fillRect(x, y, 10, 10);

		g.setColor(Color.black);

		int number = new Random().nextInt(9);
		g.drawString("" + number, x, y);
	}

	private static void draw(Graphics g, Color color, int x, int y) {

		// g.drawLine(x, y, x + 10, y);
		// g.drawLine(x, y, x, y + 10);
		//
		// g.setColor(color);
		// g.fillRect(x, y, 10, 10);
		//
		// g.setColor(Color.black);
		//
		// int number = new Random().nextInt(9);
		// g.drawString("" + number, x, y);

	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {

		return super.mouseDown(evt, x, y);
	}

	private void deleteCube(int x, int y) {
		getComponentAt(x, y).removeComponentListener((ComponentListener) this);
	}

}
