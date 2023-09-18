// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.config;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.style.KfzKennzeichenTypeV1;

/**
 * Konfiguration für Kfz-Felder ({@link FieldTypeV1#KFZ_KENNZEICHEN KFZ_KENNZEICHEN}) für Kennzeichen für
 * normale, elektrische, historische und saisonale Kennzeichen von Autos und Motorrädern.
 * Für die folgenden speziellen Kfz-Kennzeichen gibt es individuelle Konfigurationen:
 * <ul>
 *   <li>Ausfuhr- und Überführungskennzeichen, {@link AdditionalKfzUeberfuehrungsKennzeichenConfigV1}</li>
 *   <li>Kurzzeitkennzeichen, {@link AdditionalKfzKurzzeitKennzeichenConfigV1}</li>
 *   <li>Rotes Kennzeichen, {@link AdditionalKfzRotesKennzeichenConfigV1}</li>
 * </ul>
 */
public class AdditionalKfzKennzeichenConfigV1 implements AdditionalFieldConfigV1 {
  /**
   * Ortskürzel des Kennzeichens.
   */
  private String unterscheidungszeichen;
  /**
   * {@code true}, wenn Kennzeichen für ein Elektrofahrzeug. Sonst {@code false} oder {@code null}.
   */
  private Boolean electric;
  /**
   * {@code true}, wenn Kennzeichen für ein historisches Fahrzeug. Sonst {@code false} oder {@code null}.
   */
  private Boolean historic;
  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   */
  private String saisonStart;
  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   */
  private String saisonEnd;
  /**
   * {@code true}, wenn die Erkennungsnummer 2 (Nummernteil) des Kennzeichens nicht angezeigt wird. Sonst
   * {@code false} oder {@code null}.
   */
  private Boolean erkennungsnummer2Ausblenden;
  /**
   * Typ des Fahrzeugs / Kennzeichens.
   * {@code null} wird interpretiert als {@link KfzKennzeichenTypeV1#CAR CAR}.
   */
  private KfzKennzeichenTypeV1 kennzeichenType;

  @Override
  public AdditionalKfzKennzeichenConfigV1 clone() {
    try {
      return (AdditionalKfzKennzeichenConfigV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  AdditionalKfzKennzeichenConfigV1(final String unterscheidungszeichen, final Boolean electric, final Boolean historic, final String saisonStart, final String saisonEnd, final Boolean erkennungsnummer2Ausblenden, final KfzKennzeichenTypeV1 kennzeichenType) {
    this.unterscheidungszeichen = unterscheidungszeichen;
    this.electric = electric;
    this.historic = historic;
    this.saisonStart = saisonStart;
    this.saisonEnd = saisonEnd;
    this.erkennungsnummer2Ausblenden = erkennungsnummer2Ausblenden;
    this.kennzeichenType = kennzeichenType;
  }


  @SuppressWarnings("all")
  public static class AdditionalKfzKennzeichenConfigV1Builder {
    @SuppressWarnings("all")
    private String unterscheidungszeichen;
    @SuppressWarnings("all")
    private Boolean electric;
    @SuppressWarnings("all")
    private Boolean historic;
    @SuppressWarnings("all")
    private String saisonStart;
    @SuppressWarnings("all")
    private String saisonEnd;
    @SuppressWarnings("all")
    private Boolean erkennungsnummer2Ausblenden;
    @SuppressWarnings("all")
    private KfzKennzeichenTypeV1 kennzeichenType;

    @SuppressWarnings("all")
    AdditionalKfzKennzeichenConfigV1Builder() {
    }

    /**
     * Ortskürzel des Kennzeichens.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder unterscheidungszeichen(final String unterscheidungszeichen) {
      this.unterscheidungszeichen = unterscheidungszeichen;
      return this;
    }

    /**
     * {@code true}, wenn Kennzeichen für ein Elektrofahrzeug. Sonst {@code false} oder {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder electric(final Boolean electric) {
      this.electric = electric;
      return this;
    }

    /**
     * {@code true}, wenn Kennzeichen für ein historisches Fahrzeug. Sonst {@code false} oder {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder historic(final Boolean historic) {
      this.historic = historic;
      return this;
    }

    /**
     * Numerischer Wert des Startmonats eines Saisonkennzeichens.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder saisonStart(final String saisonStart) {
      this.saisonStart = saisonStart;
      return this;
    }

    /**
     * Numerischer Wert des Endmonats eines Saisonkennzeichens.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder saisonEnd(final String saisonEnd) {
      this.saisonEnd = saisonEnd;
      return this;
    }

    /**
     * {@code true}, wenn die Erkennungsnummer 2 (Nummernteil) des Kennzeichens nicht angezeigt wird. Sonst
     * {@code false} oder {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder erkennungsnummer2Ausblenden(final Boolean erkennungsnummer2Ausblenden) {
      this.erkennungsnummer2Ausblenden = erkennungsnummer2Ausblenden;
      return this;
    }

    /**
     * Typ des Fahrzeugs / Kennzeichens.
     * {@code null} wird interpretiert als {@link KfzKennzeichenTypeV1#CAR CAR}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder kennzeichenType(final KfzKennzeichenTypeV1 kennzeichenType) {
      this.kennzeichenType = kennzeichenType;
      return this;
    }

    @SuppressWarnings("all")
    public AdditionalKfzKennzeichenConfigV1 build() {
      return new AdditionalKfzKennzeichenConfigV1(this.unterscheidungszeichen, this.electric, this.historic, this.saisonStart, this.saisonEnd, this.erkennungsnummer2Ausblenden, this.kennzeichenType);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder(unterscheidungszeichen=" + this.unterscheidungszeichen + ", electric=" + this.electric + ", historic=" + this.historic + ", saisonStart=" + this.saisonStart + ", saisonEnd=" + this.saisonEnd + ", erkennungsnummer2Ausblenden=" + this.erkennungsnummer2Ausblenden + ", kennzeichenType=" + this.kennzeichenType + ")";
    }
  }

  @SuppressWarnings("all")
  public static AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder builder() {
    return new AdditionalKfzKennzeichenConfigV1.AdditionalKfzKennzeichenConfigV1Builder();
  }

  /**
   * Ortskürzel des Kennzeichens.
   */
  @SuppressWarnings("all")
  public String getUnterscheidungszeichen() {
    return this.unterscheidungszeichen;
  }

  /**
   * {@code true}, wenn Kennzeichen für ein Elektrofahrzeug. Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public Boolean getElectric() {
    return this.electric;
  }

  /**
   * {@code true}, wenn Kennzeichen für ein historisches Fahrzeug. Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public Boolean getHistoric() {
    return this.historic;
  }

  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   */
  @SuppressWarnings("all")
  public String getSaisonStart() {
    return this.saisonStart;
  }

  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   */
  @SuppressWarnings("all")
  public String getSaisonEnd() {
    return this.saisonEnd;
  }

  /**
   * {@code true}, wenn die Erkennungsnummer 2 (Nummernteil) des Kennzeichens nicht angezeigt wird. Sonst
   * {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public Boolean getErkennungsnummer2Ausblenden() {
    return this.erkennungsnummer2Ausblenden;
  }

  /**
   * Typ des Fahrzeugs / Kennzeichens.
   * {@code null} wird interpretiert als {@link KfzKennzeichenTypeV1#CAR CAR}.
   */
  @SuppressWarnings("all")
  public KfzKennzeichenTypeV1 getKennzeichenType() {
    return this.kennzeichenType;
  }

  /**
   * Ortskürzel des Kennzeichens.
   */
  @SuppressWarnings("all")
  public void setUnterscheidungszeichen(final String unterscheidungszeichen) {
    this.unterscheidungszeichen = unterscheidungszeichen;
  }

  /**
   * {@code true}, wenn Kennzeichen für ein Elektrofahrzeug. Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public void setElectric(final Boolean electric) {
    this.electric = electric;
  }

  /**
   * {@code true}, wenn Kennzeichen für ein historisches Fahrzeug. Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public void setHistoric(final Boolean historic) {
    this.historic = historic;
  }

  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   */
  @SuppressWarnings("all")
  public void setSaisonStart(final String saisonStart) {
    this.saisonStart = saisonStart;
  }

  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   */
  @SuppressWarnings("all")
  public void setSaisonEnd(final String saisonEnd) {
    this.saisonEnd = saisonEnd;
  }

  /**
   * {@code true}, wenn die Erkennungsnummer 2 (Nummernteil) des Kennzeichens nicht angezeigt wird. Sonst
   * {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public void setErkennungsnummer2Ausblenden(final Boolean erkennungsnummer2Ausblenden) {
    this.erkennungsnummer2Ausblenden = erkennungsnummer2Ausblenden;
  }

  /**
   * Typ des Fahrzeugs / Kennzeichens.
   * {@code null} wird interpretiert als {@link KfzKennzeichenTypeV1#CAR CAR}.
   */
  @SuppressWarnings("all")
  public void setKennzeichenType(final KfzKennzeichenTypeV1 kennzeichenType) {
    this.kennzeichenType = kennzeichenType;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof AdditionalKfzKennzeichenConfigV1)) return false;
    final AdditionalKfzKennzeichenConfigV1 other = (AdditionalKfzKennzeichenConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$electric = this.getElectric();
    final Object other$electric = other.getElectric();
    if (this$electric == null ? other$electric != null : !this$electric.equals(other$electric)) return false;
    final Object this$historic = this.getHistoric();
    final Object other$historic = other.getHistoric();
    if (this$historic == null ? other$historic != null : !this$historic.equals(other$historic)) return false;
    final Object this$erkennungsnummer2Ausblenden = this.getErkennungsnummer2Ausblenden();
    final Object other$erkennungsnummer2Ausblenden = other.getErkennungsnummer2Ausblenden();
    if (this$erkennungsnummer2Ausblenden == null ? other$erkennungsnummer2Ausblenden != null : !this$erkennungsnummer2Ausblenden.equals(other$erkennungsnummer2Ausblenden)) return false;
    final Object this$unterscheidungszeichen = this.getUnterscheidungszeichen();
    final Object other$unterscheidungszeichen = other.getUnterscheidungszeichen();
    if (this$unterscheidungszeichen == null ? other$unterscheidungszeichen != null : !this$unterscheidungszeichen.equals(other$unterscheidungszeichen)) return false;
    final Object this$saisonStart = this.getSaisonStart();
    final Object other$saisonStart = other.getSaisonStart();
    if (this$saisonStart == null ? other$saisonStart != null : !this$saisonStart.equals(other$saisonStart)) return false;
    final Object this$saisonEnd = this.getSaisonEnd();
    final Object other$saisonEnd = other.getSaisonEnd();
    if (this$saisonEnd == null ? other$saisonEnd != null : !this$saisonEnd.equals(other$saisonEnd)) return false;
    final Object this$kennzeichenType = this.getKennzeichenType();
    final Object other$kennzeichenType = other.getKennzeichenType();
    if (this$kennzeichenType == null ? other$kennzeichenType != null : !this$kennzeichenType.equals(other$kennzeichenType)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof AdditionalKfzKennzeichenConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $electric = this.getElectric();
    result = result * PRIME + ($electric == null ? 43 : $electric.hashCode());
    final Object $historic = this.getHistoric();
    result = result * PRIME + ($historic == null ? 43 : $historic.hashCode());
    final Object $erkennungsnummer2Ausblenden = this.getErkennungsnummer2Ausblenden();
    result = result * PRIME + ($erkennungsnummer2Ausblenden == null ? 43 : $erkennungsnummer2Ausblenden.hashCode());
    final Object $unterscheidungszeichen = this.getUnterscheidungszeichen();
    result = result * PRIME + ($unterscheidungszeichen == null ? 43 : $unterscheidungszeichen.hashCode());
    final Object $saisonStart = this.getSaisonStart();
    result = result * PRIME + ($saisonStart == null ? 43 : $saisonStart.hashCode());
    final Object $saisonEnd = this.getSaisonEnd();
    result = result * PRIME + ($saisonEnd == null ? 43 : $saisonEnd.hashCode());
    final Object $kennzeichenType = this.getKennzeichenType();
    result = result * PRIME + ($kennzeichenType == null ? 43 : $kennzeichenType.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "AdditionalKfzKennzeichenConfigV1(unterscheidungszeichen=" + this.getUnterscheidungszeichen() + ", electric=" + this.getElectric() + ", historic=" + this.getHistoric() + ", saisonStart=" + this.getSaisonStart() + ", saisonEnd=" + this.getSaisonEnd() + ", erkennungsnummer2Ausblenden=" + this.getErkennungsnummer2Ausblenden() + ", kennzeichenType=" + this.getKennzeichenType() + ")";
  }
}
