package org.springframework.social.spotify.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List that includes previous and next cursors for paging through items
 * returned from Spotify in cursored pages.
 *
 * @param <T> the list element type
 * @author Rafael Peretta
 */
@SuppressWarnings("serial")
public class CursoredSpotifyList<T> {

    private String href;

    private Integer limit;

    private String next;

    private String previous;

    private Integer offset;

    private Integer total;

    private List<T> items;

    public CursoredSpotifyList() {
        super();
    }

    /**
     * Returns the link to the Web API endpoint returning the full result of the
     * request.
     */
    public String getHref() {
        return href;
    }

    /**
     * The maximum number of items in the response.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * URL to the next page of items.
     */
    public String getNext() {
        return next;
    }

    /**
     * The offset of the items returned (as set in the query or by default).
     */
    public String getPrevious() {
        return previous;
    }

    /**
     * The offset of the items returned (as set in the query or by default).
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * The total number of items available to return.
     */
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("items")
    protected List<T> getItems() {
        return items;
    }

    public boolean hasNext() {
        return getNext() != null;
    }
}
