package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	final int originalTileSize = 16; //16x16 tile
	final int scale = 3;
	
	public final int tileSize = originalTileSize *scale; //48 tile size
	
	//how many tiles do we want to show horizontally and vertically will be defined below. 
	public final int maxScreenColumn = 16;
	public final int maxScreenrow = 12;
	//so this ratio will be 4 by 3. 
	
	public final int screenWidth = maxScreenColumn *tileSize;//768 pixels
	public final int screenHeight = maxScreenrow * tileSize; //576 pixels
	
	//WORLD SETTINGS
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	public final int worldWidth = tileSize * maxWorldCol; //(48 * 50)
	public final int worldHeight = tileSize * maxWorldRow;//(48 * 50)
	
	int FPS = 60;
	
	//Game state 
		public int gameState;
		public final int titleState = 0;
		public final int playState = 1; 
		public final int pauseState = 2;
		public final int dialogueState = 3;
		//set players default position
		int playerX = 100;
		int playerY = 100;
		int playerSpeed = 4;

	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
	
	public void setupGame() {
		
		//playMusic(0);
		gameState = titleState;
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
