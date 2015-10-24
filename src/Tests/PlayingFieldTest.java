package Tests;

import GameUtilities.PlayingField;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Timo on 24.10.2015.
 */
public class PlayingFieldTest {

    @Test
    public void testPlayingFieldSize(){

        PlayingField spielfeld = new PlayingField(9, 9);
        assert(spielfeld.getLength() * spielfeld.getWidth() == 81);
    }

}