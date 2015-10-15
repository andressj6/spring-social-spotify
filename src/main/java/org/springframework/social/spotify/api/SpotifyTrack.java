/*
 * Copyright 2015 Rafael Peretta / Andre Lima.
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author André
 */
@JsonIgnoreProperties(value = {"external_ids"})
public class SpotifyTrack extends SpotifyObject implements Serializable {

    private List<SpotifyArtist> artists;
    @JsonProperty("available_markets")
    private List<String> availableMarkets;
    @JsonProperty("disc_number")
    private Integer discNumber;
    @JsonProperty("duration_ms")
    private Integer durationMS;
    private boolean explicit;
    @JsonProperty("external_urls")
    private SpotifyExternalURL externalURLs;
    private String href;
    private String id;
    @JsonProperty("is_playable")
    private boolean isPlayable;
    @JsonProperty("linked_from")
    private SpotifyTrackLink linkedFrom;
    private String name;
    @JsonProperty("preview_url")
    private String previewURL;
    @JsonProperty("track_number")
    private Integer trackNumber;
    private String type;
    private int total;
    private int popularity;
    private SpotifyAlbum album;

    public SpotifyTrack() {
    }

    public List<SpotifyArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<SpotifyArtist> artists) {
        this.artists = artists;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Integer getDurationMS() {
        return durationMS;
    }

    public void setDurationMS(Integer durationMS) {
        this.durationMS = durationMS;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public SpotifyExternalURL getExternalURLs() {
        return externalURLs;
    }

    public void setExternalURLs(SpotifyExternalURL externalURLs) {
        this.externalURLs = externalURLs;
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

    public boolean isIsPlayable() {
        return isPlayable;
    }

    public void setIsPlayable(boolean isPlayable) {
        this.isPlayable = isPlayable;
    }

    public SpotifyTrackLink getLinkedFrom() {
        return linkedFrom;
    }

    public void setLinkedFrom(SpotifyTrackLink linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public SpotifyAlbum getAlbum() {
        return album;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpotifyTrack other = (SpotifyTrack) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Track: " + this.getName() + " - Artists : " + StringUtils.collectionToCommaDelimitedString(this.getArtists()) + " | " + super.toString();
    }

}
