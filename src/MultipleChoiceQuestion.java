public class MultipleChoiceQuestion extends Questions {
    private String[] options;
    private int correctOptionIndex;

    public MultipleChoiceQuestion(String askQuestion, String[] options, int correctOptionIndex) {
        super(askQuestion);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    @Override
    public void display() {
        System.out.println(askQuestion());
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) + ") " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        int selectedOptionIndex = answer.toUpperCase().charAt(0) - 'A';
        return selectedOptionIndex == correctOptionIndex;
    }
}
