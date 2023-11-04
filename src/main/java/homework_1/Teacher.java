package homework_1;

class Teacher extends Person{
    private String specialization;
    private AcademicDegree academicDegree;
    public Teacher (String name, String surname, Gender gender, String faculty, AcademicDegree academicDegree, String specialization){
        super(name, surname, gender, faculty);
        setAcademicDegree(academicDegree);
        setSpecialization(specialization);
    }
    public  AcademicDegree getAcademicDegree(){
        return academicDegree;
    }
    public void setAcademicDegree(AcademicDegree academicDegree){
        this.academicDegree = academicDegree;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    @Override
    public void print(){
        System.out.println("This is " + getName() + " " + getSurname() + ". " + getGender() + " " + " teacher " + getFaculty() + ". " + getGender() + " has " + getAcademicDegree() + " degree in " + getSpecialization() + "." );
    }
}