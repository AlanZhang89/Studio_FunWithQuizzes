import java.util.List;

public abstract class Questions {
    private String askQuestion;

    public Questions(String askQuestion) {
        this.askQuestion = askQuestion;
    }

    public String askQuestion() {
        return askQuestion;
    }

    public abstract void display();
    public abstract boolean checkAnswer(String answer);
}


