package ua;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();


    {
        songs.add("Classic songs 1");
        songs.add("Classic songs 1");
        songs.add("Classic songs 1");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
