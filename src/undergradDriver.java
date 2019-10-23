import javax.swing.*;


public class undergradDriver {
    public static void main(String[] args) {

        int choice=0,i=0,j=0;
        Undergrad[] container = new Undergrad[10];
        String output="";

        while(i<10 && choice<1)
        {
            String name =JOptionPane.showInputDialog("Please enter the name of student" + (i+1) + ": ");
            String ageAsString = JOptionPane.showInputDialog("Please enter the age of student" + (i+1) + ": ");
            int age = Integer.parseInt(ageAsString);
            container[i] = new Undergrad(name,age);

            choice = JOptionPane.showConfirmDialog(null,"Would you like to enter another student: ");
        }


        while(j<10 && container[j]!=null)
        {

           output += container[i].toString() + "\n\n";
        }

        JOptionPane.showMessageDialog(null,output);
        System.out.println(selectOldestUnderGrad(container));





    }//end of main method

    public static String selectOldestUnderGrad(Undergrad[] container)
    {
        int age=0,index=0,i=0;

        while(i<10 && container[i]!=null)
        {
            if(container[i].getAge()>age)
            {
                index = i;
            }
        }
        if(container[i]==null)
        {
            return "No students were entered";
        }
        else {
            return "Details of Oldest Student\n\n" + container[index].toString();
        }


    }
}
