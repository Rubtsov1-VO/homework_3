package homework_2;

public class Video extends Files {
    private String fileFormat;
    private String describe;
    private Continuous continuous;
    private SizeOfHighAndWidth sizeOfHighAndWidth;

    public Video(String name, int size, String formatName, String fileFormat, String describe, Continuous continuous, SizeOfHighAndWidth sizeOfHighAndWidth){
        super(name, size, formatName);
        setFileFormat(fileFormat);
        setDescribe(describe);
        setContinuous(continuous);
        setSizeOfHighAndWidth(sizeOfHighAndWidth);

    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if (fileFormat!=null && !fileFormat.isEmpty() && fileFormat.length()<=4){
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

    public SizeOfHighAndWidth getSizeOfHighAndWidth() {
        return sizeOfHighAndWidth;
    }

    public void setSizeOfHighAndWidth(SizeOfHighAndWidth sizeOfHighAndWidth) {
        this.sizeOfHighAndWidth = sizeOfHighAndWidth;
    }
    @Override
    public void print(){
        System.out.print(getName() + "." + getFileFormat());
    }
}

