package org.springframework.social.spotify.main;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.PlaylistOperations;
import org.springframework.social.spotify.api.SpotifyPlaylist;
import org.springframework.social.spotify.api.impl.SpotifyTemplate;

public class Main {

    public static void main(String[] args) {
        SpotifyTemplate spotifyTemplate = new SpotifyTemplate("",
                "");
        PlaylistOperations playlistOperations = spotifyTemplate.playlistOperations();
        CursoredSpotifyList<SpotifyPlaylist> userPlaylists = playlistOperations
                .getUserPlaylists("12144452596");

        System.out.println("HREF: " + userPlaylists.getHref());
        System.out.println("Next: " + userPlaylists.getNext());
        System.out.println("Previous: " + userPlaylists.getPrevious());
        System.out.println("Offset: " + userPlaylists.getOffset());
        System.out.println("Limit: " + userPlaylists.getLimit());

        System.out.println("\nList of Playlist");

        for (SpotifyPlaylist spotifyPlaylist : userPlaylists) {
            System.out.println(spotifyPlaylist.getName() + "\nLink: " + spotifyPlaylist.getHref());
        }

    }

}
