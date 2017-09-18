package com.text.img;
import java.io.*;
public class CreateBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		 ProcessBuilder builder = new ProcessBuilder(
		            "cmd.exe", "/d", "cd \"D:\\Software\\ffmpeg\\ffp\\bin\" && ffmpeg.exe -f concat -safe 0 -i \"D:/temp/img/input.txt\" -vsync vfr -pix_fmt yuv420p output.mp4");
		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		}catch(Exception e) {
			e.printStackTrace();
			}
		
	}

}
