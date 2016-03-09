package lab06.authors;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * This program attempts to identify the author of an "unknown" text. The author
 * is identified by computing a "signature" for the text and comparing it to
 * similar signatures computed for texts where the author is known.
 * 
 * <p>
 * The "signature" of an author is formed by a collection of statistical
 * properties based on their writing. In this project an author's signature is
 * comprised of five values:
 * <UL>
 * <LI>The average length of the words used
 * <LI>The average number of words per sentence
 * <LI>The Type-Token Ratio
 * <LI>The Hapax Legomana Ratio
 * <LI>The Sentence Complexity
 * </UL>
 * 
 * <p>
 * Each of these statistics is computed by a sub-class of the FeatureCalculator
 * class and is described in detail in the lab assignment.
 * 
 * @author Grant Braught
 * @version 8 March 2015
 */
public class AuthorIdentifier {

	private static Scanner scr = new Scanner(System.in);

	/**
	 * The main method for the program. This method displays the menu and reads
	 * the user's choice. It invokes the appropriate method(s) based on the
	 * user's choice and repeats until the user exits the program.
	 * 
	 * @param args
	 *            none.
	 * 
	 * 
	 **/
	/**
	 * Add a new signature to the collection. When this option is entered the
	 * user is prompted for the name of an author and for the name of a text
	 * file that contains a piece of writing by that author. The user can be
	 * prompted by printing a prompt to the screen and reading a line of text
	 * using the Scanner referred to by the field scr.
	 * 
	 * @param signatures
	 * @param authorName
	 * @param textFile
	 */
	private static void addSignatures(SignatureCollection signatures,
			String authorName, String textFile) {
		try {
			TextSignature text = new TextSignature(authorName, textFile);
			signatures.addSignature(text);
		} catch (IOException e) {
			System.out.println("Error: Opening or Creating file " + textFile);

		}
	}

	/**
	 * Display each signature in the collection. When this option is entered the
	 * signatures in the collection are printed to the screen
	 * 
	 * @param sig
	 */
	private static void displaySignatures(SignatureCollection sig) {
		sig.displaySignatures();
	}

	/**
	 * Save the signature file. When this option is entered all of the
	 * signatures in the collection are saved into the signatures file. The
	 * signatures file should be named signatures.txt and should be located in
	 * the src/lab06/authors/documents directory
	 * 
	 * @param sig
	 * @param sigFile
	 */
	private static void saveSigFile(SignatureCollection sig, String sigFile) {
		try {
			sig.saveSignatures(sigFile);

		} catch (IOException e) {
			System.out.println("Error: Opening or Creating file " + sigFile);

		}
	}

	/**
	 * Load the signature file. When this option is entered, all of the
	 * signatures in the signatures.txt file are loaded into into the
	 * collection. If an exception occurs when reading the signature file it
	 * must be caught and an appropriate error message displayed.
	 * 
	 * @param sig
	 * @param sigFile
	 */
	private static void loadSigFile(SignatureCollection sig, String sigFile) {
		try {
			sig.loadSignatures(sigFile);

		} catch (ParseException e) {
			System.out.println("There is a problem parsing the file contents");
			System.out.println(e.getErrorOffset());

		} catch (IOException e) {
			System.out.println("Error: Opening or Creating file " + sigFile);

		}
	}

	/**
	 * Identify the author of an unattributed piece of writing. When this option
	 * is entered the user is prompted for the name of a text file containing a
	 * writing sample. A new TextSignature is created for the writing sample in
	 * the file and that signature is then used to find the closest matching
	 * signature in the collection, and thus a good guess at the author of the
	 * unattributed piece. The name of the proposed author should be displayed
	 * on the screen. If an exception occurs when reading the text file it must
	 * be caught and an appropriate error message displayed.
	 * 
	 * @param sig
	 * @param textFile
	 */

	private static void identifyAu(SignatureCollection sig, String textFile) {
		try {
			TextSignature match = new TextSignature("A", textFile);
			TextSignature text = sig.findMostSimilar(match);
			System.out.println("Author is: " + text.getAuthorName());
		} catch (IOException e) {
			System.out.println("Error: Opening or Creating file " + textFile);

		}

	}

	public static void main(String[] args) {

		SignatureCollection signatures = new SignatureCollection();

		boolean done = false;
		while (!done) {
			System.out.println("\nMenu:");
			System.out.println("------------------------------");
			System.out.println("A   Add Signature");
			System.out.println("D   Display Signatures");
			System.out.println("S   Save Signature File");
			System.out.println("L   Load Signature File");
			System.out.println("E   Erase Signatures");
			System.out.println("I   Identify Author");
			System.out.println("Q   Quit");
			System.out.println("------------------------------");
			System.out.print("Enter Option: ");

			String choice = scr.nextLine().toUpperCase();

			if (choice.equals("E")) {
				signatures = new SignatureCollection();
			} else if (choice.equals("A")) {
				System.out.print("Users added author's name: ");
				String userTyped = scr.nextLine();
				System.out.print("Users added file's name: ");
				String userTyped1 = scr.nextLine();
				userTyped1 = "src/lab06/authors/documents/" + userTyped1;
				addSignatures(signatures, userTyped, userTyped1);

			} else if (choice.equals("D")) {
				displaySignatures(signatures);

			} else if (choice.equals("S")) {
				System.out.println("Users saved signatures to this file: ");
				String userTyped = "src/lab06/authors/documents/signatures.txt";
				saveSigFile(signatures, userTyped);
			} else if (choice.equals("L")) {
				String userTyped = "src/lab06/authors/documents/signatures.txt";
				loadSigFile(signatures, userTyped);

			} else if (choice.equals("I")) {
				String userTyped = "src/lab06/authors/documents/"
						+ scr.nextLine();
				identifyAu(signatures, userTyped);
			}

			else if (choice.equals("Q")) {
				System.out.println("Goodbye!");
				done = true;
			} else {
				System.out.println("Unrecognized option: " + choice + ".\n\n");
			}
		}

		scr.close();
	}
}
