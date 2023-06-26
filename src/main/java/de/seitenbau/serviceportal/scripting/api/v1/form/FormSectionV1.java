// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form;

import java.util.ArrayList;
import java.util.List;
import lombok.NonNull;

/**
 * Abschnitt in einem Formular.
 */
public class FormSectionV1 {
  /**
   * Überschrift des Abschnitts.
   */
  private String title;
  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @NonNull
  private List<FieldGroupV1> fieldGroups;

  @SuppressWarnings("all")
  private static List<FieldGroupV1> $default$fieldGroups() {
    return new ArrayList<>();
  }

  @SuppressWarnings("all")
  FormSectionV1(final String title, @NonNull final List<FieldGroupV1> fieldGroups) {
    if (fieldGroups == null) {
      throw new NullPointerException("fieldGroups is marked non-null but is null");
    }
    this.title = title;
    this.fieldGroups = fieldGroups;
  }


  @SuppressWarnings("all")
  public static class FormSectionV1Builder {
    @SuppressWarnings("all")
    private String title;
    @SuppressWarnings("all")
    private boolean fieldGroups$set;
    @SuppressWarnings("all")
    private List<FieldGroupV1> fieldGroups$value;

    @SuppressWarnings("all")
    FormSectionV1Builder() {
    }

    /**
     * Überschrift des Abschnitts.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FormSectionV1.FormSectionV1Builder title(final String title) {
      this.title = title;
      return this;
    }

    /**
     * Feldgruppen dieses Abschnitts. Default ist leere Liste.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FormSectionV1.FormSectionV1Builder fieldGroups(@NonNull final List<FieldGroupV1> fieldGroups) {
      if (fieldGroups == null) {
        throw new NullPointerException("fieldGroups is marked non-null but is null");
      }
      this.fieldGroups$value = fieldGroups;
      fieldGroups$set = true;
      return this;
    }

    @SuppressWarnings("all")
    public FormSectionV1 build() {
      List<FieldGroupV1> fieldGroups$value = this.fieldGroups$value;
      if (!this.fieldGroups$set) fieldGroups$value = FormSectionV1.$default$fieldGroups();
      return new FormSectionV1(this.title, fieldGroups$value);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "FormSectionV1.FormSectionV1Builder(title=" + this.title + ", fieldGroups$value=" + this.fieldGroups$value + ")";
    }
  }

  @SuppressWarnings("all")
  public static FormSectionV1.FormSectionV1Builder builder() {
    return new FormSectionV1.FormSectionV1Builder();
  }

  /**
   * Überschrift des Abschnitts.
   */
  @SuppressWarnings("all")
  public String getTitle() {
    return this.title;
  }

  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @NonNull
  @SuppressWarnings("all")
  public List<FieldGroupV1> getFieldGroups() {
    return this.fieldGroups;
  }

  /**
   * Überschrift des Abschnitts.
   */
  @SuppressWarnings("all")
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @SuppressWarnings("all")
  public void setFieldGroups(@NonNull final List<FieldGroupV1> fieldGroups) {
    if (fieldGroups == null) {
      throw new NullPointerException("fieldGroups is marked non-null but is null");
    }
    this.fieldGroups = fieldGroups;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FormSectionV1)) return false;
    final FormSectionV1 other = (FormSectionV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$title = this.getTitle();
    final Object other$title = other.getTitle();
    if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
    final Object this$fieldGroups = this.getFieldGroups();
    final Object other$fieldGroups = other.getFieldGroups();
    if (this$fieldGroups == null ? other$fieldGroups != null : !this$fieldGroups.equals(other$fieldGroups)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof FormSectionV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $title = this.getTitle();
    result = result * PRIME + ($title == null ? 43 : $title.hashCode());
    final Object $fieldGroups = this.getFieldGroups();
    result = result * PRIME + ($fieldGroups == null ? 43 : $fieldGroups.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "FormSectionV1(title=" + this.getTitle() + ", fieldGroups=" + this.getFieldGroups() + ")";
  }
}
