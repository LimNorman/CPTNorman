import arc.*;

public class FinalCPTNorman{
	public static void main(String[] args){
		Console con = new Console(1660,600);
		
		//Opens Files
	    //TextOutputFile Score = new TextOutputFile("HighScore.txt", true);
	    TextInputFile Theme = new TextInputFile("Themes.txt");
	    TextInputFile Words = new TextInputFile("Words.txt");
	    
		//Variables
		String strNames;
		String strScore;
		int intHighScore;
		String strChoice;
		String strThemes;
		String strWordCheck;
		String strThemeChoice;
		int intWordCount;
		int intCount;
		int intRand;
		String strTempName;
		String strTempPrice;
		int intRow2;
		String strLetter[][];
		int intLength;
		String strWords[][];
		String strSecret;
		

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
			
			//randomising based on choice
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
					strWords[intCount][1] = intRand + "";
				} 
				for(intRow2 = 0; intRow2 < intWordCount-1; intRow2++){
					for(intCount = 0; intCount < intWordCount-1-intRow2; intCount++){
						if(Integer.parseInt(strWords[intCount][1]) < Integer.parseInt(strWords[intCount+1][1])){
							strTempName = strWords[intCount][0];
							strTempPrice = strWords[intCount][1];
							strWords[intCount][0] = strWords[intCount+1][0];
							strWords[intCount][1] = strWords[intCount+1][1];
							strWords[intCount+1][0] = strTempName;
							strWords[intCount+1][1] = strTempPrice;
						}
					}
					con.println(strWords[intCount][1]+" = "+strWords[intCount][0]);
				}
			Videos.close();
			strSecret = strWords[0][0];
			intLength = strSecret.length();
			con.clear();
			strScore = main(con,strThemeChoice, intLength, strSecret);
			
			}else if(strThemeChoice.equalsIgnoreCase("Movies")){
				TextInputFile Movie = new TextInputFile("MoviesWords.txt");
				while(Movie.eof() == false){
					strWordCheck = Movie.readLine();
					intWordCount = intWordCount + 1;
			}
				Movie.close();
				TextInputFile Movies = new TextInputFile("MoviesWords.txt");
				strWords = new String[intWordCount][2];
				for(intCount = 0; intCount < intWordCount; intCount++){
					strWords[intCount][0] = Movies.readLine();
					intRand = (int)(Math.random() * 100 + 1);
					strWords[intCount][1] = intRand + "";
				} 
				for(intRow2 = 0; intRow2 < intWordCount-1; intRow2++){
					for(intCount = 0; intCount < intWordCount-1-intRow2; intCount++){
						if(Integer.parseInt(strWords[intCount][1]) < Integer.parseInt(strWords[intCount+1][1])){
							strTempName = strWords[intCount][0];
							strTempPrice = strWords[intCount][1];
							strWords[intCount][0] = strWords[intCount+1][0];
							strWords[intCount][1] = strWords[intCount+1][1];
							strWords[intCount+1][0] = strTempName;
							strWords[intCount+1][1] = strTempPrice;
						}
					}
					con.println(strWords[intCount][0]+" = "+strWords[intCount][1]);
				}
				Movies.close();
				strSecret = strWords[0][0];
				intLength = strSecret.length();
				con.clear();
			    strScore = main(con,strThemeChoice, intLength, strSecret);
			    
			}else if(strThemeChoice.equalsIgnoreCase("TableTop Games")){
				TextInputFile Table = new TextInputFile("TableTopWords.txt");
				while(Table.eof() == false){
					strWordCheck = Table.readLine();
					intWordCount = intWordCount + 1;
					//con.println(intWordCount);
			}
				Table.close();
				//intWordCount = intWordCount + 1;
				TextInputFile Tables = new TextInputFile("TableTopWords.txt");
				strWords = new String[intWordCount][2];
				for(intCount = 0; intCount < intWordCount; intCount++){
					strWords[intCount][0] = Tables.readLine();
					intRand = (int)(Math.random() * 100 + 1);
					strWords[intCount][1] = intRand+"";
					//con.println(strWords[intCount][0]+" = "+strWords[intCount][1]);
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
					con.println(strWords[intCount][0]+" = "+strWords[intCount][1]);
				}
				strSecret = strWords[0][0];
				intLength = strSecret.length();
				con.clear();
			    strScore = main(con,strThemeChoice, intLength, strSecret);
			}else{
				con.clear();
				con.println("Invalid Theme");
				con.sleep(1000);
				System.exit(0);
			}
			
		}else if(strChoice.equalsIgnoreCase("View HighScores")){
			
		}else if(strChoice.equalsIgnoreCase("Quit")){
			con.println("Closing game");
			con.sleep(1000);
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
	public static String main(Console con,String strTheme, int intL, String strS){
		//Variables
		String strScore;
		int intWrong;
		boolean blnContinue;
		boolean blnBack;
		int intNextWord;
		int intLetterIndex[][];
		int intIndex;
		int intCount;
		int intRan;
		int intRow2;
		String strTempLetter;
		int intTempIndex;
		int intTempValue;
		String strSpaceCheck;
		String strGuess;
		boolean blnWrong;
		boolean blnWrongCheck;
		boolean blnFoundHint;
		
		//Initialzing variables
		strScore = "0";
		intWrong = 0;
		blnContinue = false;
		blnBack = false;
		intNextWord = 0;
		strSpaceCheck = (" ");
		blnWrongCheck = false;
		blnWrong = false;
		
		// set random value to each letter except space
		intLetterIndex = new int[intL][2];
		for(intCount = 0; intCount < intL; intCount++){
			intLetterIndex[intCount][0] = intCount;
			
			if(strS.substring(intCount,intCount+1).equalsIgnoreCase(" ")){
				intLetterIndex[intCount][1] = 0;
			}else{
				intRan = (int)(Math.random() * 100 + 1);
				intLetterIndex[intCount][1] = intRan;
			}
		}
		
		// sort the order for showing each letter hint
		for(intRow2 = 0; intRow2 < intL-1; intRow2++){
			for(intCount = 0; intCount < intL-1-intRow2; intCount++){
				if(intLetterIndex[intCount][1] < intLetterIndex[intCount+1][1]){
					intTempIndex = intLetterIndex[intCount][0];
					intTempValue = intLetterIndex[intCount][1];
					intLetterIndex[intCount][0] = intLetterIndex[intCount+1][0];
					intLetterIndex[intCount][1] = intLetterIndex[intCount+1][1];
					intLetterIndex[intCount+1][0] = intTempIndex;
					intLetterIndex[intCount+1][1] = intTempValue;
				}
			}
		}
		
		//Main gameplay
		while(blnWrong == false){
			//clears past text
			con.clear();

			if(intWrong == 0){
				con.println("        ----------------");
				con.println("        |              |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("-------------------");
			} else if(intWrong == 1){
				con.clear();
				con.println("        ----------------");
				con.println("        |              |");
				con.println("        |             ---");
				con.println("        |            |   |");
				con.println("        |             ---");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("-------------------");
				
			}else if(intWrong == 2){
				con.clear();
				con.println("        ----------------");
				con.println("        |              |");
				con.println("        |             ---");
				con.println("        |            |   |");
				con.println("        |             ---");
				con.println("        |              |");
				con.println("        |              |");
				con.println("        |              |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("-------------------");
				
			}else if(intWrong == 3){
				con.clear();
				con.println("        ----------------");
				con.println("        |              |");
				con.println("        |             ---");
				con.println("        |            |   |");
				con.println("        |             ---");
				con.println("        |            //|\\\\");
				con.println("        |           // | \\\\");
				con.println("        |              |");
				con.println("        |");
				con.println("        |");
				con.println("        |");
				con.println("-------------------");
				
			}else if(intWrong == 4){
				con.clear();
				con.println("        ----------------");
				con.println("        |              |");
				con.println("        |             ---");
				con.println("        |            |   |");
				con.println("        |             ---");
				con.println("        |            //|\\\\");
				con.println("        |           // | \\\\");
				con.println("        |              |");
				con.println("        |            // \\\\");
				con.println("        |           //   \\\\");
				con.println("        |");
				con.println("-------------------");
				
			}else{
			
			}
			blnWrong = true;
			blnWrongCheck = false;
		
			//prints empty spaces and hint letters
			con.println("");
			con.println("");

			for(intCount = 0; intCount < intL; intCount++){
				strTempLetter = strS.substring(intCount,intCount+1);
				if(strTempLetter.equalsIgnoreCase(" ")){
					con.print("   ");
				}else{
					blnFoundHint = false;
					for (int intCount2 = 0; intCount2 < intWrong; intCount2++) {
						intTempIndex = intLetterIndex[intCount2][0];
						if (intTempIndex == intCount) {
							// show hint
							con.print("  " + strTempLetter + "   ");
							blnFoundHint = true;
						}
					}
					if (!blnFoundHint) {
						// show line
						con.print("----  ");
					}
				}
			}
			con.println("");			
			
			con.println("Enter your guess");
			strGuess = con.readLine();
			if(strGuess.equalsIgnoreCase(strS)){
				con.println("You win!");
				
			}else{
				blnWrongCheck = true;
			}		
			
			if(blnWrongCheck == true){
				intWrong = intWrong+1;
				blnWrong = false;
				con.println("Hello");
			}
		}

		return(strScore);
	}
}
