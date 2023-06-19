// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.jesaja;

/**
 * Kontakt einer Organisationseinheit, die durch Abfrage bei Jesaja ermittelt wurde.
 */
public class JesajaOrganisationseinheitKontaktV1 {
  /**
   * E-Mail-Adresse.
   */
  private String email;
  /**
   * Fax-Nummer.
   */
  private String fax;
  /**
   * Telefonnummer.
   */
  private String telefon;


  @SuppressWarnings("all")
  public static class JesajaOrganisationseinheitKontaktV1Builder {
    @SuppressWarnings("all")
    private String email;
    @SuppressWarnings("all")
    private String fax;
    @SuppressWarnings("all")
    private String telefon;

    @SuppressWarnings("all")
    JesajaOrganisationseinheitKontaktV1Builder() {
    }

    /**
     * E-Mail-Adresse.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder email(final String email) {
      this.email = email;
      return this;
    }

    /**
     * Fax-Nummer.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder fax(final String fax) {
      this.fax = fax;
      return this;
    }

    /**
     * Telefonnummer.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder telefon(final String telefon) {
      this.telefon = telefon;
      return this;
    }

    @SuppressWarnings("all")
    public JesajaOrganisationseinheitKontaktV1 build() {
      return new JesajaOrganisationseinheitKontaktV1(this.email, this.fax, this.telefon);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder(email=" + this.email + ", fax=" + this.fax + ", telefon=" + this.telefon + ")";
    }
  }

  @SuppressWarnings("all")
  public static JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder builder() {
    return new JesajaOrganisationseinheitKontaktV1.JesajaOrganisationseinheitKontaktV1Builder();
  }

  /**
   * E-Mail-Adresse.
   */
  @SuppressWarnings("all")
  public String getEmail() {
    return this.email;
  }

  /**
   * Fax-Nummer.
   */
  @SuppressWarnings("all")
  public String getFax() {
    return this.fax;
  }

  /**
   * Telefonnummer.
   */
  @SuppressWarnings("all")
  public String getTelefon() {
    return this.telefon;
  }

  /**
   * E-Mail-Adresse.
   */
  @SuppressWarnings("all")
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * Fax-Nummer.
   */
  @SuppressWarnings("all")
  public void setFax(final String fax) {
    this.fax = fax;
  }

  /**
   * Telefonnummer.
   */
  @SuppressWarnings("all")
  public void setTelefon(final String telefon) {
    this.telefon = telefon;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof JesajaOrganisationseinheitKontaktV1)) return false;
    final JesajaOrganisationseinheitKontaktV1 other = (JesajaOrganisationseinheitKontaktV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$email = this.getEmail();
    final Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final Object this$fax = this.getFax();
    final Object other$fax = other.getFax();
    if (this$fax == null ? other$fax != null : !this$fax.equals(other$fax)) return false;
    final Object this$telefon = this.getTelefon();
    final Object other$telefon = other.getTelefon();
    if (this$telefon == null ? other$telefon != null : !this$telefon.equals(other$telefon)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof JesajaOrganisationseinheitKontaktV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final Object $fax = this.getFax();
    result = result * PRIME + ($fax == null ? 43 : $fax.hashCode());
    final Object $telefon = this.getTelefon();
    result = result * PRIME + ($telefon == null ? 43 : $telefon.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "JesajaOrganisationseinheitKontaktV1(email=" + this.getEmail() + ", fax=" + this.getFax() + ", telefon=" + this.getTelefon() + ")";
  }

  @SuppressWarnings("all")
  public JesajaOrganisationseinheitKontaktV1() {
  }

  @SuppressWarnings("all")
  public JesajaOrganisationseinheitKontaktV1(final String email, final String fax, final String telefon) {
    this.email = email;
    this.fax = fax;
    this.telefon = telefon;
  }
}
