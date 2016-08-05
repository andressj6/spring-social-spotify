package org.springframework.social.spotify.api.impl;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.web.client.MockRestServiceServer;

public class AbstractSpotifyApiTest {

    protected SpotifyTemplate spotify;

    protected MockRestServiceServer mockServer;

    @Before
    public void setup() {
        spotify = new SpotifyTemplate("API_SECRET");
        mockServer = MockRestServiceServer.createServer(spotify.getRestTemplate());
    }

    protected Resource jsonResource(String filename) {
        return new ClassPathResource(filename + ".json", getClass());
    }

}
