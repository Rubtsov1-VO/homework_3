package homework_1;

public class Person{
    private String name;
    private String surname;
    private String faculty;
    private Gender gender;

    public Person(String name, String surname, Gender gender, String faculty){
        setName(name);
        setSurname(surname);
        setGender(gender);
        setFaculty(faculty);
    }
    public String getName(){
        return  name;
    }
    public String getSurname(){
        return surname;
    }
    public  String getFaculty(){
        return faculty;
    }
    public String getGender(){
        return gender.getGender();
    }
    public String getGender2(){
        return gender.getGender1();
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void print(){

    }
    public static void printAll(Person[] string) {
        for (Person person : string) {
            person.print();
        }
    }
}