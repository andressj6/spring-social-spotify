package org.springframework.social.spotify.api.impl;

import java.util.List;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyPlaylist;

import lombok.NoArgsConstructor;

public class CursoredSpotifyPlaylist extends CursoredSpotifyList<SpotifyPlaylist> {

    @Override
    public List<SpotifyPlaylist> getItems() {
        return this.getItemList();
    }

    @Override
    public CursoredSpotifyPlaylist getNextBatch(SpotifyTemplate spotifyTemplate) {
        return spotifyTemplate.getRestTemplate().getForObject(getNext(), CursoredSpotifyPlaylist.class);
    }
}
