import java.util.Scanner;
import java.lang.Character;


public class main1 {
	public static void main(String[] args)
    {
		System.out.println("Please enter the diamond's height");
		String diamondHeightStr = getValidHeightFromUser();
		printDiamond(diamondHeightStr);
    }
	
	private static String getValidHeightFromUser()
	{
		Scanner scanner = new Scanner(System.in);
        String inputFromUser = scanner.nextLine();
	    boolean isValidHeight = checkValidHeight(inputFromUser);

	    if (!isValidHeight)
	    {
	    	System.out.println("Please enter valid height");
	        inputFromUser = getValidHeightFromUser();
	    }

	    return inputFromUser;
	}

	private static boolean checkValidHeight(String i_InputStr)
	{
		return i_InputStr.chars().allMatch(Character::isDigit);
	}

	private static void printDiamond(String i_HieghtOfDiamond)
	{
		main ma = new main();
	    int numOfSpaces;
	    int currentLine = 1;
	    String heightOfDiamond = i_HieghtOfDiamond; 
	    int diamondHeight = Integer.parseInt(heightOfDiamond);
//	    StringBuilder asterisksSB = new StringBuilder("", diamondHeight);
	    StringBuilder asterisksSB = new StringBuilder();

	    if (diamondHeight != 1)
	    {
	        numOfSpaces = diamondHeight / 2;
	        ma.printDiamondRecursive(asterisksSB, numOfSpaces, diamondHeight, currentLine);
	    }
	    else
	    {
	        numOfSpaces = 1;
	        asterisksSB.append("*");
	        ma.printLineWithSpacesAndAsterisks(numOfSpaces, asterisksSB);
	    }
	}
    
}
