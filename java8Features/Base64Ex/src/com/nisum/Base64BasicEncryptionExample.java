package com.nisum;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64BasicEncryptionExample {
	public static void main(String[] args) {
		//Getting encode
		Encoder encoder = Base64.getEncoder();
		//Encoding URL
		String estr = encoder.encodeToString("http://localhost:8081/carpool/v1/carpool/update".getBytes());
		System.out.println("Encoding URL :"+estr);
		//Getting decode
		Decoder decoder = Base64.getDecoder();
		//Decoding URL
		String dstr = new String(decoder.decode(estr));
		System.out.println("Decoded URL :"+dstr);
	}
}
