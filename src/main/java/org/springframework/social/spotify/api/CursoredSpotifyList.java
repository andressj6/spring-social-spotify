package org.springframework.social.spotify.api;

import java.util.ArrayList;
import java.util.Collection;

/**
 * List that includes previous and next cursors for paging through items
 * returned from Spotify in cursored pages.
 *
 * @author Rafael Peretta
 * @param <T> the list element type
 */
@SuppressWarnings("serial")
public class CursoredSpotifyList<T> extends ArrayList<T> {

    private String href;

    private int limit;

    private String next;

    private String previous;

    private int offset;

    private int total;

    public CursoredSpotifyList() {
        super();
    }

    public CursoredSpotifyList(Collection<? extends T> collection, String href, Integer limit,
            String next, String previous, Integer offset, Integer total) {
        super(collection);
        this.href = href;
        this.limit = limit;
        this.next = next;
        this.previous = previous;
        this.offset = offset;
        this.total = total;
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
    public int getLimit() {
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
    public int getOffset() {
        return offset;
    }

    /**
     * The total number of items available to return.
     */
    public int getTotal() {
        return total;
    }

}
