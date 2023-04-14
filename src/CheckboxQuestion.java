import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckboxQuestion extends Questions {
    private String[] options;
    private boolean[] correctOptions;

    public CheckboxQuestion(String prompt, String[] options, boolean[] correctOptions) {
        super(prompt);
        this.options = options;
        this.correctOptions = correctOptions;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean[] getCorrectOptions() {
        return correctOptions;
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
        boolean[] selectedOptions = new boolean[options.length];
        for (int i = 0; i < answer.length(); i++) {
            int selectedOptionIndex = answer.toUpperCase().charAt(i) - 'A';
            selectedOptions[selectedOptionIndex] = true;
        }
        return Arrays.equals(selectedOptions, correctOptions);
    }
}


