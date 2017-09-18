package com.text.img;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class TextToImage {
	 public static void main(String[] args) throws Exception 
	    {
	        String text = ">STATEMENT";
	        /*BufferedImage image = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);// Represents an image with 8-bit RGBA color components packed into integer pixels.
	        //BufferedImage image = ImageIO.read(new File("D://img//1.jpg"));
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	        int width = fontmetrics.stringWidth(text);
	        int height = fontmetrics.getHeight();
	        graphics2d.dispose();*/
	      /*  BufferedImage dwimg = ImageIO.read(new File("D://img//3.jpg"));
	        BufferedImage image1 = ImageIO.read(new File("D://img//tst//bk_up.jpg"));
	        BufferedImage hdimg = ImageIO.read(new File("D://img//tst//header.jpeg"));*/
	        BufferedImage hdimg = ImageIO.read(new File("C:\\Users\\C48778\\img\\header.jpg"));
	        
	        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
	        Graphics2D graphics2d = image.createGraphics();
	        Font font = new Font("TimesNewRoman", Font.BOLD, 24);
	        FontMetrics fontmetrics = graphics2d.getFontMetrics();
	    /*    graphics2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
	        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	        graphics2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
	        graphics2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
	        graphics2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	        graphics2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        graphics2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);*/
	        graphics2d.setFont(font);
	        fontmetrics = graphics2d.getFontMetrics();
	        graphics2d.setColor(Color.GREEN);
	        graphics2d.drawImage(hdimg, 130, 30, null);
	        graphics2d.drawString(text, 0, 100);
	        graphics2d.drawString("DEPOSITS", 0, 120);
	        graphics2d.drawString("WITHDRAWLS", 0, 140);
	        graphics2d.drawString(">>>>>>  FINAL COLLECTIONS >>>>>> ", 0, 160);
	        graphics2d.drawString(">>>    BYE   >>>>> ", 0, 180);
	        //graphics2d.draw3DRect(0, 120, 50, 30, true);
	        
	        graphics2d.dispose();
	        try {
	            ImageIO.write(image, "jpg", new File("C://Users//C48778//img//pk_Test1.jpg"));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }catch(Exception e){
	        	e.printStackTrace();
	        }finally{
	        	
	        }
	    }
}
