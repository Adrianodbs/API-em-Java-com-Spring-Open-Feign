package com.spotifyapi.spotify.client;

public class LoginRequest {

  private String grantType;
  private String clientId;
  private String clientSecret;

  public LoginRequest() {
  }

  public LoginRequest(String grantType, String clientId, String clientSecret) {
    this.grantType = grantType;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
  }

  public String getGrantType() {
    return grantType;
  }

  public String getClientId() {
    return clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

}
