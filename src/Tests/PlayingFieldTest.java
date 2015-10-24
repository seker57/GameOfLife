package Tests;

import GameUtilities.PlayingField;
import junit.framework.TestCase;
import org.junit.Test;

public class PlayingFieldTest extends TestCase {

    @Test
    public void testeSizeOfPlayingField(){

        PlayingField playingField = new PlayingField(9, 9);
        assert((playingField.getWidth() * playingField.getLength()) == 81);

    }

}