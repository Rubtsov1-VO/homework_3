package homework_2;

public class Documents extends Files {
    private String fileFormat;
    private int pages;


    public Documents(String name, int size, String formatName, String fileFormat, int pages){
        super(name, size, formatName);
        setFileFormat(fileFormat);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages>=0){
            this.pages = pages;
        }else {
            throw new IllegalArgumentException();
        }
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

    @Override
    public void print(){
        System.out.print(getName() + "." + getFileFormat());
        System.out.print(spaceName(getName(),getFileFormat())+ "|");
        System.out.println(spaceSize(getSize())+getSize()+"|"+getFormatName()+", "+getPages()+" pages");
    }
}
