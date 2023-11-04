package homework_2;

public class Files {
    private String name;
    private int size;

    private String formatName;


    public Files(String name, int size, String formatName){
        setName(name);
        setSize(size);
        setFormatName(formatName);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && !name.isEmpty() && name.length()<=16){
            this.name = name;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size>0){
            this.size = size;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getFormatName() {
        return formatName;
    }


    public void setFormatName(String formatName) {
        if (formatName != null && !formatName.isEmpty()) {
            this.formatName = formatName;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void print(){

    }
    public String spaceName(String name, String formatName){
        int x = name.length() + formatName.length();
        x = 20-x;
        if (x < 0)
            x=0;
        while (x!=0){
            x--;
            System.out.print(" ");
        }
        return "";
    }
    public String spaceSize(int size){
        int x = Integer.toString(size).length();
        x = 10 - x;
        while (x!=0){
            x--;
            System.out.print(" ");
        }
        return "";
    }
    public static void printAll(Files[] array){
        for (Files files : array){
            files.print();
        }
    }
}
