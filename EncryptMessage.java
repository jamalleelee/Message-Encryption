package com.encryption;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class EncryptMessage {

	public static String EncryptMe(String userMessage, Key myKey) {
		byte[] userEncryptedMessage = null;
		String userMessageInBytes = null;
		String userMessageInChars = null;
		try {

			Cipher userCipher = Cipher.getInstance("AES");

			userCipher.init(Cipher.ENCRYPT_MODE, myKey);

			userEncryptedMessage = userCipher.doFinal(userMessage.getBytes());
			userMessageInBytes = Arrays.toString(userEncryptedMessage);
			userMessageInChars = new String(userEncryptedMessage);

		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
				| BadPaddingException e) {
			e.printStackTrace();
		}

		return "Your message in characters is: \n" + userMessageInChars + "\nYour message in numbers is: \n"
				+ userMessageInBytes;

	}

}
