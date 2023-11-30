package com.spotifyapi.spotify.client;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public class AlbumWrapper {

  private List<Album> items;

  public AlbumWrapper(List<Album> items) {
    this.items = items;
  }

  public AlbumWrapper() {
  }

  public List<Album> getItems() {
    return items;
  }

  public void setItems(List<Album> items) {
    this.items = items;
  }

}
