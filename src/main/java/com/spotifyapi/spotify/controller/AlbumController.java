package com.spotifyapi.spotify.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotifyapi.spotify.client.Album;
import com.spotifyapi.spotify.client.AlbumSpotifyClient;
import com.spotifyapi.spotify.client.AuthSpotifyClient;
import com.spotifyapi.spotify.client.LoginRequest;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
  private final AuthSpotifyClient authSpotifyClient;

  private final AlbumSpotifyClient albumSpotifyClient;

  public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
    this.authSpotifyClient = authSpotifyClient;
    this.albumSpotifyClient = albumSpotifyClient;
  }

  @GetMapping("/albums")
  public ResponseEntity<List<Album>> helloWorld() {

    var request = new LoginRequest(
        "client_credentials",
        "43e84f9941f1468b86f5bc78384a0583",
        "b3b64f9e57844089b019394c449869d6");

    var token = authSpotifyClient.login(request).getAccessToken();

    var response = albumSpotifyClient.getReleases("Bearer " + token);
    return ResponseEntity.ok(response.getAlbums().getItems());
  }
}
