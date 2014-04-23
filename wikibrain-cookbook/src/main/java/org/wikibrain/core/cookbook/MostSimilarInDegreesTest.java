package org.wikibrain.core.cookbook;

import org.wikibrain.conf.ConfigurationException;
import org.wikibrain.core.dao.DaoException;

import java.io.IOException;

/**
 * @author aaron jiang
 */
public class MostSimilarInDegreesTest {
    public static void main (String args[]) throws ConfigurationException, DaoException, IOException {

        MostSimilarInDegrees sim = new MostSimilarInDegrees("simple");

        String testTitle = "Big Ten Conference";
        int degrees = 3;
        System.out.println("\nThe article most related to \"" + testTitle + "\" in " + degrees + " degrees is: " + sim.getMostSimilar(testTitle, degrees));
        //Can use getMostSimilar(srcId, degrees) as well

    }
}
