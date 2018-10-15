/**
 * Denver Wolfe
 * CH4PC3  
 * Programming III - AP CS
 * 10/12/18
 */
public class TestScoresDemo {

    public static void main(String[] args) {
        //Create new Test Scores
        TestScores test = new TestScores(93.0, 83.0, 100.0);
        
        //Declare variables
        double avg;
        char g;
        
        //Use variables to get average and letter grade
        avg = test.getAverage();
        g = test.getLetterGrade();
        
        //Print average and letter grade
        System.out.println(avg);
        System.out.println(g);
    }
}
