
public class Board {
    private String phrase;
    private String solvedPhrase;
    private int currentLetterValue;

    // Constructor
    public Board() {
        this.phrase = loadPhrase(); // Assume loadPhrase() loads the phrase
        this.solvedPhrase = phrase.replaceAll("[a-zA-Z]", "_"); // Masks phrase letters
        setLetterValue();
        System.out.println("Phrase: " + phrase); // Temporary test output
    }

    // Method to load a phrase (placeholder for actual loading logic)
    private String loadPhrase() {
        // This function would load a phrase from a file or database
        return "Test Phrase"; // Placeholder phrase
    }

    // Method to set a random letter value
    private void setLetterValue() {
        this.currentLetterValue = (int)(Math.random() * 10 + 1); // Random value between 1 and 10
    }

    // Method to display the current state of the solved phrase
    public void displayBoard() {
        System.out.println(solvedPhrase);
    }
}
