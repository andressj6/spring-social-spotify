package org.springframework.social.spotify.api;

import java.util.List;

import org.springframework.social.spotify.api.impl.SpotifyTemplate;
import org.springframework.social.spotify.entities.SpotifyObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * List that includes previous and next cursors for paging through items
 * returned from Spotify in cursored pages.
 *
 * @param <T> the list element type
 * @author Rafael Peretta
 */
@SuppressWarnings("serial")
@Data
public abstract class CursoredSpotifyList<T extends SpotifyObject> {

    private String href;

    private Integer limit;

    private String next;

    private String previous;

    private Integer offset;

    private Integer total;
    @JsonProperty("items")
    private List<T> items;

    public CursoredSpotifyList() {
        super();
    }

    public abstract <S extends SpotifyObject> List<S> getItems();

    public boolean hasNext() {
        return getNext() != null;
    }

    protected List<T> getItemList() {
        return this.items;
    }

    public abstract CursoredSpotifyList<T> getNextBatch(SpotifyTemplate spotifyTemplate);
}
