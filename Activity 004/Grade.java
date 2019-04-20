/**
*Activity 004.
*Tyler Andrews-Comp1210-06.
*10/2/17.
*/
public class Grade {
   private double exam1;
   private double exam2;
   private double finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private Str++ing studentName;
   /**
   * sets exam scores.
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   /**
   *constructs everything.
   *@param studentNameIn = the name of the student
   */

   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   
   }
   /**
   *sets the lab averages.
   *@param activityAvgIn = the average of activities.
   *@param quizAvgIn = the average of quizes.
   */
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   /**
   *sets the exam scores.
   *@param examType = the type of exam.
   *@param examScoreIn = The score of the exam.
   */

   public void setExamScore(int examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn; }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn; }
      else if (examType == FINAL) {
         finalExam = examScoreIn; }
   }
  /**
   *calculates the grade. 
   *@param projectAvgIn = the average score of the projects.
   */
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
  /**
  *calculates grade.
  *@return grade = the grade.
  */
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**
   * creates output.
   * @return = grade info.
   */
   public String toString() {
   
      return "Name: " + studentName + "\n" + "Course Grade: "
         + calculateGrade();
   }
  
   


}