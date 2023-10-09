// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

/**
 * Datei mit Dateiinhalt.
 */
public class BinaryContentV1 {
  /**
   * Ein Key, welcher zur Identifikation dieses Dokuments verwendet werden kann. Wird dynamisch erzeugt.
   */
  protected String key;
  /**
   * Der Dateiname der vom Nutzer hochgeladenen Datei.
   */
  protected String uploadedFilename;
  /**
   * Der Anzeigename.
   */
  protected String label;
  /**
   * Der Content-Type der Daten.
   */
  protected String mimetype;
  /**
   * Die Binärdaten.
   */
  private byte[] data;

  /**
   * Gibt die Größe der Datei in Bytes zurück.
   *
   * @return Größe der Datei in Bytes.
   */
  public long getSize() {
    if (data == null) {
      return 0L;
    }
    return data.length;
  }


  @SuppressWarnings("all")
  public static abstract class BinaryContentV1Builder<C extends BinaryContentV1, B extends BinaryContentV1.BinaryContentV1Builder<C, B>> {
    @SuppressWarnings("all")
    private String key;
    @SuppressWarnings("all")
    private String uploadedFilename;
    @SuppressWarnings("all")
    private String label;
    @SuppressWarnings("all")
    private String mimetype;
    @SuppressWarnings("all")
    private byte[] data;

    /**
     * Ein Key, welcher zur Identifikation dieses Dokuments verwendet werden kann. Wird dynamisch erzeugt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B key(final String key) {
      this.key = key;
      return self();
    }

    /**
     * Der Dateiname der vom Nutzer hochgeladenen Datei.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B uploadedFilename(final String uploadedFilename) {
      this.uploadedFilename = uploadedFilename;
      return self();
    }

    /**
     * Der Anzeigename.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B label(final String label) {
      this.label = label;
      return self();
    }

    /**
     * Der Content-Type der Daten.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B mimetype(final String mimetype) {
      this.mimetype = mimetype;
      return self();
    }

    /**
     * Die Binärdaten.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B data(final byte[] data) {
      this.data = data;
      return self();
    }

    @SuppressWarnings("all")
    protected abstract B self();

    @SuppressWarnings("all")
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "BinaryContentV1.BinaryContentV1Builder(key=" + this.key + ", uploadedFilename=" + this.uploadedFilename + ", label=" + this.label + ", mimetype=" + this.mimetype + ", data=" + java.util.Arrays.toString(this.data) + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class BinaryContentV1BuilderImpl extends BinaryContentV1.BinaryContentV1Builder<BinaryContentV1, BinaryContentV1.BinaryContentV1BuilderImpl> {
    @SuppressWarnings("all")
    private BinaryContentV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected BinaryContentV1.BinaryContentV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public BinaryContentV1 build() {
      return new BinaryContentV1(this);
    }
  }

  @SuppressWarnings("all")
  protected BinaryContentV1(final BinaryContentV1.BinaryContentV1Builder<?, ?> b) {
    this.key = b.key;
    this.uploadedFilename = b.uploadedFilename;
    this.label = b.label;
    this.mimetype = b.mimetype;
    this.data = b.data;
  }

  @SuppressWarnings("all")
  public static BinaryContentV1.BinaryContentV1Builder<?, ?> builder() {
    return new BinaryContentV1.BinaryContentV1BuilderImpl();
  }

  /**
   * Ein Key, welcher zur Identifikation dieses Dokuments verwendet werden kann. Wird dynamisch erzeugt.
   */
  @SuppressWarnings("all")
  public String getKey() {
    return this.key;
  }

  /**
   * Der Dateiname der vom Nutzer hochgeladenen Datei.
   */
  @SuppressWarnings("all")
  public String getUploadedFilename() {
    return this.uploadedFilename;
  }

  /**
   * Der Anzeigename.
   */
  @SuppressWarnings("all")
  public String getLabel() {
    return this.label;
  }

  /**
   * Der Content-Type der Daten.
   */
  @SuppressWarnings("all")
  public String getMimetype() {
    return this.mimetype;
  }

  /**
   * Die Binärdaten.
   */
  @SuppressWarnings("all")
  public byte[] getData() {
    return this.data;
  }

  /**
   * Ein Key, welcher zur Identifikation dieses Dokuments verwendet werden kann. Wird dynamisch erzeugt.
   */
  @SuppressWarnings("all")
  public void setKey(final String key) {
    this.key = key;
  }

  /**
   * Der Dateiname der vom Nutzer hochgeladenen Datei.
   */
  @SuppressWarnings("all")
  public void setUploadedFilename(final String uploadedFilename) {
    this.uploadedFilename = uploadedFilename;
  }

  /**
   * Der Anzeigename.
   */
  @SuppressWarnings("all")
  public void setLabel(final String label) {
    this.label = label;
  }

  /**
   * Der Content-Type der Daten.
   */
  @SuppressWarnings("all")
  public void setMimetype(final String mimetype) {
    this.mimetype = mimetype;
  }

  /**
   * Die Binärdaten.
   */
  @SuppressWarnings("all")
  public void setData(final byte[] data) {
    this.data = data;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "BinaryContentV1(key=" + this.getKey() + ", uploadedFilename=" + this.getUploadedFilename() + ", label=" + this.getLabel() + ", mimetype=" + this.getMimetype() + ")";
  }

  @SuppressWarnings("all")
  public BinaryContentV1() {
  }

  @SuppressWarnings("all")
  public BinaryContentV1(final String key, final String uploadedFilename, final String label, final String mimetype, final byte[] data) {
    this.key = key;
    this.uploadedFilename = uploadedFilename;
    this.label = label;
    this.mimetype = mimetype;
    this.data = data;
  }
}
