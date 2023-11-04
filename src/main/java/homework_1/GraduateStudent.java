package homework_1;

class GraduateStudent extends Person{
    private String dissertationTopic;

    public GraduateStudent(String name, String surname, Gender gender, String faculty, String dissertationTopic) {
        super(name, surname, gender, faculty);
        setDissertationTopic(dissertationTopic);
    }

    @Override
    public  void  print(){
        System.out.println("This is " + getName() + " " + getSurname() + ". " + getGender() + " " + " studies " + getFaculty() + ". " + getGender() + " these title is " + getDissertationTopic()+ ".");

    }
    public String getDissertationTopic(){
        return dissertationTopic;
    }
    public void setDissertationTopic(String dissertationTopic){
        this.dissertationTopic = dissertationTopic;
    }
}
