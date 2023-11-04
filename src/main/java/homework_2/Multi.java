package homework_2;

import java.text.Format;

public class Multi extends Files{
    private String fileFormat;
    private String describe;
    private Continuous continuous;

    public String getFormat() {
        return fileFormat;
    }

    public Multi(String name, int size, String formatName, String fileFormat, String describe,Continuous continuous){
        super(name,size, formatName);
        setFormat(fileFormat);
        setDescribe(describe);
        setContinuous(continuous);
    }

    public void setFormat(String fileFormat) {
        if (fileFormat !=null && !fileFormat.isEmpty() && fileFormat.length()<=4){
            this.fileFormat = fileFormat;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Continuous getContinuous() {
        return continuous;
    }

    public void setContinuous(Continuous continuous) {
        this.continuous = continuous;
    }

    @Override
    public void print(){
        System.out.print(getName() + "." + getFormat());
        System.out.print(spaceName(getName(),getFormatName()) + "|");
        System.out.println(spaceSize(getSize()) + getSize() + "|" + getFormatName() + ", " + getDescribe() + ", " + continuous.getMinutes() + ":" + continuous.getSeconds());
    }
}
