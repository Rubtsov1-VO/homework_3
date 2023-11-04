package homework_1;

enum AcademicDegree{
    candidateOfScience ("MSc"),
    doctorOfScience ("PhD");
    private String academicDegree;
    AcademicDegree(String academicDegree){
        this.academicDegree = academicDegree;
    }
    public  String getAcademicDegree(){
        return academicDegree;
    }
}