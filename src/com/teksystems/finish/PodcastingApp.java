package com.teksystems.finish;

import java.util.LinkedList;
import java.util.List;

// The name breaks down here. Probably AudioApp or StereoApp becomes more appropriate
public class PodcastingApp<T> {
    private String appName;
    private List<T> playlist;

    public PodcastingApp(String appName) {
        this.appName = appName;
        this.playlist = new LinkedList<>();
    }

    public void loadPlaylist(List<T> newPlaylist) {
        playlist.clear();
        playlist.addAll(newPlaylist);
    }

    // changed name to reflect switch to multiple audio types
    public void addToApp(T addedPodcast) {
        playlist.add(addedPodcast);
    }

    // changed name to reflect switch to multiple audio types
    public void removeFromApp(T removedPodcast) {
        playlist.remove(removedPodcast);
    }

    /*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist (of Podcasts)
       Methods :
       - loadPlaylist (replace the existing playlist with a new one, signature void loadPlaylist(List<Podcast newPlaylist)) 
       - addPodcast (add a new podcast to the playlist. order of the playlist should be maintained.)

       Below methods are suggestions if you make it this far
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/
}
