package homework_2;

public class SizeOfHighAndWidth {
    private int height;
    private int width;

    public SizeOfHighAndWidth(int height, int width){
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>0){
            this.height = height;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>0){
            this.width = width;
        }else {
            throw new IllegalArgumentException();
        }
    }
}
