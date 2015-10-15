package org.springframework.social.spotify.api.impl;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.SpotifyPlaylistTrack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CursoredSpotifyPlaylistTrack {
    
    private final CursoredSpotifyList<SpotifyPlaylistTrack> items;

    public CursoredSpotifyPlaylistTrack() {
        this.items = null;
    }
    
    public CursoredSpotifyPlaylistTrack(
            @JsonProperty("items") CursoredSpotifyList<SpotifyPlaylistTrack> items, 
            @JsonProperty("href") String href,
            @JsonProperty("limit") Integer limit, 
            @JsonProperty("next") String next, 
            @JsonProperty("previous") String previous, 
            @JsonProperty("offset") Integer offset, 
            @JsonProperty("total") Integer total) {
        this.items = new CursoredSpotifyList<SpotifyPlaylistTrack>(items, href, limit, next,
                previous, offset, total);
    }

    public CursoredSpotifyList<SpotifyPlaylistTrack> getItems() {
        return items;
    }

}
