import arc.*;

public class FinalCPTNorman{
	public static void main(String[] args){
		Console con = new Console(1660,600);
		
		//Opens Files
	    TextOutputFile Score = new TextOutputFile("HighScore.txt", true);
	    TextInputFile Theme = new TextInputFile("Themes.txt");
	    TextInputFile Words = new TextInputFile("Words.txt");
	    
		//Variables
		String strNames;
		int intScore;
		String strChoice;
		String strThemes;
		String strWords[][];
		String strWordCheck;
		String strThemeChoice;
		int intWordCount;
		int intCount;
		int intRand;
		String strTempName;
		String strTempPrice;
		int intRow2;

		//Initalize variables
		intWordCount = 0;
		
		// Main menu
		con.println("||      ||         //\\         ||\\        || --------------           //\\                //\\                    //\\          ||\\        ||");
		con.println("||      ||        //  \\        || \\       || ||                      //  \\              //  \\                  //  \\         || \\       ||");
		con.println("||      ||       //    \\       ||  \\      || ||                     //    \\            //    \\                //    \\        ||  \\      ||");
		con.println("||------||      //------\\      ||   \\     || ||                    //      \\          //      \\              //------\\       ||   \\     ||");
		con.println("||------||     //        \\     ||    \\    || ||                   //        \\        //        \\            //        \\      ||    \\    ||");
		con.println("||      ||    //          \\    ||     \\   || ||     --------     //          \\      //          \\          //          \\     ||     \\   ||");
		con.println("||      ||   //            \\   ||      \\  || ||            ||   //            \\    //            \\        //            \\    ||      \\  ||");
		con.println("||      ||  //              \\  ||       \\ || ||            ||  //              \\  //              \\      //              \\   ||       \\ ||");
		con.println("||      || //                \\ ||        \\|| ||------------|| //                \\//                \\    //                \\  ||        \\||");	
		con.println("");
		con.println("Play Game");
		con.println("");
		con.println("View HighScores");
		con.println("");
		con.println("Quit");
		con.println("");
		con.println("Help");
		con.println("");
		con.println("What would you like to do?");
		strChoice = con.readLine();
		
		//Opens respective game options
		if(strChoice.equalsIgnoreCase("Play Game")){
			con.clear();
			while(Theme.eof() == false){
				strThemes = Theme.readLine();
				con.println(strThemes);
				con.println(""); 
			}
			con.print("Pick your Theme: ");
			strThemeChoice = con.readLine();
			
			if(strThemeChoice.equalsIgnoreCase("Video Games")){
				TextInputFile Video = new TextInputFile("VideoGamesWords.txt");
				while(Video.eof() == false){
					strWordCheck = Video.readLine();
					intWordCount = intWordCount + 1;
			}
			Video.close();
			TextInputFile Videos = new TextInputFile("VideoGamesWords.txt");
			strWords = new String[intWordCount][2];
			for(intCount = 0; intCount < intWordCount; intCount++){
				strWords[intCount][0] = Videos.readLine();
				intRand = (int)(Math.random() * 100 + 1);
				strWords[intCount][1] = String.valueOf(intRand);
			} 
			for(intRow2 = 0; intRow2 < intWordCount-1; intRow2++){
				for(intCount = 0; intCount < intWordCount-1-intRow2; intCount++){
					if(Integer.parseInt(strWords[intCount][1]) > Integer.parseInt(strWords[intCount+1][1])){
						strTempName = strWords[intCount][0];
						strTempPrice = strWords[intCount][1];
						strWords[intCount][0] = strWords[intCount+1][0];
						strWords[intCount][1] = strWords[intCount+1][1];
						strWords[intCount+1][0] = strTempName;
						strWords[intCount+1][1] = strTempPrice;
						}
					}
				}
			}else if(strThemeChoice.equalsIgnoreCase("Movies")){
				
			}
			
		}else if(strChoice.equalsIgnoreCase("View HighScores")){
			
		}else if(strChoice.equalsIgnoreCase("Quit")){
			System.exit(0);
		}else if(strChoice.equalsIgnoreCase("Help")){
			
		}else{
			con.clear();
			con.println("");
			con.println("Invalid option");
			con.sleep(1000);
			System.exit(0);
		}
	}
}
  

