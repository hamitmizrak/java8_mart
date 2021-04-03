package com.ecodation.decoderencoder;

import java.util.Base64;
import java.util.Base64.Decoder;

public class DecoderX {

	// şifre çözüsü
	public String DecoderMethod(String maskelenmis) {

		Decoder sifreCoz = Base64.getMimeDecoder();
		String str2 = new String(sifreCoz.decode(maskelenmis));
		return str2;
	}
}
