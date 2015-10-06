package org.springframework.social.spotify.api.impl;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.SpotifyPlaylist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CursoredSpotifyPlaylist {

    private final CursoredSpotifyList<SpotifyPlaylist> items;

    public CursoredSpotifyPlaylist() {
        this.items = null;
    }

    public CursoredSpotifyPlaylist(
            @JsonProperty("items") CursoredSpotifyList<SpotifyPlaylist> items, 
            @JsonProperty("href") String href,
            @JsonProperty("limit") Integer limit, 
            @JsonProperty("next") String next, 
            @JsonProperty("previous") String previous, 
            @JsonProperty("offset") Integer offset, 
            @JsonProperty("total") Integer total) {
        this.items = new CursoredSpotifyList<SpotifyPlaylist>(items, href, limit, next,
                previous, offset, total);
    }

    public CursoredSpotifyList<SpotifyPlaylist> getPlaylists() {
        return items;
    }

}
