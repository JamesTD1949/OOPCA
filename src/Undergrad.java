import javax.swing.*;

public class Undergrad extends Student {
    private String[] subjects = new String[10];
    private String category;
    //declare string array subjects attribute and string category attribute

    public Undergrad(String name,int age){
        super(name,age);
        setCategory("Full-Time");
        setSubjects(subjects);
    }//end of two arg constructor

    public String getSubjects() {
        String listOfSubjects="";
        for(int i=0;i<10;i++)
        {
            if(subjects[i]==null)
            {
                return listOfSubjects;
            }
            else if(subjects[0]==null)
            {
                return "No Subjects Enter.";
            }
            else
            {
                listOfSubjects+=subjects[i]+", ";
            }//end of if - else if - else decision making
        }//end of for loop
        return listOfSubjects;
    }//end of subjects accessor

    public void setSubjects(String[] subjects) {
        int i=0;
        String choice="!!";
        while(i<10 && !choice.equals(""))
        {
            choice = JOptionPane.showInputDialog("What subject would you like to enter: ");
            System.out.println(choice);
            subjects[i] = choice;
            i++;
        }//end of while loop
    }//end of subjects mutator


    public String toString() {
        return super.toString() + "\nSubjects: " + getSubjects() + "\nCategory: " + getCategory();
    }//end of toString

    //interface methods
    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }
}
