package exceptions;

public class TextValidator {

  private String text;
  private final int SIZE_LIMIT;
  private static final String[] BAD_WORDS = {"durak", "profan", "balbes"};

  public TextValidator(int sizeLimit) {
    SIZE_LIMIT = sizeLimit;
  }

  /**
   * Set post to be read in near future.
   * Text content is validated.
   * @param text
   * @throws MyCheckedException
   */
  public void readPost(String text) throws MyCheckedException {
    checkSizeConstraints(text);
    validateBadWords(text);
    System.out.println("Your text is fine, it will be read in near future");
    this.text = text;
  }

  /**
   * If text size is longer that SIZE_LIMIT, throw MyCheckedException.
   */
  private void checkSizeConstraints(String text) throws MyCheckedException {
    if (text.length() > SIZE_LIMIT) {
      throw new MyCheckedException();
    }
    System.out.println("Text complains to size limits!");
  }

  /**
   * Validate all text words from using bad words.
   * @param text
   */
  private void validateBadWords(String text) {
    String[] words = text.split(" ");
    for (String word: words) {
      isBadWord(word);
    }
  }

  /**
   * Checks if word is bad and banned from usage.
   * Compares with values in BAD_WORDS array.
   * @param word
   */
  private void isBadWord(String word) {
    String lowerCaseWord = word.toLowerCase();
    for (String badWord: BAD_WORDS) {
      if (lowerCaseWord.contains(badWord)) {
        String message = "Bad word '%s' found in text!".formatted(badWord);
        throw new MyUncheckedException(message);
      }
    }
  }

  /**
   * Returns value of `text` field
   * @return
   */
  public String getText() {
    return text;
  }
}
