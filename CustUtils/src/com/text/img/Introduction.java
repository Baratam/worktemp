package com.text.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;

public class Introduction {

	private Properties dataProp = null;
	Introduction(Properties prop){
		dataProp= prop;
	}
	
	public void createIntroFrames1(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
	        createFrame(image, "intro1");
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
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
	        createFrame(image, "intro2");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
public void createIntroFrames3(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
	        graphics2d.drawString(dataProp.getProperty("intro_key2"), 50, 460);
	        createFrame(image, "intro3");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
}
		
		public void createIntroFrames4(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
		        
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font);
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("intro_key2"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("intro_key3"), 50, 500);
		        createFrame(image, "intro4");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
public void createIntroFrames5(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font);
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("intro_key2"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("intro_key3"), 50, 500);
		        graphics2d.drawString(dataProp.getProperty("intro_key4"), 50, 540);
		        createFrame(image, "intro5");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
public void createIntroFrames6(){
	
	try{
		
		BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2d = image.createGraphics();
        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
        FontMetrics fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setFont(font);
        fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setColor(Color.GREEN);
        graphics2d.drawImage(hdimg, 30, 30, null);
        graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
        graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
        graphics2d.drawString(dataProp.getProperty("intro_key2"), 50, 460);
        graphics2d.drawString(dataProp.getProperty("intro_key3"), 50, 500);
        graphics2d.drawString(dataProp.getProperty("intro_key4"), 50, 540);
        graphics2d.drawString(dataProp.getProperty("intro_key5"), 50, 580);
        createFrame(image, "intro6");
        graphics2d.dispose();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}


public void createIntroFrames7(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("intro_key"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("intro_key1"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("intro_key2"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("intro_key3"), 50, 500);
    graphics2d.drawString(dataProp.getProperty("intro_key4"), 50, 540);
    graphics2d.drawString(dataProp.getProperty("intro_key5"), 50, 580);
    createFrame(image, "intro7");
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
		Introduction intr = new Introduction(prop);
		intr.createIntroFrames1();
		intr.createIntroFrames2();
		intr.createIntroFrames3();
		intr.createIntroFrames4();
		intr.createIntroFrames5();
		intr.createIntroFrames6();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void execute(Introduction intr){

		// TODO Auto-generated method stub
		try{
		/*Properties prop = new Properties();
		InputStream input = new FileInputStream("D:\\temp\\config\\input.properties");
		prop.load(input);*/
		
		intr.createIntroFrames1();
		intr.createIntroFrames2();
		intr.createIntroFrames3();
		intr.createIntroFrames4();
		intr.createIntroFrames5();
		intr.createIntroFrames6();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
