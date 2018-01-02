package com.nisum;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class BasicEncodingAndDecoding {

	public static void main(String[] args) {
		//Getting Encoder
		Encoder encoder = Base64.getUrlEncoder();
		//Creating byte array
		byte byteArr[] = {1,2};
		// encoding byte array  
		byte[] byteArr2 = encoder.encode(byteArr);
		System.out.println("Encoded byte array: "+byteArr2);
		byte byteArr3[]=new byte[5];
		int x = encoder.encode(byteArr,byteArr3);
		System.out.println("Encoded byte array written to another array :"+byteArr3);
		System.out.println("No of bytes written : "+x);
		
		
		//Encoding String 
		String str = encoder.encodeToString("Mahesh".getBytes());
		System.out.println("Encoded String :"+str);
		
		//Getting Decoder
		
		Decoder decoder = Base64.getUrlDecoder();
		String str2 = new String(decoder.decode(str));
		
		System.out.println("Decoded String :"+str2);
	}

}
