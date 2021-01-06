import java.util.HashMap;
import java.util.Set;
public class SongLyrics{
    public void SongLyricMap(){
        HashMap<String,String> lyrics = new HashMap<String,String>();
        lyrics.put("song_1", "asdjhkfaskjhdfas");
        lyrics.put("song_2", "bskcnvwvbvosjvns");
        lyrics.put("song_3", "jnk bgvvdflhljhhk");
        lyrics.put("song_4", "lknivytcfvbhnjngyct");
        System.out.println(lyrics.get("song_2"));
        Set<String> keys = lyrics.keySet();
        for(String key : keys){
            System.out.println("Track: "+key+" Lyrics: "+lyrics.get(key));
        }
    }
}