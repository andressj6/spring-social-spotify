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

import java.util.List;
import org.springframework.social.spotify.api.AlbumOperations;
import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyAlbum;
import org.springframework.social.spotify.entities.SpotifyTrack;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Rafael Peretta
 *
 */
public class AlbumTemplate extends AbstractSpotifyOperations implements AlbumOperations {

    private static int DEFAULT_MAX_NUMBER_OF_PLAYLIST = 20;

    private static int DEFAULT_INDEX_OF_FIRST_PLAYLIST = 0;

    private final RestTemplate restTemplate;

    public AlbumTemplate(RestTemplate restTemplate, boolean isUserAuthorized, boolean isAppAuthorized) {
        super(isUserAuthorized, isAppAuthorized);
        this.restTemplate = restTemplate;
    }

    @Override
    public SpotifyAlbum getAlbum(String albumId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CursoredSpotifyList<SpotifyAlbum> getAlbums(List<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SpotifyTrack> getAlbumTracks(String albumId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SpotifyAlbum> getNewReleases() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
