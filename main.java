import java.util.Scanner;
import java.lang.*;
import java.util.stream.IntStream;

public class main {
	
	public static void main(String[] args)
    {
		int numOfLinesInDiamond = 9;
		int numOfSpacesInFirstLine = 4;
		int currentLine = 1;
		StringBuilder asterisksSB = new StringBuilder();

		printDiamondRecursive(asterisksSB, numOfSpacesInFirstLine, numOfLinesInDiamond, currentLine);
    }
	
	public static void printDiamondRecursive(StringBuilder asterisksLineSB, int currentNumOfSpaces, int numOfLinesInDiamond, int currentLine) {
	    if (currentLine <= numOfLinesInDiamond / 2) {
	        if (currentNumOfSpaces == numOfLinesInDiamond / 2) {
	            asterisksLineSB.append("*");
	            printLineWithSpacesAndAsterisks(currentNumOfSpaces, asterisksLineSB);
	        }

	        if (currentNumOfSpaces > 0) {
	            currentLine += 1;
	            currentNumOfSpaces -= 1;
	            addAsterisksToLine(asterisksLineSB);
	            printLineWithSpacesAndAsterisks(currentNumOfSpaces, asterisksLineSB);
	            printDiamondRecursive(asterisksLineSB, currentNumOfSpaces, numOfLinesInDiamond, currentLine);
	        }
	    } else {
	        if (currentLine <= numOfLinesInDiamond && currentNumOfSpaces < numOfLinesInDiamond / 2) {
	            currentLine += 1;
	            currentNumOfSpaces += 1;
	            removeAsterisksFromLine(asterisksLineSB);
	            printLineWithSpacesAndAsterisks(currentNumOfSpaces, asterisksLineSB);
	            printDiamondRecursive(asterisksLineSB, currentNumOfSpaces, numOfLinesInDiamond, currentLine);
	        }
	    }
	}

	public static void printLineWithSpacesAndAsterisks(int numOfSpaces, StringBuilder asterisksLineSB) {
		StringBuilder line = new StringBuilder();
	    for (int i = 0; i < numOfSpaces; i++) {
	        line.append(" ");
	    }
	    line.append(asterisksLineSB);
	    System.out.println(line);
	}

	private static void addAsterisksToLine(StringBuilder asterisksLineSB) {
	    asterisksLineSB.insert(0, "*");
	    asterisksLineSB.append("*");
	}

	private static void removeAsterisksFromLine(StringBuilder asterisksLineSB) {
	    if (asterisksLineSB.length() >= 2) {
	        asterisksLineSB.deleteCharAt(0);
	        asterisksLineSB.deleteCharAt(asterisksLineSB.length() - 1);
	    }
	}

}