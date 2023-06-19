// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.validator;

/**
 * Validierungsregel, die prüft, dass die Nutzereingabe ein positiver Geldbetrag ist.
 */
public class EuroBetragPositiveValidatorV1 extends ValidationRuleV1 {
  /**
   * {@code true}, wenn der Betrag nicht 0 sein darf.
   */
  private Boolean strictlyPositive;


  @SuppressWarnings("all")
  public static abstract class EuroBetragPositiveValidatorV1Builder<C extends EuroBetragPositiveValidatorV1, B extends EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1Builder<C, B>> extends ValidationRuleV1.ValidationRuleV1Builder<C, B> {
    @SuppressWarnings("all")
    private Boolean strictlyPositive;

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B strictlyPositive(final Boolean strictlyPositive) {
      this.strictlyPositive = strictlyPositive;
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
      return "EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1Builder(super=" + super.toString() + ", strictlyPositive=" + this.strictlyPositive + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class EuroBetragPositiveValidatorV1BuilderImpl extends EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1Builder<EuroBetragPositiveValidatorV1, EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1BuilderImpl> {
    @SuppressWarnings("all")
    private EuroBetragPositiveValidatorV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public EuroBetragPositiveValidatorV1 build() {
      return new EuroBetragPositiveValidatorV1(this);
    }
  }

  @SuppressWarnings("all")
  protected EuroBetragPositiveValidatorV1(final EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1Builder<?, ?> b) {
    super(b);
    this.strictlyPositive = b.strictlyPositive;
  }

  @SuppressWarnings("all")
  public static EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1Builder<?, ?> builder() {
    return new EuroBetragPositiveValidatorV1.EuroBetragPositiveValidatorV1BuilderImpl();
  }

  /**
   * {@code true}, wenn der Betrag nicht 0 sein darf.
   */
  @SuppressWarnings("all")
  public Boolean getStrictlyPositive() {
    return this.strictlyPositive;
  }

  /**
   * {@code true}, wenn der Betrag nicht 0 sein darf.
   */
  @SuppressWarnings("all")
  public void setStrictlyPositive(final Boolean strictlyPositive) {
    this.strictlyPositive = strictlyPositive;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "EuroBetragPositiveValidatorV1(strictlyPositive=" + this.getStrictlyPositive() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof EuroBetragPositiveValidatorV1)) return false;
    final EuroBetragPositiveValidatorV1 other = (EuroBetragPositiveValidatorV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$strictlyPositive = this.getStrictlyPositive();
    final Object other$strictlyPositive = other.getStrictlyPositive();
    if (this$strictlyPositive == null ? other$strictlyPositive != null : !this$strictlyPositive.equals(other$strictlyPositive)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof EuroBetragPositiveValidatorV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $strictlyPositive = this.getStrictlyPositive();
    result = result * PRIME + ($strictlyPositive == null ? 43 : $strictlyPositive.hashCode());
    return result;
  }
}
