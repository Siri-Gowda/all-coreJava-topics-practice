package com.applet.htlm;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*<applet code = AppletDemo width=400 height =600>
 * </applet>
 */
public class AppletDemo extends Applet {
	public void init() {
		setBackground(Color.black);
		setForeground(Color.yellow);
	}

	public void pain(Graphics g) {
		g.drawString("Welcome to Applets", 40, 40);

	}

}
