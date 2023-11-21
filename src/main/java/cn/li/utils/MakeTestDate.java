package cn.li.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MakeTestDate {
//	private String[] cardType = {"idCard","bankCard","creditCard"};
//
//	private HashMap<String, String> username = new HashMap<String, String>();
//	private String mobile;
//	private String email;
//
//	private String bankName;
//
//	private String data;
//
//	private String coutry;
//	private String city;
//	private String address;
//	private String postCode;
//
//	private String[] lastNames = {};

	public void createUsername() {

		try {
			FileReader fileReader = new FileReader("单姓.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);

			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
