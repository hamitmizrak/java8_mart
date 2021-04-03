package com.ecodation.decoderencoder;

import java.util.Base64;
import java.util.Base64.Encoder;

public class EncoderX {

	// şifrelemek
	public String EncoderMethod(String kelime) {

		Encoder sifrele = Base64.getEncoder();
		String str = sifrele.encodeToString(kelime.getBytes());
		return str;
	}
}
