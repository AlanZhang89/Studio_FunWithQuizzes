import java.util.Arrays;
import java.util.List;

public class TrueOrFalse extends Questions {
    private boolean correctAnswer;

    public TrueOrFalse(String askQuestion, boolean correctAnswer) {
        super(askQuestion);
        this.correctAnswer = correctAnswer;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public void display() {
        System.out.println(askQuestion());
        System.out.println("True or False?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(Boolean.toString(correctAnswer));
    }
}


