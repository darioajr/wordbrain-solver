package words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Reading dictionary...");
		List<String> dictionaryAsList = Files.readAllLines(Paths.get("", "dictionary.txt"));
		Set<String> dictionary = new HashSet<>(dictionaryAsList);
		System.out.println("Finished reading dictionary...");
		
		WordFinder finder = new WordFinder(dictionary);
		
		Queue<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(6);
		q.add(7);
		List<List<String>> wordsFound = finder.findWords(createGrid(), q);
		
		printWords(wordsFound);
		
	}

	private static void printWords(List<List<String>> wordsFound) {
		System.out.println("Words found:");
		for (List<String> result : wordsFound) {
			for (String word : result) {
				System.out.print(word + ", ");
			}
			System.out.println("");
		}
	}
	

	

	private static char[][] createGrid() {
		char[][] grid = new char[4][4];
		// y, x
		grid[0][0] = 'n';
		grid[0][1] = 'o';
		grid[0][2] = 'n';
		grid[0][3] = 'c';
		grid[1][0] = 'p';
		grid[1][1] = 'n';
		grid[1][2] = 't';
		grid[1][3] = 'm';
		grid[2][0] = 'e';
		grid[2][1] = 'c';
		grid[2][2] = 'a';
		grid[2][3] = 'a';
		grid[3][0] = 'r';
		grid[3][1] = 'e';
		grid[3][2] = 'n';
		grid[3][3] = 'j';
	
		return grid;
	}

}
