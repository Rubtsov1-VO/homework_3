package homework_1;

enum Gender{
    M ("He", "His"),
    F ("She", "Her");

    private String gender;
    private String gender1;
    Gender(String gender, String gender1){
        this.gender = gender;
        this.gender1 = gender1;
    }
    public String getGender(){
        return gender;
    }
    public String getGender1(){
        return gender1;
    }
}
