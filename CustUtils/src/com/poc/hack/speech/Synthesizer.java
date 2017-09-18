package com.poc.hack.speech;

import java.io.*;
import java.nio.charset.StandardCharsets;

import com.sun.speech.freetts.*;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;
import javax.sound.sampled.AudioFileFormat.Type;
public class Synthesizer {

/*	public static void main(String src[]) {
		System.out.println("Welcome ");
	}*/
	
	

		private static final String VOICENAME = "kevin16";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AudioPlayer audioPlayer = null;
			Voice voice;
			VoiceManager vm = VoiceManager.getInstance();
			
			voice = vm.getVoice(VOICENAME);
			audioPlayer = new SingleFileAudioPlayer("D://temp//files//audio5",Type.AU);
			voice.setAudioPlayer(audioPlayer);
			voice.allocate();
			
			String voiceText = "  Welcome John, bank offers you the most personalised statement to you ( ) ( ) "
					+ "Balance in your account is 1233 ( ) ( ) Its highly recommended you to reduce your expenses ( ) and save your income to pay the loans the bank"
					+ "is offering you with a mature bill payments for your savings goals and the round deposits for around "
					+ "1000 euroos    ,"
					+ " Now lets navigate to your savings goals 	quickly you have spent an amount which is more than expected";
			voiceText = "balance euro 6000 only";
	       //voice.setWaveDumpFile(waveDumpFile);
			try{
				InputStream inputStream = new ByteArrayInputStream(voiceText.getBytes(StandardCharsets.UTF_8));
				voice.setRate(130);
				voice.setPitchRange(10);
				voice.speak(inputStream);
				System.out.println("--> "+voice.getVolume());
				/*voice.setVolume(1f);
				voice.speak(inputStream);
				voice.setVolume(10f);
				voice.speak(inputStream);*/
				voice.deallocate();
				
				audioPlayer.close();
				System.exit(0);
			}catch(Exception e){
				System.out.println("Exception "+e.getMessage());
				e.printStackTrace();
			}
		}


	
}

