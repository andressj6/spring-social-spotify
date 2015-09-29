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
import java.util.Arrays;
import java.util.Objects;
import org.springframework.util.StringUtils;

/**
 *
 * @author André
 */
public class SpotifyTrack extends SpotifyObject implements Serializable {

    private SpotifyArtist[] artists;
    private String[] available_markets;
    private Integer disc_number;
    private Integer duration_ms;
    private boolean explicit;
    private SpotifyExternalURL external_urls;
    private String href;
    private String id;
    private boolean is_playable;
    private SpotifyTrackLink linked_from;
    private String name;
    private String preview_url;
    private Integer track_number;
    private String type;

    public SpotifyTrack() {
    }

    public SpotifyArtist[] getArtists() {
        return artists;
    }

    public void setArtists(SpotifyArtist[] artists) {
        this.artists = artists;
    }

    public String[] getAvailable_markets() {
        return available_markets;
    }

    public void setAvailable_markets(String[] available_markets) {
        this.available_markets = available_markets;
    }

    public Integer getDisc_number() {
        return disc_number;
    }

    public void setDisc_number(Integer disc_number) {
        this.disc_number = disc_number;
    }

    public Integer getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(Integer duration_ms) {
        this.duration_ms = duration_ms;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
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

    public boolean isIs_playable() {
        return is_playable;
    }

    public void setIs_playable(boolean is_playable) {
        this.is_playable = is_playable;
    }

    public SpotifyTrackLink getLinked_from() {
        return linked_from;
    }

    public void setLinked_from(SpotifyTrackLink linked_from) {
        this.linked_from = linked_from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public Integer getTrack_number() {
        return track_number;
    }

    public void setTrack_number(Integer track_number) {
        this.track_number = track_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Track: "+ this.getName() + " - Artists+: " + StringUtils.arrayToCommaDelimitedString(this.getArtists()) + " | " + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.artists);
        hash = 97 * hash + Arrays.deepHashCode(this.available_markets);
        hash = 97 * hash + Objects.hashCode(this.disc_number);
        hash = 97 * hash + Objects.hashCode(this.duration_ms);
        hash = 97 * hash + (this.explicit ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.external_urls);
        hash = 97 * hash + Objects.hashCode(this.href);
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + (this.is_playable ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.linked_from);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.preview_url);
        hash = 97 * hash + Objects.hashCode(this.track_number);
        hash = 97 * hash + Objects.hashCode(this.type);
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
        final SpotifyTrack other = (SpotifyTrack) obj;
        if (!Objects.equals(this.artists, other.artists)) {
            return false;
        }
        if (!Arrays.deepEquals(this.available_markets, other.available_markets)) {
            return false;
        }
        if (!Objects.equals(this.disc_number, other.disc_number)) {
            return false;
        }
        if (!Objects.equals(this.duration_ms, other.duration_ms)) {
            return false;
        }
        if (this.explicit != other.explicit) {
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
        if (this.is_playable != other.is_playable) {
            return false;
        }
        if (!Objects.equals(this.linked_from, other.linked_from)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.preview_url, other.preview_url)) {
            return false;
        }
        if (!Objects.equals(this.track_number, other.track_number)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

}
