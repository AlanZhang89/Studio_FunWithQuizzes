import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
    TrueOrFalse tFquestion = new TrueOrFalse("Only one sun in the sky true or false? ",true);
        Scanner input = new Scanner(System.in);
        tFquestion.display();
        String answer = input.next().toLowerCase();
        if (tFquestion.checkAnswer(answer) == true){
            System.out.println("you are correct!");
        }else {
            System.out.println("you are wrong!");
        }
        ArrayList<String> mutiQuestions= new ArrayList<>();
        mutiQuestions.add("1.Question: Who is credited with inventing the World Wide Web?");
        mutiQuestions.add("Question: Which of the following is NOT one of the Great Lakes of North America?");
        String [] options = {"Bill Gates" ,
                "Tim Berners-Lee" ,
                "Steve Jobs" ,
                "Jeff Bezos"};
    MultipleChoiceQuestion mutiQuestion1 = new MultipleChoiceQuestion(mutiQuestions.get(0),options,1);
    mutiQuestion1.display();
    String muAnswer = input.next();
        if (mutiQuestion1.checkAnswer(muAnswer) == true){
            System.out.println("you are correct!");
        }else {
            System.out.println("you are wrong!");
        }
    }
}
