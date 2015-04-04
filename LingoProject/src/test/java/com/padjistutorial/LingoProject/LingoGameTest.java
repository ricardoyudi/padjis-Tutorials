package com.padjistutorial.LingoProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padjistutorial.LingoProject.classes.LingoGame;

public class LingoGameTest {
	
	ApplicationContext ctx;
	

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		LingoGame lingoGame = (LingoGame) ctx.getBean("myLingoGame");
		lingoGame.StartGame();
	}
	
	@Test
	public void testLingGame(){
		LingoGame lingoGame = (LingoGame) ctx.getBean("myLingoGame");
		lingoGame.startGame();
		lingoGame.setWordsFromDataSource(getWordsFromFackedDataSource());
		
		lingoGame.selectAWordFromTheFakeDataSource();
		
		lingoGame.initLayout();
		
		for(int i=0;i<lingoGame.getNumberOfChances();i++){
			
			lingoGame.waitForAwnser();
			
			if(lingGame.chechkAnswer()){
				
				lingoGame.theGameIsWon();
				lingoGame.stopGame();
				
			}
			
		}
		
		lingoGame.theGameIsLost();
		
		lingoGame.stopGame();
		
		
	}

}
