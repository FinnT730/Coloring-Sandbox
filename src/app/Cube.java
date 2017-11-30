/**
 * 
 */
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
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

		// if (needUpdate()) {
		// repaint();
		// }

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

	static boolean need = false;

	Event evt;

	public boolean mouseDown(Graphics g, int x, int y) {
		if (need) {
			need = false;
		}

		if (!need) {
			need = true;
		}

		// g.clearRect(x, y, 100, 100);

		return need;
	}

	// static boolean need = false;
	public static boolean needUpdate() {
		return need ? true : false || need ? false : true;
	}

}
