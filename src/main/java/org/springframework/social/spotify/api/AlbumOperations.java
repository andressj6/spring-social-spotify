/*
 * Copyright 2015 André Lima.
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

import java.util.List;

import org.springframework.social.spotify.api.impl.CursoredSpotifyAlbum;
import org.springframework.social.spotify.entities.SpotifyAlbum;
import org.springframework.social.spotify.entities.SpotifyTrack;

/**
 * Interface defining album-related operations (loading album info, tracks from
 * an album, etc.)
 *
 * @author André
 */
public interface AlbumOperations {

    /**
     * Loads an album by it's spotify id
     *
     * @param albumId the spotify id of the album
     * @return the album
     * @throws IllegalArgumentException if the id doesn't return any album
     */
    SpotifyAlbum getAlbum(String albumId);

    /**
     * Gets several albums
     *
     * @param ids
     * @return
     */
    CursoredSpotifyAlbum getAlbums(List<String> ids);

    /**
     * Get an album's list of tracks
     *
     * @param albumId
     * @return
     */
    List<SpotifyTrack> getAlbumTracks(String albumId);

    /**
     * Gets a list of the new releases for the current user
     *
     * @return
     */
    List<SpotifyAlbum> getNewReleases();
}
