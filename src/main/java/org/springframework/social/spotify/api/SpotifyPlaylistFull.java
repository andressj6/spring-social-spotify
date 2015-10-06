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

/**
 * Spotify playlist simplified object
 * 
 * @author Rafael Peretta
 *
 */
public class SpotifyPlaylistFull extends SpotifyPlaylist {
    
    private SpotifyFollower followers;
    
    private List<SpotifyPlaylistTrack> playlistTrack;

    public SpotifyFollower getFollowers() {
        return followers;
    }

    public void setFollowers(SpotifyFollower followers) {
        this.followers = followers;
    }

    public List<SpotifyPlaylistTrack> getPlaylistTrack() {
        return playlistTrack;
    }

    public void setPlaylistTrack(List<SpotifyPlaylistTrack> playlistTrack) {
        this.playlistTrack = playlistTrack;
    }

    @Override
    public SpotifyTrack getTracks() {
        return null;
    }

    @Override
    public void setTracks(SpotifyTrack tracks) {

    }

}
