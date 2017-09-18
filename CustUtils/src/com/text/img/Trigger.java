package com.text.img;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Trigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			Properties prop = new Properties();
			InputStream input = new FileInputStream("D:\\temp\\config\\input.properties");
			prop.load(input);
			
			Introduction intr = new Introduction(prop);
			intr.execute(intr);
			
			Credits crtr = new Credits(prop);
			crtr.execute(crtr);
			
			Grip grp = new Grip(prop);
			grp.execute(grp);
			
			Tikky tkky = new Tikky(prop);
			tkky.execute(tkky);
			
			Analytics anltc = new Analytics(prop);
			anltc.execute(anltc);
			
			EndNote endnt = new EndNote(prop);
			endnt.execute(endnt);
			
			//ffmpeg -f concat -safe 0 -i D:/temp/img3/input.txt -vsync vfr -pix_fmt yuv420p output3.mp4
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
