/*
 * Copyright 2015 Rafael Peretta.
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
package org.springframework.social.spotify.api.impl;

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.PlaylistOperations;
import org.springframework.social.spotify.api.SpotifyPlaylist;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Rafael Peretta
 *
 */
public class PlaylistTemplate extends AbstractSpotifyOperations implements PlaylistOperations {

    private static int DEFAULT_MAX_NUMBER_OF_PLAYLIST = 20;

    private static int DEFAULT_INDEX_OF_FIRST_PLAYLIST = 0;

    private final RestTemplate restTemplate;

    public PlaylistTemplate(RestTemplate restTemplate, boolean isUserAuthorized, boolean isAppAuthorized) {
        super(isUserAuthorized, isAppAuthorized);
        this.restTemplate = restTemplate;
    }

    @Override
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId) {
        return getUserPlaylists(userId, DEFAULT_MAX_NUMBER_OF_PLAYLIST, DEFAULT_INDEX_OF_FIRST_PLAYLIST);
    }

    @Override
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId, int pageSize) {
        return getUserPlaylists(userId, pageSize, DEFAULT_INDEX_OF_FIRST_PLAYLIST);
    }

    @Override
    public CursoredSpotifyList<SpotifyPlaylist> getUserPlaylists(String userId, int limit,
            int offset) {
        requireUserAuthorization();
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.set("limit", String.valueOf(limit));
        parameters.set("offset", String.valueOf(offset));

        return restTemplate.getForObject(buildUri("users/" + userId + "/playlists", parameters),
                CursoredSpotifyPlaylist.class).getPlaylists();
    }

}
