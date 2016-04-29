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

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.social.spotify.api.CursoredSpotifyList;
import org.springframework.social.spotify.api.SpotifyAlbum;

/**
 *
 * @author Andre
 */
public class CursoredSpotifyAlbum {

    private final CursoredSpotifyList<SpotifyAlbum> items;

    public CursoredSpotifyAlbum() {
        this.items = null;
    }

    public CursoredSpotifyAlbum(
            @JsonProperty("items") CursoredSpotifyList<SpotifyAlbum> items,
            @JsonProperty("href") String href,
            @JsonProperty("limit") Integer limit,
            @JsonProperty("next") String next,
            @JsonProperty("previous") String previous,
            @JsonProperty("offset") Integer offset,
            @JsonProperty("total") Integer total) {
        this.items = new CursoredSpotifyList<>(items, href, limit, next,
                previous, offset, total);
    }

    public CursoredSpotifyList<SpotifyAlbum> getPlaylists() {
        return items;
    }
}
