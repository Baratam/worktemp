package com.poc.hack.speech;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import javax.sound.sampled.AudioFileFormat.Type;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.AudioPlayer;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;

public class SpeechSynthesizer {

	private static final String VOICENAME = "kevin16";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer voiceBuffer = new StringBuffer();
		String voiceText = "";
		try{
			Properties prop = new Properties();
			InputStream input = new FileInputStream("D:\\temp\\config\\audioconfig.properties");
			prop.load(input);
			
			
			AudioPlayer audioPlayer = null;
			Voice voice;
			VoiceManager vm = VoiceManager.getInstance();
			
			voice = vm.getVoice(VOICENAME);
			audioPlayer = new SingleFileAudioPlayer("D://temp//files//audio",Type.WAVE);
			voice.setAudioPlayer(audioPlayer);
			voice.allocate();
			
			for(int i=1;i<24;i++){
				voiceBuffer.append(prop.get("key"+i));
			}
			
			voiceText = voiceBuffer.toString();
			
			InputStream inputStream = new ByteArrayInputStream(voiceText.getBytes(StandardCharsets.UTF_8));
			//voice.setRate(130);
			//voice.setPitchRange(10);
		//	voice.setRate(90);
			//voice.setPitchRange(5);
			voice.speak(voiceText);
			System.out.println("--> "+voice.getVolume());
			/*voice.setVolume(1f);
			voice.speak(inputStream);
			voice.setVolume(10f);
			voice.speak(inputStream);*/
			voice.deallocate();
			
			audioPlayer.close();
			System.exit(0);
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
