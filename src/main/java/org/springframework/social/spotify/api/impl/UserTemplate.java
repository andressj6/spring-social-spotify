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
package org.springframework.social.spotify.api.impl;

import org.springframework.social.spotify.api.SpotifyUser;
import org.springframework.social.spotify.api.UserOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Rafael Peretta
 *
 */
public class UserTemplate extends AbstractSpotifyOperations implements UserOperations {

    private final RestTemplate restTemplate;

    public UserTemplate(RestTemplate restTemplate, boolean isUserAuthorized, boolean isAppAuthorized) {
        super(isUserAuthorized, isAppAuthorized);
        this.restTemplate = restTemplate;
    }

    @Override
    public SpotifyUser me() {
        requireUserAuthorization();
        return restTemplate.getForObject(buildUri("me"), SpotifyUser.class);
    }

    @Override
    public SpotifyUser getProfile(String id) {
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.set("user_id", id);
        return restTemplate.getForObject(buildUri("users", parameters), SpotifyUser.class);
    }

}
