package homework_2;

public class Main {
    public static void main(String[] args){
        Files document1 = new Documents("j110-lab2-hiers",23212,"docx","docx",2);
        Files document2 = new StaticImages("spb-map",1703527,"image","png",new SizeOfHighAndWidth( 1024,3072));
        Files document3 = new Multi("06-PrettyGirl",7893454,"audio","mp3","Eric Clapton, Pretty Girl",new Continuous(5,28));
        Files document4 = new Video("BackToTheFuture1",1470984192,"video","avi","Back to the future I, 1985", new Continuous(1,48,8), new SizeOfHighAndWidth(640,352));

        Files[] files = new Files[]{document1,document2,document3,document4};

        Files.printAll(files);

        Multi audio1 = new Multi("1.«Mutter»",6892354,"audio","mp3","Rammstien, Mutter",new Continuous(4,29));
        Multi audio2 = new Multi("2.«Links 2-3-4»",6833454,"audio","mp3","Rammstien, Links 2-3-4",new Continuous(3,36));
        Multi audio3 = new Multi("3.«Sonne»",8893454,"audio","mp3","Rammstien, Sonne",new Continuous(4,32));
        Multi audio4 = new Multi("4.«Ich will»",7432554,"audio","mp3","Rammstien, Ich will",new Continuous(3,37));
        Multi audio5 = new Multi("5.«Feuer frei!»",5993454,"audio","mp3","Rammstien, Mutter",new Continuous(3,8));

        Multi[] audioMutter = new Multi[]{audio1, audio2, audio3, audio4, audio5};

        Files.printAll(audioMutter);
        System.out.println("Дочерний тип имеет возможность обращаться к методу родительского типа т.к. является видом этого типа");
    }
}


