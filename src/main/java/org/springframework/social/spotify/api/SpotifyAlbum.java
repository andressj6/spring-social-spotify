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
import java.util.List;
import java.util.Objects;
import org.springframework.util.StringUtils;

/**
 *
 * @author André
 */
public class SpotifyAlbum extends SpotifyObject implements Serializable {

    enum AlbumType {

        album, single, compilation;
    }

    private AlbumType album_type;
    private List<SpotifyArtist> artists;
    private List<String> available_markets;
    private SpotifyExternalURL external_urls;
    private String href;
    private String id;
    private List<SpotifyImage> images;
    private String name;
    private String type;

    public SpotifyAlbum() {
    }

    public List<SpotifyArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<SpotifyArtist> artists) {
        this.artists = artists;
    }

    public AlbumType getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(AlbumType album_type) {
        this.album_type = album_type;
    }

    public List<String> getAvailable_markets() {
        return available_markets;
    }

    public void setAvailable_markets(List<String> available_markets) {
        this.available_markets = available_markets;
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

    public List<SpotifyImage> getImages() {
        return images;
    }

    public void setImages(List<SpotifyImage> images) {
        this.images = images;
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
        hash = 41 * hash + Objects.hashCode(this.album_type);
        hash = 41 * hash + Objects.hashCode(this.available_markets);
        hash = 41 * hash + Objects.hashCode(this.external_urls);
        hash = 41 * hash + Objects.hashCode(this.href);
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.images);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.type);
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
        final SpotifyAlbum other = (SpotifyAlbum) obj;
        if (this.album_type != other.album_type) {
            return false;
        }
        if (!Objects.equals(this.available_markets, other.available_markets)) {
            return false;
        }
        if (!Objects.equals(this.external_urls, other.external_urls)) {
            return false;
        }
        if (!Objects.equals(this.href, other.href)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.images, other.images)) {
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
        return "Album: " + this.getName() + " by " + StringUtils.arrayToCommaDelimitedString(artists.toArray()) + "| " + super.toString();
    }
}
