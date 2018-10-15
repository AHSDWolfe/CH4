/**
 * Denver Wolfe
 * CH4PC3  
 * Programming III - AP CS
 * 10/12/18
 */

public class TestScores {
    //Declare variables
    private char grade;
    private double score1, score2, score3, average;
    
    //Create new class that sets scores equal to respective variables
    public TestScores (double s1, double s2, double s3){
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    
    //Set score1 to s1
    public void setScore1(double s1){
        score1 = s1;
    }
    
    //Set score2 to s2
    public void setScore2(double s2){
        score2 = s2;
    }
    
    //Set score3 to s3
    public void setScore3(double s3){
        score3 = s3;
    }
    
    //Return score1
    public double getScore1(){
        return score1;
    }
    
    //Return score2
    public double getScore2(){
        return score2;
    }
    
    //Return score3
    public double getScore3(){
        return score3;
    }
    
    //Determine average and return average
    public double getAverage(){
        average = (score1 + score2 + score3) / 3;
        return average;
    }
    
    //Use average to determine letter grade
    public char getLetterGrade(){
        if (average >= 90){
            grade = 'A';
        }else if(average >= 80){
            grade = 'B';
        }else if(average >= 70){
            grade = 'C';
        }else if(average >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
    }
}