public class Main {
    public static void main(String[] args){
        Field f = new Field();
        f.printField();
        f.shufflePositions();
        System.out.println("-".repeat(40));
        f.printField();
    }
}
