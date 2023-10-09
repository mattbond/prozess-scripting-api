// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

/**
 * Datei die auf einer externen Dateiablage gespeichert wird.
 */
public class NextcloudBinaryContentV1 extends BinaryContentV1 {
  /**
   * Die Größe der Datei in Bytes.
   */
  private Long size;
  /**
   * Ordner in der die Datei gespeichert wird.
   */
  private EndpointFolderV1 endpointFolder;
  /**
   * Infix in Nextcloud-URL: "baseUrl/infix/folder/[file]name".
   */
  private String infix;
  /**
   * Informationen zur Authentifizierung bei der externen Dateiablage.
   */
  private AuthenticationV1 authentication;

  @Override
  public long getSize() {
    return size;
  }

  /**
   * Gibt immer {@code null} zurück, da NextcloudBinaryContentV1 nur Referenz zur Datei enthält.
   *
   * @return {@code null}
   */
  @Override
  public byte[] getData() {
    return null;
  }


  @SuppressWarnings("all")
  public static abstract class NextcloudBinaryContentV1Builder<C extends NextcloudBinaryContentV1, B extends NextcloudBinaryContentV1.NextcloudBinaryContentV1Builder<C, B>> extends BinaryContentV1.BinaryContentV1Builder<C, B> {
    @SuppressWarnings("all")
    private Long size;
    @SuppressWarnings("all")
    private EndpointFolderV1 endpointFolder;
    @SuppressWarnings("all")
    private String infix;
    @SuppressWarnings("all")
    private AuthenticationV1 authentication;

    /**
     * Die Größe der Datei in Bytes.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B size(final Long size) {
      this.size = size;
      return self();
    }

    /**
     * Ordner in der die Datei gespeichert wird.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B endpointFolder(final EndpointFolderV1 endpointFolder) {
      this.endpointFolder = endpointFolder;
      return self();
    }

    /**
     * Infix in Nextcloud-URL: "baseUrl/infix/folder/[file]name".
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B infix(final String infix) {
      this.infix = infix;
      return self();
    }

    /**
     * Informationen zur Authentifizierung bei der externen Dateiablage.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B authentication(final AuthenticationV1 authentication) {
      this.authentication = authentication;
      return self();
    }

    @Override
    @SuppressWarnings("all")
    protected abstract B self();

    @Override
    @SuppressWarnings("all")
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "NextcloudBinaryContentV1.NextcloudBinaryContentV1Builder(super=" + super.toString() + ", size=" + this.size + ", endpointFolder=" + this.endpointFolder + ", infix=" + this.infix + ", authentication=" + this.authentication + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class NextcloudBinaryContentV1BuilderImpl extends NextcloudBinaryContentV1.NextcloudBinaryContentV1Builder<NextcloudBinaryContentV1, NextcloudBinaryContentV1.NextcloudBinaryContentV1BuilderImpl> {
    @SuppressWarnings("all")
    private NextcloudBinaryContentV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected NextcloudBinaryContentV1.NextcloudBinaryContentV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public NextcloudBinaryContentV1 build() {
      return new NextcloudBinaryContentV1(this);
    }
  }

  @SuppressWarnings("all")
  protected NextcloudBinaryContentV1(final NextcloudBinaryContentV1.NextcloudBinaryContentV1Builder<?, ?> b) {
    super(b);
    this.size = b.size;
    this.endpointFolder = b.endpointFolder;
    this.infix = b.infix;
    this.authentication = b.authentication;
  }

  @SuppressWarnings("all")
  public static NextcloudBinaryContentV1.NextcloudBinaryContentV1Builder<?, ?> builder() {
    return new NextcloudBinaryContentV1.NextcloudBinaryContentV1BuilderImpl();
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "NextcloudBinaryContentV1(size=" + this.getSize() + ", endpointFolder=" + this.getEndpointFolder() + ", infix=" + this.getInfix() + ", authentication=" + this.getAuthentication() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof NextcloudBinaryContentV1)) return false;
    final NextcloudBinaryContentV1 other = (NextcloudBinaryContentV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (!super.equals(o)) return false;
    if (this.getSize() != other.getSize()) return false;
    final Object this$endpointFolder = this.getEndpointFolder();
    final Object other$endpointFolder = other.getEndpointFolder();
    if (this$endpointFolder == null ? other$endpointFolder != null : !this$endpointFolder.equals(other$endpointFolder)) return false;
    final Object this$infix = this.getInfix();
    final Object other$infix = other.getInfix();
    if (this$infix == null ? other$infix != null : !this$infix.equals(other$infix)) return false;
    final Object this$authentication = this.getAuthentication();
    final Object other$authentication = other.getAuthentication();
    if (this$authentication == null ? other$authentication != null : !this$authentication.equals(other$authentication)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof NextcloudBinaryContentV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = super.hashCode();
    final long $size = this.getSize();
    result = result * PRIME + (int) ($size >>> 32 ^ $size);
    final Object $endpointFolder = this.getEndpointFolder();
    result = result * PRIME + ($endpointFolder == null ? 43 : $endpointFolder.hashCode());
    final Object $infix = this.getInfix();
    result = result * PRIME + ($infix == null ? 43 : $infix.hashCode());
    final Object $authentication = this.getAuthentication();
    result = result * PRIME + ($authentication == null ? 43 : $authentication.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  public NextcloudBinaryContentV1() {
  }

  @SuppressWarnings("all")
  public NextcloudBinaryContentV1(final Long size, final EndpointFolderV1 endpointFolder, final String infix, final AuthenticationV1 authentication) {
    this.size = size;
    this.endpointFolder = endpointFolder;
    this.infix = infix;
    this.authentication = authentication;
  }

  /**
   * Ordner in der die Datei gespeichert wird.
   */
  @SuppressWarnings("all")
  public EndpointFolderV1 getEndpointFolder() {
    return this.endpointFolder;
  }

  /**
   * Infix in Nextcloud-URL: "baseUrl/infix/folder/[file]name".
   */
  @SuppressWarnings("all")
  public String getInfix() {
    return this.infix;
  }

  /**
   * Informationen zur Authentifizierung bei der externen Dateiablage.
   */
  @SuppressWarnings("all")
  public AuthenticationV1 getAuthentication() {
    return this.authentication;
  }
}
