package org.springframework.social.spotify.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.spotify.api.Spotify;
import org.springframework.social.spotify.api.impl.SpotifyTemplate;

public class SpotifyServiceProvider extends AbstractOAuth2ServiceProvider<Spotify> {

    public SpotifyServiceProvider(String clientId, String clientSecret) {
        this(clientId, clientSecret, null);
    }

    public SpotifyServiceProvider(String clientId, String clientSecret, String redirectUri) {
        super(new SpotifyOAuth2Template(clientId, clientSecret, redirectUri));
    }

    @Override
    public Spotify getApi(String accessToken) {
        return new SpotifyTemplate(accessToken);
    }


}
