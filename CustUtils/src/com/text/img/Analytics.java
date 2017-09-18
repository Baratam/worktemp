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

public class Analytics {

	private Properties dataProp = null;
	Analytics(Properties prop){
		dataProp= prop;
	}
	
	public void createIntroFrames1(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\analy_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("anal_key1"), 50, 380);
	        createFrame(image, "analy1");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void createIntroFrames2(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\analy_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("anal_key1"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("anal_key2"), 50, 420);
	        createFrame(image, "analy2");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
public void createIntroFrames3(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\analy_fd_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("anal_key1"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("anal_key2"), 50, 420);
	        graphics2d.drawString(dataProp.getProperty("anal_key3"), 50, 460);
	        createFrame(image, "analy3");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
}
		
		public void createIntroFrames4(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\analy_fd_header.jpg"));
		        
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font); 
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("anal_key1"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("anal_key2"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("anal_key3"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("anal_key4"), 50, 500);
		        createFrame(image, "analy4");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
public void createIntroFrames5(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\analy_fd_header.jpg"));
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font);
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("anal_key1"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("anal_key2"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("anal_key3"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("anal_key4"), 50, 500);
		        graphics2d.drawString(dataProp.getProperty("anal_key5"), 50, 540);
		        createFrame(image, "analy5");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
public void createIntroFrames6(){
	
	try{
		
		BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header.jpg"));
        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2d = image.createGraphics();
        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
        FontMetrics fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setFont(font);
        fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setColor(Color.GREEN);
        graphics2d.drawImage(hdimg, 30, 30, null);
        graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
        createFrame(image, "analy6");
        graphics2d.dispose();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}


public void createIntroFrames7(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    createFrame(image, "analy7");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}

public void createIntroFrames8(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("anal_key8"), 50, 460);
    createFrame(image, "analy8");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}
public void createIntroFrames9(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header1.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("anal_key8"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("anal_key9"), 50, 500);
    createFrame(image, "analy9");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}
public void createIntroFrames10(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header1.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("anal_key8"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("anal_key9"), 50, 500);
    graphics2d.drawString(dataProp.getProperty("anal_key10"), 50, 540);
    createFrame(image, "analy10");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}

public void createIntroFrames11(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header1.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("anal_key8"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("anal_key9"), 50, 500);
    graphics2d.drawString(dataProp.getProperty("anal_key10"), 50, 540);
    graphics2d.drawString(dataProp.getProperty("anal_key11"), 50, 580);
    createFrame(image, "analy11");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}

public void createIntroFrames12(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\house_header1.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("anal_key6"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("anal_key7"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("anal_key8"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("anal_key9"), 50, 500);
    graphics2d.drawString(dataProp.getProperty("anal_key10"), 50, 540);
    graphics2d.drawString(dataProp.getProperty("anal_key11"), 50, 580);
    graphics2d.drawString(dataProp.getProperty("anal_key12"), 50, 620);
    createFrame(image, "analy12");
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
		Analytics intr = new Analytics(prop);
		intr.createIntroFrames1();
		intr.createIntroFrames2();
		intr.createIntroFrames3();
		intr.createIntroFrames4();
		intr.createIntroFrames5();
		intr.createIntroFrames6();
		intr.createIntroFrames7();
		intr.createIntroFrames8();
		intr.createIntroFrames9();
		intr.createIntroFrames10();
		intr.createIntroFrames11();
		intr.createIntroFrames12();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void execute(Analytics intr){
		intr.createIntroFrames1();
		intr.createIntroFrames2();
		intr.createIntroFrames3();
		intr.createIntroFrames4();
		intr.createIntroFrames5();
		intr.createIntroFrames6();
		intr.createIntroFrames7();
		intr.createIntroFrames8();
		intr.createIntroFrames9();
		intr.createIntroFrames10();
		intr.createIntroFrames11();
		intr.createIntroFrames12();
	}

}
