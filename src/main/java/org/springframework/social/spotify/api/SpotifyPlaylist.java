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
package org.springframework.social.spotify.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spotify playlist simplified object
 * 
 * @author Rafael Peretta
 *
 */
public class SpotifyPlaylist extends SpotifyObject {
    
    private String id;
    
    private Boolean collaborative;
    
    @JsonProperty("exerternal_urls")
    private SpotifyExternalURL externalUrls;

    private String href;

    private List<SpotifyImage> images;

    private String name;

    private SpotifyUser owner;

    private Boolean status;

    @JsonProperty("snapshot_id")
    public String snapshotId;

    public List<String> tracks;

    public String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCollaborative() {
        return collaborative;
    }

    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
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

    public SpotifyUser getOwner() {
        return owner;
    }

    public void setOwner(SpotifyUser owner) {
        this.owner = owner;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
