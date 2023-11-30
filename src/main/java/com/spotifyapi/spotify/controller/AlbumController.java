package com.spotifyapi.spotify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spotifyapi.spotify.client.GoogleClient;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {
  private final GoogleClient googleClient;

  public AlbumController(GoogleClient googleClient) {
    this.googleClient = googleClient;
  }

  @GetMapping("/albums")
  public ResponseEntity<String> helloWorld() {
    return ResponseEntity.ok(googleClient.helloWolrd());
  }
}
