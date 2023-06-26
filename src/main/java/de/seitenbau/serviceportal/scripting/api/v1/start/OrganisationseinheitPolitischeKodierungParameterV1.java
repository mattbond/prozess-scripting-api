// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.start;

/**
 * Objekt, das beim Start eines Prozesses / Erzeugen einer Prozessinstanz in das Object
 * {@link OrganisationseinheitParameterV1} gespeichert wird. Es enthält zusätzliche Adressdaten der mit dem
 * Prozessstart verknüpften Organisationseinheit. Nur für OZG-Hub.
 */
public class OrganisationseinheitPolitischeKodierungParameterV1 {
  /**
   * Amtlicher Regionalschlüssel.
   */
  private String regionalschluessel;


  @SuppressWarnings("all")
  public static class OrganisationseinheitPolitischeKodierungParameterV1Builder {
    @SuppressWarnings("all")
    private String regionalschluessel;

    @SuppressWarnings("all")
    OrganisationseinheitPolitischeKodierungParameterV1Builder() {
    }

    /**
     * Amtlicher Regionalschlüssel.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public OrganisationseinheitPolitischeKodierungParameterV1.OrganisationseinheitPolitischeKodierungParameterV1Builder regionalschluessel(final String regionalschluessel) {
      this.regionalschluessel = regionalschluessel;
      return this;
    }

    @SuppressWarnings("all")
    public OrganisationseinheitPolitischeKodierungParameterV1 build() {
      return new OrganisationseinheitPolitischeKodierungParameterV1(this.regionalschluessel);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "OrganisationseinheitPolitischeKodierungParameterV1.OrganisationseinheitPolitischeKodierungParameterV1Builder(regionalschluessel=" + this.regionalschluessel + ")";
    }
  }

  @SuppressWarnings("all")
  public static OrganisationseinheitPolitischeKodierungParameterV1.OrganisationseinheitPolitischeKodierungParameterV1Builder builder() {
    return new OrganisationseinheitPolitischeKodierungParameterV1.OrganisationseinheitPolitischeKodierungParameterV1Builder();
  }

  /**
   * Amtlicher Regionalschlüssel.
   */
  @SuppressWarnings("all")
  public String getRegionalschluessel() {
    return this.regionalschluessel;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "OrganisationseinheitPolitischeKodierungParameterV1(regionalschluessel=" + this.getRegionalschluessel() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof OrganisationseinheitPolitischeKodierungParameterV1)) return false;
    final OrganisationseinheitPolitischeKodierungParameterV1 other = (OrganisationseinheitPolitischeKodierungParameterV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$regionalschluessel = this.getRegionalschluessel();
    final Object other$regionalschluessel = other.getRegionalschluessel();
    if (this$regionalschluessel == null ? other$regionalschluessel != null : !this$regionalschluessel.equals(other$regionalschluessel)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof OrganisationseinheitPolitischeKodierungParameterV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $regionalschluessel = this.getRegionalschluessel();
    result = result * PRIME + ($regionalschluessel == null ? 43 : $regionalschluessel.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  public OrganisationseinheitPolitischeKodierungParameterV1() {
  }

  @SuppressWarnings("all")
  public OrganisationseinheitPolitischeKodierungParameterV1(final String regionalschluessel) {
    this.regionalschluessel = regionalschluessel;
  }
}
