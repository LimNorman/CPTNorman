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
		String strWords;
		char chrWordCheck;
		String strWordEnter;
		char chrThemeChoice;

		//Initalize variables
		chrWordCheck = Words.readChar(); 
		
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
			chrThemeChoice = con.readChar();
			
			while(Words.eof() == false && chrThemeChoice != chrWordCheck){
				chrWordCheck = Words.readChar();
				if(chrThemeChoice == chrWordCheck){
					while(chrThemeChoice == chrWordCheck){
						strWordEnter = Words.readLine();
						con.sleep(1000);
						con.println(strWordEnter);
						chrWordCheck = Words.readChar();
					}
				}
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
