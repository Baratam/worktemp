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

public class Credits {

	private Properties dataProp = null;
	Credits(Properties prop){
		dataProp= prop;
	}
	
	public void createIntroFrames1(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
	        createFrame(image, "crdb1");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void createIntroFrames2(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("crd_key2"), 50, 420);
	        createFrame(image, "crdb2");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
public void createIntroFrames3(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
	        
	        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 30, 30, null);
	        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
	        graphics2d.drawString(dataProp.getProperty("crd_key2"), 50, 420);
	        graphics2d.drawString(dataProp.getProperty("crd_key3"), 50, 460);
	        createFrame(image, "crdb3");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
}
		
		public void createIntroFrames4(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
		        
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font); 
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("crd_key2"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("crd_key3"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("crd_key4"), 50, 500);
		        createFrame(image, "crdb4");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
public void createIntroFrames5(){
			
			try{
				
				BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
		        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
		        Graphics2D graphics2d = image.createGraphics();
		        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
		        FontMetrics fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setFont(font);
		        fontmetrics = graphics2d.getFontMetrics();
		        graphics2d.setColor(Color.GREEN);
		        graphics2d.drawImage(hdimg, 30, 30, null);
		        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
		        graphics2d.drawString(dataProp.getProperty("crd_key2"), 50, 420);
		        graphics2d.drawString(dataProp.getProperty("crd_key3"), 50, 460);
		        graphics2d.drawString(dataProp.getProperty("crd_key4"), 50, 500);
		        graphics2d.drawString(dataProp.getProperty("crd_key5"), 50, 540);
		        createFrame(image, "crdb5");
		        graphics2d.dispose();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
public void createIntroFrames6(){
	
	try{
		
		BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
        BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2d = image.createGraphics();
        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
        FontMetrics fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setFont(font);
        fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setColor(Color.GREEN);
        graphics2d.drawImage(hdimg, 30, 30, null);
        graphics2d.drawString(dataProp.getProperty("crd_key1"), 50, 380);
        graphics2d.drawString(dataProp.getProperty("crd_key2"), 50, 420);
        graphics2d.drawString(dataProp.getProperty("crd_key3"), 50, 460);
        graphics2d.drawString(dataProp.getProperty("crd_key4"), 50, 500);
        graphics2d.drawString(dataProp.getProperty("crd_key5"), 50, 540);
        graphics2d.drawString(dataProp.getProperty("crd_key6"), 50, 580);
        createFrame(image, "crdb6");
        graphics2d.dispose();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}


public void createIntroFrames7(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("crd_key7"), 50, 380);
    createFrame(image, "crdb7");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}

public void createIntroFrames8(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("crd_key7"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("crd_key8"), 50, 420);
    createFrame(image, "crdb8");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}
public void createIntroFrames9(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("crd_key7"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("crd_key8"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("crd_key9"), 50, 460);
    createFrame(image, "crdb9");
    graphics2d.dispose();
	
}catch(Exception e){
	e.printStackTrace();
}
}
public void createIntroFrames10(){

try{
	
	BufferedImage hdimg = ImageIO.read(new File("D:\\temp\\img\\cr_db_header.jpg"));
    BufferedImage image = new BufferedImage(750, 750, BufferedImage.TYPE_INT_RGB);
    Graphics2D graphics2d = image.createGraphics();
    Font font = new Font("TimesNewRoman", Font.BOLD, 24);
    FontMetrics fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setFont(font);
    fontmetrics = graphics2d.getFontMetrics();
    graphics2d.setColor(Color.GREEN);
    graphics2d.drawImage(hdimg, 30, 30, null);
    graphics2d.drawString(dataProp.getProperty("crd_key7"), 50, 380);
    graphics2d.drawString(dataProp.getProperty("crd_key8"), 50, 420);
    graphics2d.drawString(dataProp.getProperty("crd_key9"), 50, 460);
    graphics2d.drawString(dataProp.getProperty("crd_key10"), 50, 500);
    createFrame(image, "crdb10");
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
		Credits intr = new Credits(prop);
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
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void execute(Credits intr){

		// TODO Auto-generated method stub
		try{
		
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
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
