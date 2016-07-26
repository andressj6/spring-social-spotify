package org.springframework.social.spotify.connect;

import org.springframework.social.spotify.api.*;
import org.springframework.social.spotify.api.impl.SpotifyTemplate;

public class TestSpotify {

    public static void main(String[] args) {
        Spotify spotifyTemplate = new SpotifyTemplate("151552f807b148f991b352c15eed4f59", "e0b45475042d43c4b1671641f6e26862");
        
        PlaylistOperations playlistOperations = spotifyTemplate.playlistOperations();
        CursoredSpotifyList<SpotifyPlaylist> userPlaylists = playlistOperations.getUserPlaylists("wizzler");

        // CursoredSpotifyList<SpotifyPlaylist> userPlaylists =
        // playlistOperations.getPlaylist();
        
        System.out.println("HREF: " + userPlaylists.getHref());
        System.out.println("Next: " + userPlaylists.getNext());
        System.out.println("Previous: " + userPlaylists.getPrevious());
        System.out.println("Offset: " + userPlaylists.getOffset());
        System.out.println("Limit: " + userPlaylists.getLimit());
        System.out.println("Total: " + userPlaylists.getTotal());

        System.out.println("\nList of Playlist");

        
          for (SpotifyPlaylist spotifyPlaylist : userPlaylists) {
            System.out.println(spotifyPlaylist.getName());
        }

        SpotifyPlaylistFull playlist = playlistOperations.getPlaylist("12144452596", "72qsWE0zaWYrfaXmqiKsOR");
        System.out.println(playlist.getName());
        System.out.println("Musics");

        CursoredSpotifyList<SpotifyPlaylistTrack> items = playlist.getPlaylistTrack().getItems();
        for (SpotifyPlaylistTrack spotifyPlaylistTrack : items) {
            System.out.println(spotifyPlaylistTrack.getTrack().getName());
        }

    }

}
