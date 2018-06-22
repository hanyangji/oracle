package com.oracle.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTxtFile {
	public static void parseTXT(String fileName) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(
									new FileInputStream(fileName),"GB18030"));
		
		String titles = reader.readLine();
		System.out.println(titles);
		String[] titleArray = titles.split("\\|");
//		for(int i=0;i<titleArray.length;i++){
//			System.out.println(titleArray[i]);
//		}
		
		String line1 = null;
		line1=reader.readLine();
		String[] line1Str=line1.split("\\|");
		for(int i=0;i<line1Str.length;i++) {
			if(!line1Str[i].equals(""))
			System.out.println(titleArray[i]+":"+line1Str[i]);
		}
		reader.close();
	}
	
	public static void main(String[] args) {
		String date = DateFormat.getCurrentDate();
		String remote = ConstContent.PREFIX + date + ConstContent.SURFIX;
		String localDir = ConstContent.LOCALPATH ;
		String localFile = localDir +  "/" + remote;
		String archiveFile = "/Users/hanyangji/Desktop/99993420_20180621.7z";
		SevenZipOption.extractItemsSimple(archiveFile);
		
		String txtFile = localDir + "/"+ date +"_"  + ConstContent.TXTNAME;
		try {
			parseTXT(txtFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
