package ua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    
    private Music music;
    //private List<Music> musicList = new ArrayList<>();
//    private String name;
//    private int volume;


//    public MusicPlayer() {
//    }
//
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Playing: " + music.getSong());
//        }
//    }

    public void playSong() {
        System.out.println("Playing: " + music.getSong());
    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    //    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
}
