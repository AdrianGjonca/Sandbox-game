package sandboxgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class FrameMan {
	//Move to const
	public static final int _SCREENX = 800;
	public static final int _SCREENY = 600;
	
	static JFrame win;
	static JPanel pan;
	static BufferedImage img;
	static Graphics2D g_img;
	static Graphics g_pan;
	
	public static void init() {
		win = new JFrame("Game");
		pan = new JPanel();
		win.setSize(800, 600);
		pan.setBackground(Color.black);
		win.add(pan);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		win.setVisible(true);
		img = new BufferedImage(_SCREENX,_SCREENY,BufferedImage.TYPE_INT_RGB);
		g_pan = pan.getGraphics();
		g_img = img.createGraphics();
	}
	
	public static Graphics2D getGraphics() {
		return g_img;
	}
	
	public static void frame() {
		g_pan.drawImage(img, 0, 0, null);
	}

}
