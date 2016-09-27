package org.springframework.social.spotify.api.impl;

import java.util.List;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyPlaylist;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CursoredSpotifyPlaylist extends CursoredSpotifyList<SpotifyPlaylist> {

    public List<SpotifyPlaylist> getPlaylists() {
        return getItems();
    }

}
