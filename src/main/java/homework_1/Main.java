package homework_1;

public class Main {
    public static void main(String[] args) {
        Person teacher1 = new Teacher("Ronald", "Turner", Gender.M, "Computer science", AcademicDegree.doctorOfScience, "Programming paradigms");
        Person teacher2 = new Teacher("Ruth", "Hollings", Gender.F, "Jurisprudence", AcademicDegree.candidateOfScience, "Domestic arbitration");

        Person student1 = new BachelorsAndMasters("Leo", "Wilkinson", Gender.M, "Computer science", Course.III, LevelOfEducation.bachelor);
        Person student2 = new BachelorsAndMasters("Anna", "Cunningham", Gender.F, "World economy", Course.I, LevelOfEducation.bachelor);
        Person student3 = new BachelorsAndMasters("Jill", "Lundqvist", Gender.F, "Jurisprudence", Course.I, LevelOfEducation.master);
        Person student4 = new GraduateStudent("Ronald", "Correa", Gender.M, "Computer science", "Design of a functional programming langiage");

        Person[] persons = new Person[]{teacher1, teacher2, student1, student2, student3, student4};

        Person.printAll(persons);
    }
}

