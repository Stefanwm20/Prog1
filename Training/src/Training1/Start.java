package Training1;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Start extends JFrame {

	public static void main(String[] args) {

		Start s = new Start();

		s.run();

	}

	private Animation a;
	private ScreenManager sm;
	private Image bg;
	private Image schere;
	private Image schereAuf;
	private static final DisplayMode mode1[] = {
	new DisplayMode(800,600,32,0),
	 };

	// load images and add scenes
	public void loadImages() {
		bg = new ImageIcon("C:\\Users\\Stefan\\Pictures\\bg.jpg").getImage();
		schere = new ImageIcon("C:\\Users\\Stefan\\Pictures\\Schere.png")
				.getImage();
		schereAuf = new ImageIcon("C:\\Users\\Stefan\\Pictures\\Schereauf.png")
				.getImage();

		a = new Animation();

		a.addScene(schere, 250);
		a.addScene(schereAuf, 250);
	}

	// main method called from main
	public void run() {
		sm = new ScreenManager();
		try {

			DisplayMode dm = sm.findFirstCompatibleMode(mode1);
			sm.setFullScreen(dm);
			loadImages();
			movieLoop();
		} finally {
			sm.restoreScreen();
		}

	}

	// play movie loop
	public void movieLoop() {

		long startingTime = System.currentTimeMillis();
		long cumTime =
				startingTime;

		while (cumTime - startingTime < 10000) {
			long timePassed = System.currentTimeMillis()-cumTime;
			cumTime += timePassed;
			a.update(timePassed);

			// draw and update screen
			Graphics2D g = sm.getGraphics();
			draw(g);
			g.dispose();
			sm.update();

			try {
				Thread.sleep(20);
			} catch (Exception ex) {}
		}

	}

	// draws graphics
	public void draw(Graphics g) {
		g.drawImage(bg, 0, 0, (int) sm.getWidth(),(int) sm.getHeight(),null);
		g.drawImage(a.getImage(), 50, 50, null);
	}

}