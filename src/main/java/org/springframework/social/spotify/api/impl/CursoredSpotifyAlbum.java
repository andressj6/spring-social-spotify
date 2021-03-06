/*
 * Copyright 2015 Rafael Peretta/André Lima.
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

import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.entities.SpotifyAlbum;

/**
 * Implementation for retrieving lists of {@link SpotifyAlbum}
 *
 * @author Andre
 */
public class CursoredSpotifyAlbum extends CursoredSpotifyList<SpotifyAlbum> {

    public List<SpotifyAlbum> getAlbums() {
        return getItems();
    }
}
