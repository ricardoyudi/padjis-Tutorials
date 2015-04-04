package com.padjistutorial.LingoProject.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LingoGame {
	
	ArrayList<String> strings ;
	
	String chooseWord;
	String playabledWord;
	String playedWord;
	Random random;
	Scanner scanner;
	
	public LingoGame(){
		
	}
	
	public void startGame(){
		System.out.println();
		System.out.println("The Lingo Game has started");
		System.out.println();
	}

	public void setWordsFromDataSource(List<String> wordsFromFackedDataSource) {
		strings=(ArrayList<String>) wordsFromFackedDataSource;
	}

	public void selectAWordFromTheFakeDataSource() {
	
		chooseWord = strings.get(random.nextInt(5));
		
	}

	public void initLayout() {
		playabledWord = new String("........");
		char[] cs = playabledWord.toCharArray();
		int n=0;
		while(n<8){
			n = n+random.nextInt(3);
			cs[n]= chooseWord.toUpperCase().charAt(n);
		}
			
		
	}

	public int getNumberOfChances() {
		return 5;
	}

	public void waitForAwnser() {
		scanner = new Scanner(System.in);
		playabledWord = scanner.nextLine();
	}

	
}
