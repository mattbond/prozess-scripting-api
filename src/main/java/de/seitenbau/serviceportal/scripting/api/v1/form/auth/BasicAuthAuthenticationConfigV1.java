// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.auth;

/**
 * Konfiguration zur Authentifizierung an einem externen Server per Basic-Auth.
 */
public class BasicAuthAuthenticationConfigV1 implements AuthenticationConfigV1 {
  /**
   * Benutzername. Nicht {@code null}.
   */
  private String username;
  /**
   * Passwort. Nicht {@code null}.
   */
  private String password;

  @Override
  public BasicAuthAuthenticationConfigV1 clone() {
    try {
      return (BasicAuthAuthenticationConfigV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }


  @SuppressWarnings("all")
  public static class BasicAuthAuthenticationConfigV1Builder {
    @SuppressWarnings("all")
    private String username;
    @SuppressWarnings("all")
    private String password;

    @SuppressWarnings("all")
    BasicAuthAuthenticationConfigV1Builder() {
    }

    /**
     * Benutzername. Nicht {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public BasicAuthAuthenticationConfigV1.BasicAuthAuthenticationConfigV1Builder username(final String username) {
      this.username = username;
      return this;
    }

    /**
     * Passwort. Nicht {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public BasicAuthAuthenticationConfigV1.BasicAuthAuthenticationConfigV1Builder password(final String password) {
      this.password = password;
      return this;
    }

    @SuppressWarnings("all")
    public BasicAuthAuthenticationConfigV1 build() {
      return new BasicAuthAuthenticationConfigV1(this.username, this.password);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "BasicAuthAuthenticationConfigV1.BasicAuthAuthenticationConfigV1Builder(username=" + this.username + ", password=" + this.password + ")";
    }
  }

  @SuppressWarnings("all")
  public static BasicAuthAuthenticationConfigV1.BasicAuthAuthenticationConfigV1Builder builder() {
    return new BasicAuthAuthenticationConfigV1.BasicAuthAuthenticationConfigV1Builder();
  }

  /**
   * Benutzername. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public String getUsername() {
    return this.username;
  }

  /**
   * Passwort. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public String getPassword() {
    return this.password;
  }

  /**
   * Benutzername. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public void setUsername(final String username) {
    this.username = username;
  }

  /**
   * Passwort. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public void setPassword(final String password) {
    this.password = password;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof BasicAuthAuthenticationConfigV1)) return false;
    final BasicAuthAuthenticationConfigV1 other = (BasicAuthAuthenticationConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$username = this.getUsername();
    final Object other$username = other.getUsername();
    if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
    final Object this$password = this.getPassword();
    final Object other$password = other.getPassword();
    if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof BasicAuthAuthenticationConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $username = this.getUsername();
    result = result * PRIME + ($username == null ? 43 : $username.hashCode());
    final Object $password = this.getPassword();
    result = result * PRIME + ($password == null ? 43 : $password.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "BasicAuthAuthenticationConfigV1(username=" + this.getUsername() + ", password=" + this.getPassword() + ")";
  }

  @SuppressWarnings("all")
  public BasicAuthAuthenticationConfigV1() {
  }

  @SuppressWarnings("all")
  public BasicAuthAuthenticationConfigV1(final String username, final String password) {
    this.username = username;
    this.password = password;
  }
}
