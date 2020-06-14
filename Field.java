import java.util.Random;

public class Field {

    // Масив от String с игровите полета
     String[] array = new String[]{"S", "T", "T", "T", "T", "T", "T", "T", "P", "P", "P", "C", "C" , "C","I", "I", "I", "St", "St", "St"};

    public void shufflePositions(){
        Random rand = new Random();
        for (int i = 1; i < array.length; i++){
            int n = rand.nextInt(array.length - 1) + 1;
            String s = array[n];
            array[n] = array[i];
            array[i] = s;
        }
    }
    public void printField(){
        for(int i=10;i<=17;i++) System.out.print("|"+array[i]+" ".repeat(2-array[i].length())+ "|");
        System.out.println();

        System.out.println("|"+array[9]+" ".repeat(2-array[9].length())+"|" +  " ".repeat(24) +"|"+ array[18]+" ".repeat(2-array[18].length())+"|");
        System.out.println("|"+array[8]+" ".repeat(2-array[8].length())+"|" + " ".repeat(24) +"|"+ array[19]+" ".repeat(2-array[19].length())+"|");

        for(int i=7;i>=0;i--) System.out.print("|"+array[i]+" ".repeat(2-array[i].length())+"|");
        System.out.println();

    }
}
