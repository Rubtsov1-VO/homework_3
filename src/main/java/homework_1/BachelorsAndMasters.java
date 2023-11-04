package homework_1;

class BachelorsAndMasters extends Student{
    private Course course;
    private LevelOfEducation levelOfEducation;
    public BachelorsAndMasters(String name, String surname, Gender gender, String faculty, Course course,LevelOfEducation levelOfEducation){
        super(name, surname, gender, faculty);
        setCourse(course);
        setLevelOfEducation(levelOfEducation);
    }
    public void setCourse(Course course){
        this.course = course;

    }
    public  LevelOfEducation getLevelOfEducation(){
        return levelOfEducation;
    }
    public void setLevelOfEducation(LevelOfEducation levelOfEducation){
        this.levelOfEducation = levelOfEducation;
    }
    @Override
    public void print(){
        System.out.println("This is " + getName() + " " + getSurname() + ". " + getGender() + " " + " studies " + getFaculty() + ". " + getGender2() + " is " + getLevelOfEducation() + "th year" + levelOfEducation.getLevelOfEducation() + " student.");
    }

}
