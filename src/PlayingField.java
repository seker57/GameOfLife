/**
 * Created by Timo on 24.10.2015.
 */
public class PlayingField {

    private static int length, width;
    private static char[] fieldcells;

    public PlayingField(int length, int width){
        this.length = length;
        this.width = width;

        fieldcells = new char[(length*width)];
    }

    public void printFieldStatus(){

        for (int i = 0; i < length; i++) {
            for (int y = 0; y < width; y++) {
                System.out.print("[" + fieldcells[i * y] + "]");
            }
            System.out.println();
        }

        System.out.println("***********");
    }

    public char[] getFieldCells(){
        return this.fieldcells;
    }

    public void setFieldCells(char[] fieldcells){
        this.fieldcells = fieldcells;
    }
}
