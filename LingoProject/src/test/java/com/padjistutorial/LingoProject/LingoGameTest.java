package com.padjistutorial.LingoProject;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padjistutorial.LingoProject.classes.Datasource;
import com.padjistutorial.LingoProject.classes.LingoGame;


@RunWith(MockitoJUnitRunner.class)
public class LingoGameTest {
	
	ApplicationContext ctx;
	
	@Mock
	Datasource datasource;
	
	private static ArrayList<String> strings;
	
	@BeforeClass
	public static void setUpGeneral(){
		strings = new ArrayList<String>();
		strings.add("tutorial");
		strings.add("ablation");
		strings.add("abortive");
		strings.add("absorbed");
		strings.add("abundant");
	}

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Mockito.when(datasource.getWordsFromFackedDataSource()).thenReturn(strings);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		LingoGame lingoGame = (LingoGame) ctx.getBean("myLingoGame");
		lingoGame.startGame();
	}
	
	@Test
	public void testMockedMethod(){
		System.out.println(datasource.getWordsFromFackedDataSource());
	}
	
	/*@Test
	public void testLingGame(){
		LingoGame lingoGame = (LingoGame) ctx.getBean("myLingoGame");
		lingoGame.startGame();
		lingoGame.setWordsFromDataSource(datasource.getWordsFromFackedDataSource());
		
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
		
		
	}*/

}
