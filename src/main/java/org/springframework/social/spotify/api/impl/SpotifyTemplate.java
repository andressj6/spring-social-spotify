package org.springframework.social.spotify.api.impl;


import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.spotify.api.*;


/**
 * This is the central class for interacting with Twitter.
 * <p>
 * Most (not all) Spotify operations require OAuth authentication. To perform
 * such operations, {@link SpotifyTemplate} must be constructed with the minimal
 * amount of information required to sign requests to Spotify's API with an
 * OAuth <code>Authorization</code> header.
 * </p>
 * 
 * @author Rafael Peretta
 */
public class SpotifyTemplate extends AbstractOAuth2ApiBinding implements Spotify {

    private static final String REQUEST_TOKEN_URL = "https://accounts.spotify.com/api/token";

    private PlaylistOperations playlistOperations;

    /**
     * Create an instance of SpotifyTemplate.
     *
     * @param clientToken
     */
    public SpotifyTemplate(String clientToken) {
        super(clientToken);
        this.initSubApis();
    }

    /**
     * Create an instance of SpotifyTemplate.
     * 
     * @param consumerKey of Spotify's API.
     * @param consumerSecret of Spotify's API
     */
    public SpotifyTemplate(String consumerKey, String consumerSecret) {
        this(exchangeCredentialsForClientToken(consumerKey, consumerSecret));
    }

    private void initSubApis() {
        this.playlistOperations = new PlaylistTemplate(getRestTemplate(), isAuthorized(), isAuthorizedForApp());
    }

    private boolean isAuthorizedForApp() {
        return this.getRestTemplate() != null;
    }

    private static String exchangeCredentialsForClientToken(String consumerKey, String consumerSecret) {
        OAuth2Template oauth2 = new OAuth2Template(consumerKey, consumerSecret, "",
                REQUEST_TOKEN_URL);
        return oauth2.authenticateClient().getAccessToken();
    }

    @Override
    public AlbumOperations albumOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArtistOperations artistOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BrowseOperations browseOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public FollowOperations followOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LibraryOperations libraryOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PlaylistOperations playlistOperations() {
        return this.playlistOperations;
    }

    @Override
    public SearchOperations searchOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProfileOperations profileOperations() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TrackOperations trackOperations() {
        // TODO Auto-generated method stub
        return null;
    }

}
