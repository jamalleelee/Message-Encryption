package com.encryption;

import java.security.Key;
import java.util.Scanner;

public class MyMessage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Key myKey = SecretKeyGenerator.myKeyGen();

		System.out.println("Please Enter The Message You Would Like To Keep Secret:");

		String userMessage = sc.nextLine();

		System.out.println(EncryptMessage.EncryptMe(userMessage, myKey));

		sc.close();
	}

}
