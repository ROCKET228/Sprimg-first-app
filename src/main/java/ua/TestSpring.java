package ua;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music rockMusic = context.getBean("rockMusic", RockMusic.class);
//        Music classicMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(rockMusic);
//        MusicPlayer musicPlayer2 = new MusicPlayer(classicMusic);
//        musicPlayer1.playSong();
//        musicPlayer2.playSong();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playSong();
        context.close();
    }
}
