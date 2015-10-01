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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Rafael Peretta
 *
 */
public class SpotifyUser extends SpotifyObject {

    private String id;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("external_urls")
    private SpotifyExternalURL externalURL;

    private SpotifyFollower follower;

    private String href;

    private SpotifyImage image;

    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SpotifyExternalURL getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(SpotifyExternalURL externalURL) {
        this.externalURL = externalURL;
    }

    public SpotifyFollower getFollower() {
        return follower;
    }

    public void setFollower(SpotifyFollower follower) {
        this.follower = follower;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public SpotifyImage getImage() {
        return image;
    }

    public void setImage(SpotifyImage image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
