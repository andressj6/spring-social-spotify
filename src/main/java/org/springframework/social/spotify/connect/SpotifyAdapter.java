package org.springframework.social.spotify.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.spotify.api.Spotify;

public class SpotifyAdapter implements ApiAdapter<Spotify> {

    @Override
    public boolean test(Spotify api) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setConnectionValues(Spotify api, ConnectionValues values) {
        // TODO Auto-generated method stub

    }

    @Override
    public UserProfile fetchUserProfile(Spotify api) {
        return new UserProfileBuilder().setName("").build();
    }

    @Override
    public void updateStatus(Spotify api, String message) {
        // TODO Auto-generated method stub

    }

}
