package com.ecodation.decoderencoder;

public class EncodeDecoderMainTest {

	public static void main(String[] args) {
		Klavye klavye = new Klavye();
		String klavyeVeri = klavye.getKlavye();

		EncoderX encoderX = new EncoderX();
		String encodeVeri = encoderX.EncoderMethod(klavyeVeri);

		DecoderX decoderX = new DecoderX();
		String decoderVeri = decoderX.DecoderMethod(encodeVeri);

		System.out.println("şifrelenmiş veri: " + encodeVeri);
		System.out.println("çözülmüş  veri: " + decoderVeri);
	}

}
