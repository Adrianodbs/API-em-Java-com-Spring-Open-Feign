package com.spotifyapi.spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public class AlbumResponse {

  private AlbumWrapper albums;

  public AlbumResponse() {
  }

  public AlbumResponse(AlbumWrapper albums) {
    this.albums = albums;
  }

  public AlbumWrapper getAlbums() {
    return albums;
  }

  public void setAlbums(AlbumWrapper albums) {
    this.albums = albums;
  }

}
