/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.spotify.api;

/**
 *
 * @author Andre
 */
public interface UserOperations {

    /**
     * Gets the current logged user
     *
     * @return
     */
    SpotifyUser me();

    /**
     * Gets the profile for the provided user id
     *
     * @param id
     * @return
     */
    SpotifyUser getProfile(String id);

}
