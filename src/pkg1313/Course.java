/*
 * Project exercise 13.13 Course class 
 * Lauren Smith 
 * 12/21/20 
 * Modifies courses class from chapter 10 by adding cloneable interface 
 */
package pkg1313;


public class Course implements Cloneable {
    //declares private vars 
    private String courseName; 
    private String students[]=new String[100];
    private int numberOfStudents; 
    
    //makes a course by setting course name with parameter
    public Course(String courseName) 
    {
        this.courseName=courseName; 
    } 
    
    //adds student to array by adding student name parameter to current index 
    //of array, then incrementing the index of array through NumberOfStudents
    public void addStudent(String student) 
    {
        students[numberOfStudents]=student; 
        numberOfStudents++;
    } 
    
    //getters and setters(30-45)
    public String[] getStudents() 
    {
        return students; 
    } 
    
    public int getNumberOfStudents() 
    {
        return numberOfStudents; 
    } 
    
    public String getCourseName() 
    {
        return courseName; 
    } 
    
    //overrides clone from object class and the cloneable interface 
    //by cloning the super (whatever calls the method)
    @Override 
    public Object clone() throws CloneNotSupportedException  
    {
        return super.clone(); 
    }
}
