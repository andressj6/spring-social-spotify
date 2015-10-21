package org.springframework.social.spotify.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.SpotifyPlaylist;
import org.springframework.social.spotify.api.SpotifyPlaylistFull;
import org.springframework.social.spotify.api.SpotifyPlaylistTrack;

/**
 * 
 * @author Rafael Peretta
 *
 */
public class PlaylistTemplateTest extends AbstractSpotifyApiTest {

    
    private static final String DEFAULT_USER_PLAYLISTS_URL = "https://api.spotify.com/v1/users/wizzler/playlists?limit=20&offset=0";

    private static String[] playlistsNames = { "My Shazam Tracks", "Today's Top Hits", "Video Game Masterpieces", "Retro Made Modern",
            "Movie Soundtrack Masterpieces", "Blue Mountain State", "Barney's Get Psyched Mix", "Death Valley 2013" };

    @Test
    public void getUserPlaylistsTest() {
        mockServer.expect(requestTo(DEFAULT_USER_PLAYLISTS_URL))
            .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("user-playlists"), APPLICATION_JSON));

        CursoredSpotifyList<SpotifyPlaylist> playlists = spotify.playlistOperations().getUserPlaylists("wizzler");

        assertUserPlaylistsDefault(playlists, 8, playlistsNames);
    }

    @Test
    public void getUserPlaylistsWithLimitTest() {
        String requestUrl = "https://api.spotify.com/v1/users/wizzler/playlists?limit=2&offset=0";

        mockServer.expect(requestTo(requestUrl)).andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("user-playlists-limit"), APPLICATION_JSON));

        CursoredSpotifyList<SpotifyPlaylist> playlists = spotify.playlistOperations().getUserPlaylists("wizzler", 2);

        assertUserPlaylistsWithLimit(playlists, 2, 2, requestUrl, playlistsNames);
    }

    @Test
    public void getUserPlaylistsWithLimitAndOffsetTest() {
        String requestUrl = "https://api.spotify.com/v1/users/wizzler/playlists?limit=3&offset=2";

        mockServer.expect(requestTo(requestUrl)).andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("user-playlists-limit-offset"), APPLICATION_JSON));

        CursoredSpotifyList<SpotifyPlaylist> playlists = spotify.playlistOperations().getUserPlaylists("wizzler", 3, 2);

        String[] playlistsNames = { "Video Game Masterpieces", "Retro Made Modern", "Movie Soundtrack Masterpieces" };

        assertUserPlaylists(playlists, 3, 3, 2, requestUrl, playlistsNames);
    }

    @Test
    public void getPlaylistTest() {
        String playlistId = "3FJd21jWvCjGCLx7eKrext";
        String ownerId = "wizzler";
        String requestUrl = "https://api.spotify.com/v1/users/" + ownerId + "/playlists/" + playlistId;
        mockServer.expect(requestTo(requestUrl)).andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("user-playlist"), APPLICATION_JSON));

        SpotifyPlaylistFull playlist = spotify.playlistOperations().getPlaylist(ownerId, playlistId);

        assertEquals(requestUrl, playlist.getHref());
        assertEquals(playlistId, playlist.getId());
        assertEquals(ownerId, playlist.getOwner().getId());
        assertEquals("The best songs featured in video games.", playlist.getDescription());
        assertEquals("Video Game Masterpieces", playlist.getName());
        assertEquals(33, playlist.getPlaylistTrack().getItems().size());
        assertFalse(playlist.getCollaborative());

        CursoredSpotifyList<SpotifyPlaylistTrack> items = playlist.getPlaylistTrack().getItems();
        for (SpotifyPlaylistTrack spotifyPlaylistTrack : items) {
            assertEquals(spotifyPlaylistTrack.getAddedBy().getId(), ownerId);
        }

    }

    /**
     * This method is responsible to check the playlists data.
     * 
     * @param playlists The list of {@link SpotifyPlaylist} to check.
     * @param expectedSize the expected playlists size.
     * @param expectedLimit the expected limit of pagination.
     * @param expectedOffset the expected index of the first playlist to return.
     * @param expectedUrl the expected url of the request
     * @param expectedPlaylistsNames the expected playlists names.
     */
    private void assertUserPlaylists(CursoredSpotifyList<SpotifyPlaylist> playlists, int expectedSize, int expectedLimit,
            int expectedOffset, String expectedUrl,
            String[] expectedPlaylistsNames) {

        assertEquals(expectedSize, playlists.size());
        assertEquals(expectedLimit, playlists.getLimit());
        assertEquals(expectedOffset, playlists.getOffset());
        assertEquals(expectedUrl, playlists.getHref());

        int index = 0;

        for (SpotifyPlaylist playlist : playlists) {
            assertEquals(expectedPlaylistsNames[index++], playlist.getName());
        }
    }

    private void assertUserPlaylistsDefault(CursoredSpotifyList<SpotifyPlaylist> playlists, int expectedSize,
            String[] expectedPlaylistsNames) {
        assertUserPlaylists(playlists, expectedSize, 20, 0, DEFAULT_USER_PLAYLISTS_URL, expectedPlaylistsNames);
        
    }

    private void assertUserPlaylistsWithLimit(CursoredSpotifyList<SpotifyPlaylist> playlists, int expectedSize, int expectedLimit,
            String expectedUrl, String[] expectedPlaylistsNames) {
        assertUserPlaylists(playlists, expectedSize, expectedLimit, 0, expectedUrl, expectedPlaylistsNames);

    }

}
