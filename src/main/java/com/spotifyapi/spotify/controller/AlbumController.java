package com.spotifyapi.spotify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotifyapi.spotify.client.AuthSpotifyClient;
import com.spotifyapi.spotify.client.LoginRequest;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
  private final AuthSpotifyClient authSpotifyClient;

  public AlbumController(AuthSpotifyClient authSpotifyClient) {
    this.authSpotifyClient = authSpotifyClient;
  }

  @GetMapping("/albums")
  public ResponseEntity<String> helloWorld() {

    var request = new LoginRequest(
        "client_credentials",
        "43e84f9941f1468b86f5bc78384a0583",
        "b3b64f9e57844089b019394c449869d6");
    return ResponseEntity.ok(authSpotifyClient.login(request).getAccessToken());
  }
}
