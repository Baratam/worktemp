package com.text.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class DebitService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createDebitFrames();
		createDebitExplanation();
	}
	
	
	public static void createDebitFrames(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D://img//tst//header.jpeg"));
			BufferedImage depMAIN = ImageIO.read(new File("D://img//user//depositMain.jpeg"));
	        
	        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 130, 30, null);
	        graphics2d.drawString("DEPOSITS", 130, 100);
	        graphics2d.drawImage(depMAIN, 0, 160, null);
	        createFrame(image, "debit");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void createDebitExplanation(){
		try{
			
			Map expMap = new HashMap();
			expMap.put("key1", " >  Lets check the Debits");
			expMap.put("key2"," >  Total debits 2000 euros");
			expMap.put("key3"," >  Expected debits 3500 euros");
			expMap.put("key4"," >  Debits yet to recieve 1500 euros");
			expMap.put("key5"," >  Below are expected debits failed, ");
			expMap.put("key6"," 		>  Customer 1 not yet debited");
			expMap.put("key7"," 		>  Customer 2 not yet debited to account");
			
			BufferedImage hdimg = ImageIO.read(new File("D://img//tst//header.jpeg"));
	        
	        BufferedImage image = new BufferedImage(700, 700, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawString("DEBIT Explanation", 130, 100);
	        createFrame(image, "debit");

	        graphics2d.drawString(String.valueOf(expMap.get("key1")), 30, 120);
	        createFrame(image, "debit1");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key2")), 30, 140);
	        createFrame(image, "debit2");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key3")), 30, 160);
	        createFrame(image, "debit3");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key4")), 30, 180);
	        createFrame(image, "debit4");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key5")), 30, 200);
	        createFrame(image, "debit5");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key6")), 30, 220);
	        createFrame(image, "debit6");
	        
	        graphics2d.drawString(String.valueOf(expMap.get("key7")), 30, 240);
	        createFrame(image, "debit7");

	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void createDebitChart(){
		
		try{
			
			BufferedImage hdimg = ImageIO.read(new File("D://img//tst//header.jpeg"));
			BufferedImage depMAIN = ImageIO.read(new File("D://img//user//depositMain.jpeg"));
	        
	        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 130, 30, null);
	        graphics2d.drawString("DEPOSITS", 130, 100);
	        graphics2d.drawImage(depMAIN, 0, 160, null);
	        createFrame(image, "deposit1");
	        graphics2d.dispose();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void createFrame(BufferedImage image, String imageName){
		
		try{
			 ImageIO.write(image, "jpg", new File("D://img//user//"+imageName+".jpeg"));

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
