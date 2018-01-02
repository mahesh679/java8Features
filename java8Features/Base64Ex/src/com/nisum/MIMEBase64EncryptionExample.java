package com.nisum;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class MIMEBase64EncryptionExample {

	public static void main(String[] args) {
		// Getting MIME encoder
		Encoder encoder = Base64.getMimeEncoder();
		String message = "Hello, \nYou are informed regarding your inconsistency of work";  
		String estr = encoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME Message"+estr);
		
		//Getting MIME Decoder
		Decoder decoder = Base64.getMimeDecoder();
		
		//Decoding encoded message
		
		String dstr = new String(decoder.decode(estr));
		System.out.println("Decoded Message :"+dstr);
		
	}

}
