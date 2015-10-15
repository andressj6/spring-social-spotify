package org.springframework.social.spotify.api.impl;

import org.springframework.social.spotify.api.ProfileOperations;
import org.springframework.social.spotify.api.SpotifyUser;
import org.springframework.web.client.RestTemplate;

public class ProfileTemplate extends AbstractSpotifyOperations implements ProfileOperations {

    private final RestTemplate restTemplate;

    public ProfileTemplate(RestTemplate restTemplate, boolean isUserAuthorized, boolean isAppAuthorized) {
        super(isUserAuthorized, isAppAuthorized);
        this.restTemplate = restTemplate;
    }

    public SpotifyUser getProfile() {
        requireAppAuthorization();
        return restTemplate.getForObject(buildUri("me"), SpotifyUser.class);
    }

}
