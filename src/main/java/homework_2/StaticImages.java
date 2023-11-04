package homework_2;

public class StaticImages extends Files{
    private String fileFormat;
    private SizeOfHighAndWidth sizeOfHighAndWidth;

    public StaticImages(String name, int size, String formatName, String fileFormat, SizeOfHighAndWidth sizeOfHighAndWidth){
        super(name, size, formatName);
        setFileFormat(fileFormat);
        setSizeOfHighAndWidth(sizeOfHighAndWidth);
    }


    public SizeOfHighAndWidth getSizeOfHighAndWidth() {
        return sizeOfHighAndWidth;
    }
    public void setSizeOfHighAndWidth(SizeOfHighAndWidth sizeOfHighAndWidth) {
        this.sizeOfHighAndWidth = sizeOfHighAndWidth;
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
    public void print(){
        System.out.print(getName() + "." + getFileFormat());
        System.out.print(spaceName(getName(),getFileFormat())+"|");
        System.out.println(spaceSize(getSize()) + getSize() + "|"+getFormatName() + ", " + sizeOfHighAndWidth.getHeight() + "x" + sizeOfHighAndWidth.getWidth());
    }
}
