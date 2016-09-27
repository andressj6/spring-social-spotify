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
package org.springframework.social.spotify.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Spotify playlist simplified object
 *
 * @author Rafael Peretta
 *
 */
@Data
public class SpotifyPlaylist extends SpotifyObject {

    private String id;

    private Boolean collaborative;

    @JsonProperty("external_urls")
    private SpotifyExternalURL externalUrls;

    private String href;

    private List<SpotifyImage> images;

    private String name;

    private SpotifyUser owner;

    @JsonProperty("public")
    private Boolean status;

    @JsonProperty("snapshot_id")
    private String snapshotId;

    private PlaylistTracks tracks;

    private String type;

    public SpotifyPlaylist() {
        // TODO Auto-generated constructor stub
    }

    public SpotifyPlaylist(String uri, String id, Boolean collaborative,
            SpotifyExternalURL externalUrls, String href, List<SpotifyImage> images, String name,
            SpotifyUser owner, Boolean status, String snapshotId, PlaylistTracks tracks, String type) {
        super(uri);
        this.id = id;
        this.collaborative = collaborative;
        this.externalUrls = externalUrls;
        this.href = href;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.status = status;
        this.snapshotId = snapshotId;
        this.tracks = tracks;
        this.type = type;
    }

    @Data
    class PlaylistTracks {
        Integer total;
        String href;
    }

}
