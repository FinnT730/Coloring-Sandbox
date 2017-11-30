/**
 * 
 */
package app;

import java.awt.Component;
import java.awt.Graphics;

/**
 * @author FinnT730
 *
 */
public class Screen extends Component {

	public Screen(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		Display dis = new Display();
		for (int i = 0; i < dis.width; i += 10) {
			for (int o = 0; o < dis.height; o += 10) {
				g.drawLine(i, o, i + 10, o);
				g.drawLine(i, o, i, o + 10);
			}
		}
		super.paint(g);
	}

}
