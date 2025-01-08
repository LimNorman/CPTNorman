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
		boolean blnStart;
		boolean blnHigh;
		boolean blnQuit;
		boolean blnHelp;


		
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
		
        
	}
}
