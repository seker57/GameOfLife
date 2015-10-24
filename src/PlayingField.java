/**
 * Created by Timo on 24.10.2015.
 */
public class PlayingField {

    private static int length;

    private static int width;
    private static char[] fieldcells;

    public PlayingField(int length, int width){
        this.length = length;
        this.width = width;

        fieldcells = new char[(length*width)];
    }

    public void printFieldStatus(){

        for (int i = 0; i < width; i++) {
            for (int y = 0; y < length; y++) {
                System.out.print("[" + fieldcells[i * y] + "]");
            }
            System.out.println();
        }

        System.out.println("***********");
    }

    public void initializeField(){
        for(int i =0 ; i<5 ; i++){
            int zzahl = (int)(Math.random()*(length*width));
           // System.out.println(zzahl);
            fieldcells[zzahl]='X';

        }
    }

    public char[] getFieldCells(){
        return this.fieldcells;
    }

    public void setFieldCells(char[] fieldcells){
        this.fieldcells = fieldcells;
    }
    public static int getLength() {
        return length;
    }

    public static int getWidth() {
        return width;
    }

    public static void setLength(int length) {
        PlayingField.length = length;
    }

    public static void setWidth(int width) {
        PlayingField.width = width;
    }
}
