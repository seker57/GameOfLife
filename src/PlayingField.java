/**
 * Created by Timo on 24.10.2015.
 */
public class PlayingField {

    private static int length, width;
    private static char[] fieldcells;

    public PlayingField(int length, int width){
        this.length = length;
        this.width = width;

        fieldcells = new char[(length*width) - 1];
    }

    public void printFieldStatus(){

    }

    public char[] getFieldCells(){
        return this.fieldcells;
    }

    public void setFieldCells(char[] fieldcells){
        this.fieldcells = fieldcells;
    }
}
