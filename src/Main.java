public class Main {
    public static void main (String [] args) {
        Father father = new Father("Иван");
        Son son = new Son("Пётр");
        son.zit();
        son.sluashat();
        System.out.println();
        father.zit();
        father.vospit();
    }
}
