// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.config;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.style.AdditionalFieldStylingV1;

/**
 * Konfiguration für RadioButton-Felder ({@link FieldTypeV1#RADIO_BUTTONS RADIO_BUTTONS}).
 */
public class AdditionalRadioButtonConfigV1 implements AdditionalFieldConfigV1 {
  /**
   * Style-Informationen. Nicht {@code null}.
   */
  private AdditionalFieldStylingV1 styling;

  @Override
  public AdditionalRadioButtonConfigV1 clone() {
    try {
      return (AdditionalRadioButtonConfigV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  AdditionalRadioButtonConfigV1(final AdditionalFieldStylingV1 styling) {
    this.styling = styling;
  }


  @SuppressWarnings("all")
  public static class AdditionalRadioButtonConfigV1Builder {
    @SuppressWarnings("all")
    private AdditionalFieldStylingV1 styling;

    @SuppressWarnings("all")
    AdditionalRadioButtonConfigV1Builder() {
    }

    /**
     * Style-Informationen. Nicht {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalRadioButtonConfigV1.AdditionalRadioButtonConfigV1Builder styling(final AdditionalFieldStylingV1 styling) {
      this.styling = styling;
      return this;
    }

    @SuppressWarnings("all")
    public AdditionalRadioButtonConfigV1 build() {
      return new AdditionalRadioButtonConfigV1(this.styling);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "AdditionalRadioButtonConfigV1.AdditionalRadioButtonConfigV1Builder(styling=" + this.styling + ")";
    }
  }

  @SuppressWarnings("all")
  public static AdditionalRadioButtonConfigV1.AdditionalRadioButtonConfigV1Builder builder() {
    return new AdditionalRadioButtonConfigV1.AdditionalRadioButtonConfigV1Builder();
  }

  /**
   * Style-Informationen. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public AdditionalFieldStylingV1 getStyling() {
    return this.styling;
  }

  /**
   * Style-Informationen. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  public void setStyling(final AdditionalFieldStylingV1 styling) {
    this.styling = styling;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof AdditionalRadioButtonConfigV1)) return false;
    final AdditionalRadioButtonConfigV1 other = (AdditionalRadioButtonConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$styling = this.getStyling();
    final Object other$styling = other.getStyling();
    if (this$styling == null ? other$styling != null : !this$styling.equals(other$styling)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof AdditionalRadioButtonConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $styling = this.getStyling();
    result = result * PRIME + ($styling == null ? 43 : $styling.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "AdditionalRadioButtonConfigV1(styling=" + this.getStyling() + ")";
  }
}
