package homework_1;

enum LevelOfEducation{
    bachelor ("Bachelor"),
    master ("Master");

    private String levelOfEducation;
    LevelOfEducation(String LevelOfEducation){
        this.levelOfEducation = LevelOfEducation;
    }
    public String getLevelOfEducation(){
        return levelOfEducation;
    }
}
