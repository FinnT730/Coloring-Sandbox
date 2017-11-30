/**
 * 
 */
package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
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

	@Override
	public void paint(Graphics g) {

		g.clearRect(0, 0, Display.width, Display.height);

		Display dis = new Display();
		for (int i = 0; i < dis.width; i += 10) {
			for (int o = 0; o < dis.height; o += 10) {
				g.drawLine(i, o, i + 10, o);
				g.drawLine(i, o, i, o + 10);

				g.setColor(new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
				g.fillRect(i, o, 10, 10);

				g.setColor(Color.black);

				int number = new Random().nextInt(9);
				g.drawString("" + number, i, o);

			}
		}
		super.paint(g);
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Component#update(java.awt.Graphics)
	 */
	@Override
	public void update(Graphics g) {
		g.clearRect(0, 0, Display.width, Display.height);
		super.update(g);
	}

}
