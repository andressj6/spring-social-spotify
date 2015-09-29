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

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author André
 */
public class SpotifyArtist extends SpotifyObject implements Serializable {

    private SpotifyExternalURL external_urls;
    private String href;
    private String id;
    private String name;
    private String type;

    public SpotifyArtist() {
    }

    public SpotifyArtist(SpotifyExternalURL external_urls, String href, String id, String name, String type, String uri) {
        super(uri);
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public SpotifyExternalURL getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(SpotifyExternalURL external_urls) {
        this.external_urls = external_urls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.external_urls);
        hash = 29 * hash + Objects.hashCode(this.href);
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.type);
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
        final SpotifyArtist other = (SpotifyArtist) obj;
        if (!Objects.equals(this.external_urls, other.external_urls)) {
            return false;
        }
        if (!Objects.equals(this.href, other.href)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Spotify Artist: " + this.getName() + " - " + super.toString();
    }

}
