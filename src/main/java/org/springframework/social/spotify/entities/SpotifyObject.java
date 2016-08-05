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
package org.springframework.social.spotify.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * Superclass for any of the model-related objects from the SpotifyApi
 *
 * @see <a href="https://developer.spotify.com/web-api/object-model/">Spotify
 * API Object Model</a>
 *
 * @author André
 */
public abstract class SpotifyObject implements Serializable {

    /**
     * The Spotify URI for the object. Every object has a spotify URI
     */
    private String uri;

    public SpotifyObject(String uri) {
        this.uri = uri;
    }

    public SpotifyObject() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "URI: " + this.getUri();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.uri);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpotifyObject other = (SpotifyObject) obj;
        if (!Objects.equals(this.uri, other.uri)) {
            return false;
        }
        return true;
    }

}
