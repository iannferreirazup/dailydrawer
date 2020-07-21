package dev.iann.dailydrawer.services;

import java.util.List;
import java.util.Random;
import dev.iann.dailydrawer.constants.Names;

public class DrawName {
    public String execute() {
        Random rand = new Random();

        int namesLength = Names.allNames().size();

        int numberDrawn = rand.nextInt(namesLength);

        String nameDrawn = Names.allNames().get(numberDrawn);

        return nameDrawn;
    }
}
