// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.validator;

/**
 * Validierungsregel, die prüft, dass ein Feldwert zu einem definierten regulären Ausdruck passt.
 */
public class RegexValidatorV1 extends ValidationRuleV1 {
  /**
   * Regex für die Überprüfung (in Java Regex Syntax).
   */
  private String regex;


  @SuppressWarnings("all")
  public static abstract class RegexValidatorV1Builder<C extends RegexValidatorV1, B extends RegexValidatorV1.RegexValidatorV1Builder<C, B>> extends ValidationRuleV1.ValidationRuleV1Builder<C, B> {
    @SuppressWarnings("all")
    private String regex;

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B regex(final String regex) {
      this.regex = regex;
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
      return "RegexValidatorV1.RegexValidatorV1Builder(super=" + super.toString() + ", regex=" + this.regex + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class RegexValidatorV1BuilderImpl extends RegexValidatorV1.RegexValidatorV1Builder<RegexValidatorV1, RegexValidatorV1.RegexValidatorV1BuilderImpl> {
    @SuppressWarnings("all")
    private RegexValidatorV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected RegexValidatorV1.RegexValidatorV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public RegexValidatorV1 build() {
      return new RegexValidatorV1(this);
    }
  }

  @SuppressWarnings("all")
  protected RegexValidatorV1(final RegexValidatorV1.RegexValidatorV1Builder<?, ?> b) {
    super(b);
    this.regex = b.regex;
  }

  @SuppressWarnings("all")
  public static RegexValidatorV1.RegexValidatorV1Builder<?, ?> builder() {
    return new RegexValidatorV1.RegexValidatorV1BuilderImpl();
  }

  /**
   * Regex für die Überprüfung (in Java Regex Syntax).
   */
  @SuppressWarnings("all")
  public String getRegex() {
    return this.regex;
  }

  /**
   * Regex für die Überprüfung (in Java Regex Syntax).
   */
  @SuppressWarnings("all")
  public void setRegex(final String regex) {
    this.regex = regex;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "RegexValidatorV1(regex=" + this.getRegex() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof RegexValidatorV1)) return false;
    final RegexValidatorV1 other = (RegexValidatorV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$regex = this.getRegex();
    final Object other$regex = other.getRegex();
    if (this$regex == null ? other$regex != null : !this$regex.equals(other$regex)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof RegexValidatorV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $regex = this.getRegex();
    result = result * PRIME + ($regex == null ? 43 : $regex.hashCode());
    return result;
  }
}
