// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.start;

/**
 * Objekt, das beim Start eines Prozesses / Erzeugen einer Prozessinstanz in das Object
 * {@link StartParameterV1} gespeichert wird. Es enthält Informationen über die mit dem Prozessstart
 * verknüpfte Leistung. Nur für OZG-Hub.
 */
public class LeistungParameterV1 {
  /**
   * ID der Leistung.
   */
  private String id;


  @SuppressWarnings("all")
  public static class LeistungParameterV1Builder {
    @SuppressWarnings("all")
    private String id;

    @SuppressWarnings("all")
    LeistungParameterV1Builder() {
    }

    /**
     * ID der Leistung.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public LeistungParameterV1.LeistungParameterV1Builder id(final String id) {
      this.id = id;
      return this;
    }

    @SuppressWarnings("all")
    public LeistungParameterV1 build() {
      return new LeistungParameterV1(this.id);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "LeistungParameterV1.LeistungParameterV1Builder(id=" + this.id + ")";
    }
  }

  @SuppressWarnings("all")
  public static LeistungParameterV1.LeistungParameterV1Builder builder() {
    return new LeistungParameterV1.LeistungParameterV1Builder();
  }

  /**
   * ID der Leistung.
   */
  @SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  /**
   * ID der Leistung.
   */
  @SuppressWarnings("all")
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof LeistungParameterV1)) return false;
    final LeistungParameterV1 other = (LeistungParameterV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof LeistungParameterV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "LeistungParameterV1(id=" + this.getId() + ")";
  }

  @SuppressWarnings("all")
  public LeistungParameterV1() {
  }

  @SuppressWarnings("all")
  public LeistungParameterV1(final String id) {
    this.id = id;
  }
}
