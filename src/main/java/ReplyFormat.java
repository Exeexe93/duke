import java.util.List;

public class ReplyFormat {
    String indentationInFront;
    String message;
    String outline = "______________________________________";
    int numOfIndentInFront;

    /**
     * Initialise the reply message format
     */
    public ReplyFormat() {
        message = "";
        numOfIndentInFront = 0;
        indentationInFront = "";
    }

    /**
     * Adding one sentence to the reply
     * @param sentence message required to add
     */
    public void addSentence(String sentence) {
        message = message + indentationInFront + sentence + '\n';
    }

    /**
     * Change both outlines at top and bottom
     * @param outline the outline where wrap the message.
     */
    public void changeOutline(String outline) {
        this.outline = outline;
    }

    /**
     * Adding outline with indentation
     * @return the outline with indentation
     */
    public String addOutlineWithIndentation() {
        return indentationInFront + outline + '\n';
    }

    /**
     * Adding paragraph to the reply
     * @param paragraph paragraph to add
     */
    public void addParagraph(List<String> paragraph) {
        for (String sentence : paragraph) {
            addSentence(sentence);
        }
    }

    /**
     * Set the amount of indentation in front of message
     * @param numOfIndent number of indentation required
     */
    public void setIndentationInFront(int numOfIndent) {
        numOfIndentInFront = numOfIndent;
        indentationInFront = "";
        for (int i = 0; i < numOfIndentInFront; i++) {
            indentationInFront = indentationInFront.concat(" ");
        }
    }

    /**
     * Clear message
     */
    public void clearMessage() {
        message = "";
    }

    /**
     * Reply message
     * @return return outline with message
     */
    public String replyMessage() {
        return addOutlineWithIndentation() + message + addOutlineWithIndentation();
    }
}