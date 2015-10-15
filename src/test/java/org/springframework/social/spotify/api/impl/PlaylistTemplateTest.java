package org.springframework.social.spotify.api.impl;

import static org.junit.Assert.assertEquals;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.Test;
import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.SpotifyPlaylist;

public class PlaylistTemplateTest extends AbstractSpotifyApiTest {

    
    @Test
    public void getUserPlaylists() {
        mockServer.expect(requestTo("https://api.spotify.com/v1/users/1212121/playlists?limit=20&offset=0"))
            .andExpect(method(GET))
                .andRespond(withSuccess(jsonResource("user-playlists"), APPLICATION_JSON));

        CursoredSpotifyList<SpotifyPlaylist> playlist = spotify.playlistOperations().getUserPlaylists("1212121");

        assertUserPlaylists(playlist);

    }

    private void assertUserPlaylists(CursoredSpotifyList<SpotifyPlaylist> playlist) {
        assertEquals(7, playlist.size());
        assertEquals(20, playlist.getLimit());
        assertEquals(0, playlist.getOffset());
    }

}
