package ua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();


    {
        songs.add("Rock songs 1");
        songs.add("Rock songs 1");
        songs.add("Rock songs 1");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
