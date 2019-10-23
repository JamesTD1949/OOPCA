public abstract class Student implements Categorizable {
    private String name;
    private int age; //declare two attributes

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }//end of two arg constructor

    //start accessors
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //end accessors


    //start mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //end mutators

    public String toString() {
        return "Student Details" + "\nName: " + getName() + "\nAge: " + getAge();

    }//end toString

     //reference two abstract methods from interface
     public abstract String getCategory();

     public abstract void setCategory(String category) ;
}
