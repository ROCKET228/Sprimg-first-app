package ua;


import org.springframework.beans.factory.annotation.Value;


import java.util.ArrayList;
import java.util.Random;

enum MusicGenre {
    CLASSICAL,
    ROCK,
    JAZZ;
}

public class MusicPlayer {

    private ArrayList<Music> musicArrayList;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name;


    public MusicPlayer(ArrayList<Music> musicArrayList) {
        this.musicArrayList = musicArrayList;
    }

    public void playMusic() {
        Random random = new Random();
        int randomGenre = random.nextInt(3);
        int randomSong = random.nextInt(3);
        System.out.println(musicArrayList.get(randomGenre).getSong().get(randomSong));

    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
