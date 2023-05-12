package ua;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    List<String> songs = new ArrayList<>();


    {
        songs.add("Jazz songs 1");
        songs.add("Jazz songs 1");
        songs.add("Jazz songs 1");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
