// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.List;

/**
 * Payment-Config für den generischen Bezahltask über girocheckout.
 */
public class GiroCheckoutPaymentConfigV1 implements PaymentConfigV1 {
  /**
   * Provider. Hat den Wert "girocheckout".
   */
  private final String provider = PaymentProviderV1.GIRO_CHECKOUT.toString();
  /**
   * ID der Behörde bei GiroCheckout/GiroCockpit.
   */
  private int merchantId;
  /**
   * Liste von ProjektInfos für die möglichen Bezahlverfahren.
   */
  private List<GiroCheckoutProjectV1> projects;


  @SuppressWarnings("all")
  public static class GiroCheckoutPaymentConfigV1Builder {
    @SuppressWarnings("all")
    private int merchantId;
    @SuppressWarnings("all")
    private List<GiroCheckoutProjectV1> projects;

    @SuppressWarnings("all")
    GiroCheckoutPaymentConfigV1Builder() {
    }

    /**
     * ID der Behörde bei GiroCheckout/GiroCockpit.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public GiroCheckoutPaymentConfigV1.GiroCheckoutPaymentConfigV1Builder merchantId(final int merchantId) {
      this.merchantId = merchantId;
      return this;
    }

    /**
     * Liste von ProjektInfos für die möglichen Bezahlverfahren.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public GiroCheckoutPaymentConfigV1.GiroCheckoutPaymentConfigV1Builder projects(final List<GiroCheckoutProjectV1> projects) {
      this.projects = projects;
      return this;
    }

    @SuppressWarnings("all")
    public GiroCheckoutPaymentConfigV1 build() {
      return new GiroCheckoutPaymentConfigV1(this.merchantId, this.projects);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "GiroCheckoutPaymentConfigV1.GiroCheckoutPaymentConfigV1Builder(merchantId=" + this.merchantId + ", projects=" + this.projects + ")";
    }
  }

  @SuppressWarnings("all")
  public static GiroCheckoutPaymentConfigV1.GiroCheckoutPaymentConfigV1Builder builder() {
    return new GiroCheckoutPaymentConfigV1.GiroCheckoutPaymentConfigV1Builder();
  }

  /**
   * Provider. Hat den Wert "girocheckout".
   */
  @SuppressWarnings("all")
  public String getProvider() {
    return this.provider;
  }

  /**
   * ID der Behörde bei GiroCheckout/GiroCockpit.
   */
  @SuppressWarnings("all")
  public int getMerchantId() {
    return this.merchantId;
  }

  /**
   * Liste von ProjektInfos für die möglichen Bezahlverfahren.
   */
  @SuppressWarnings("all")
  public List<GiroCheckoutProjectV1> getProjects() {
    return this.projects;
  }

  /**
   * ID der Behörde bei GiroCheckout/GiroCockpit.
   */
  @SuppressWarnings("all")
  public void setMerchantId(final int merchantId) {
    this.merchantId = merchantId;
  }

  /**
   * Liste von ProjektInfos für die möglichen Bezahlverfahren.
   */
  @SuppressWarnings("all")
  public void setProjects(final List<GiroCheckoutProjectV1> projects) {
    this.projects = projects;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof GiroCheckoutPaymentConfigV1)) return false;
    final GiroCheckoutPaymentConfigV1 other = (GiroCheckoutPaymentConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getMerchantId() != other.getMerchantId()) return false;
    final Object this$provider = this.getProvider();
    final Object other$provider = other.getProvider();
    if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) return false;
    final Object this$projects = this.getProjects();
    final Object other$projects = other.getProjects();
    if (this$projects == null ? other$projects != null : !this$projects.equals(other$projects)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof GiroCheckoutPaymentConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getMerchantId();
    final Object $provider = this.getProvider();
    result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
    final Object $projects = this.getProjects();
    result = result * PRIME + ($projects == null ? 43 : $projects.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "GiroCheckoutPaymentConfigV1(provider=" + this.getProvider() + ", merchantId=" + this.getMerchantId() + ", projects=" + this.getProjects() + ")";
  }

  @SuppressWarnings("all")
  public GiroCheckoutPaymentConfigV1() {
  }

  @SuppressWarnings("all")
  public GiroCheckoutPaymentConfigV1(final int merchantId, final List<GiroCheckoutProjectV1> projects) {
    this.merchantId = merchantId;
    this.projects = projects;
  }
}
