/*
 * Copyright 2015 André Lima / Rafael Peretta.
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

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author André Lima
 */
@SuppressWarnings("serial")
public class SpotifyAlbum extends SpotifyObject implements Serializable {
    enum AlbumType {

        album, single, compilation;
    }

    @JsonProperty("album_type")
    private AlbumType albumType;

    private List<SpotifyArtist> artists;

    @JsonProperty("available_markets")
    private List<String> availableMarkets;
    @JsonProperty("external_urls")
    private SpotifyExternalURL externalUrls;
    private String href;
    private String id;
    private List<SpotifyImage> images;
    private String name;
    private String type;
    private List<SpotifyTrack> tracks;

    public SpotifyAlbum() {
    }

    public AlbumType getAlbumType() {
        return albumType;
    }

    public void setAlbumType(AlbumType albumType) {
        this.albumType = albumType;
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

    public SpotifyExternalURL getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(SpotifyExternalURL externalUrls) {
        this.externalUrls = externalUrls;
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

    public List<SpotifyTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<SpotifyTrack> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SpotifyAlbum that = (SpotifyAlbum) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Album: " + this.getName() + " by " + StringUtils.arrayToCommaDelimitedString(artists.toArray()) + "| " + super.toString();
    }
}
