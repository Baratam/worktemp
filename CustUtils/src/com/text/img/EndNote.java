package com.text.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.imageio.ImageIO;

public class EndNote {

	private Properties dataProp = null;
	EndNote(Properties prop){
		dataProp= prop;
	}
	
	public void createIntroFrames1(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 36);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("end_key1"), 50, 380);
	        createFrame(image, "end1");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void createIntroFrames2(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 36);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("end_key1"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("end_key2"), 50, 440);
	        createFrame(image, "end2");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	


	public void createFrame(BufferedImage image, String imageName){
		
		try{
			 ImageIO.write(image, "jpg", new File("D:\\temp\\img3\\"+imageName+".jpg"));

		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Properties prop = new Properties();
		InputStream input = new FileInputStream("D:\\temp\\config\\input.properties");
		prop.load(input);
		EndNote intr = new EndNote(prop);
		intr.createIntroFrames1();
		intr.createIntroFrames2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void execute(EndNote intr){
		intr.createIntroFrames1();
		intr.createIntroFrames2();
	}

}
