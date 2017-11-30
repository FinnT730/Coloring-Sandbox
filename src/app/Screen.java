/**
 * 
 */
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author FinnT730
 *
 */
public class Screen extends Component {

	// Thread thread = new Thread(this);

	public Screen(Graphics g) {
		paint(g);
	}

	ArrayList<Cube> cubes = new ArrayList<>();

	@Override
	public void paint(Graphics g) {

		{ // this is Garbage Colection.
			System.gc();
		}

		// System.out.println(cubes.toString());

		cubes.clear();

		g.clearRect(0, 0, Display.width, Display.height);

		// Display dis = new Display();
		// for (int i = 0; i < dis.width; i += 10) {
		// for (int o = 0; o < dis.height; o += 10) {
		// g.drawLine(i, o, i + 10, o);
		// g.drawLine(i, o, i, o + 10);
		//
		// g.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255),
		// new Random().nextInt(255)));
		// g.fillRect(i, o, 10, 10);
		//
		// g.setColor(Color.black);
		//
		// int number = new Random().nextInt(9);
		// g.drawString("" + number, i, o);
		//
		// }
		// }

		// ArrayList<Cube> cubes = new ArrayList<>();

		// for (Cube c : cubes) {
		//
		// if (c instanceof Cube) {
		// int number = new Random().nextInt(99);
		// if (number == 15) {
		// c.need = true;
		// }
		// }
		//
		// // c.needUpdate();
		//
		// if(c.needUpdate()) {
		// c.changeColor(g, Color.RED, c.getX(), c.getY());
		// }
		//
		// }

		if (Cube.needUpdate()) {
			Display dis = new Display();
			for (int i = 0; i < dis.width; i += 10) {
				for (int o = 0; o < dis.height; o += 10) {
					cubes.add(new Cube(g,
							new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)),
							i, o, 0, 0));
				}
			}
		}

		for (Cube c : cubes) {

			int number = new Random().nextInt(16);
			if (number == 15) {
				c.need = false;
			} else {
				c.need = true;
			}

			// c.needUpdate();

			if (c.needUpdate()) {
				c.changeColor(g, Color.RED, 150, 150);
				c.changeColor(g, Color.RED, 450, 500);
			}

		}

		super.paint(g);
	}

	// @Override
	// public void update(Graphics g) {
	// g.clearRect(0, 0, Display.width, Display.height);
	// super.update(g);
	// }

	@Override
	protected void processKeyEvent(KeyEvent e) {
		System.out.println(e.getKeyCode());
		super.processKeyEvent(e);
	}

}
