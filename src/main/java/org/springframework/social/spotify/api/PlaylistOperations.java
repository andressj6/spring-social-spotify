/*
 * Copyright 2015 André.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.spotify.api;

import org.springframework.social.MissingAuthorizationException;

/**
 * Interface defining the operations for playlist.
 * 
 * @author André
 */
public interface PlaylistOperations {

    /**
     * Retrieves a list of 20 playlists owned or followed by a Spotify user.
     * 
     * @param userId the id of Spotify user.
     * @return a collection of {@link SpotifyPlaylist} of given Spotify user ID.
     * @throws MissingAuthorizationException if SpotifyTemplate was not created with OAuth credentials.
     */
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId);

    /**
     * Retrieves the playlists owned or followed by a Spotify user. 
     * @param userId the id of Spotify user.
     * @param pageSize the maximum number of {@link SpotifyPlaylist} to return.
     * @throws MissingAuthorizationException if SpotifyTemplate was not created with OAuth credentials.
     */
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId, int pageSize);

    /**
     * Retrieves the playlists owned or followed by a Spotify user. 
     * @param userId the id of Spotify user.
     * @param pageSize the maximum number of {@link SpotifyPlaylist} to return.
     * @param offset the index of the first {@link SpotifyPlaylist} to return.
     * @throws MissingAuthorizationException if SpotifyTemplate was not created with OAuth credentials.
     */
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId, int limit,
            int offset);

    /**
     * Get a playlist owned by Spotify user.
     * @param userId The user's Spotify user ID.
     * @param playlistId the Spotify ID for the playlist.
     * @throws MissingAuthorizationException if SpotifyTemplate was not created with OAuth credentials.
     */
    public SpotifyPlaylistFull getPlaylist(String userId, String playlistId);

    /**
     * Get a playlist owned by Spotify user.
     * @param userId The user's Spotify user ID.
     * @param playlistId the Spotify ID for the playlist.
     * @param market An ISO 3166-1 alpha-2 country code. Provide this parameter if you want to apply Track Relinking.
     * @throws MissingAuthorizationException if SpotifyTemplate was not created with OAuth credentials.
     */
    public SpotifyPlaylistFull getPlaylist(String userId, String playlistId, String market);

}
