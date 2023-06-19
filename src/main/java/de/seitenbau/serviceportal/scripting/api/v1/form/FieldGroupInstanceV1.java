// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form;

import java.util.Set;
import java.util.stream.Collectors;
import de.seitenbau.serviceportal.scripting.api.v1.form.condition.DisplayConditionV1;

/**
 * Instanz einer Feldgruppe.
 * Die umschließende Feldgruppe ist {@link FieldGroupV1}.
 */
public class FieldGroupInstanceV1 extends AbstractFieldGroupV1 {
  /**
   * Index der Feldgruppen-Instanz innerhalb der umschließenden Feldgruppe.
   */
  private int index;

  /**
   * Erzeugt eine neue Instanz einer Feldgruppe.
   * Die Instanz wird NICHT automatisch zu den Instanzen der Gruppe hinzugefügt.
   *
   * @param group die Gruppe, für die eine neue Instanz erzeugt werden soll, nicht {@code null}.
   * @param index der Index der instanz.
   *
   * @throws NullPointerException falls {@code group} gleich {@code null} ist.
   */
  protected FieldGroupInstanceV1(FieldGroupV1 group, int index) {
    super(group.getId());
    this.setTitle(group.getTitle());
    this.setRows(group.getRows().stream().map(FormRowV1::clone).collect(Collectors.toList()));
    this.setDisplayConditions(group.getDisplayConditions().stream().map(DisplayConditionV1::clone).collect(Collectors.toList()));
    this.index = index;
  }

  /**
   * Prüft, ob diese Instanz innerhalb des gegebenen Formulars sichtbar ist.
   * <p>
   * Die Feldgruppeninstanz ist genau dann sichtbar, wenn sie keine Sichtbarkeitsbedingungen hat oder
   * mindestens eine der definierten Sichtbarkeitsbedingungen erfüllt ist.
   *
   * @param form Formular, in dem diese Feldgruppeninstanz ist, nicht {@code null}
   *
   * @return {@code true}, wenn diese Instanz sichtbar ist, sonst {@code false}
   * @throws NullPointerException falls das gegebene Formular {@code null} ist
   */
  public boolean isShown(FormV1 form) {
    return getDisplayConditions().isEmpty() || getDisplayConditions().stream().anyMatch(c -> c.isShown(this, form));
  }

  public Set<FormFieldKeyV1> fieldsReferencedInDisplayConditions() {
    return getDisplayConditions().stream().flatMap(DisplayConditionV1::identifyFieldDisplayConditions).map(c -> c.getReferencedFieldKey(this)).collect(Collectors.toSet());
  }

  /**
   * Löst Instanz von -1 im übergebenen Field-Key auf und gibt den Field-Key mit aufgelöstem Index
   * zurück.
   *
   * @param key der aufzulösende Field-Key.
   *
   * @return den aufgelösten Field-Key oder {@code key}, falls nicht aufgelöst werden musste
   */
  public FormFieldKeyV1 resolveSameInstancePointers(FormFieldKeyV1 key) {
    FormFieldKeyV1 resolvedKey;
    if (key != null && key.getGroupIndex() == -1) {
      resolvedKey = new FormFieldKeyV1(key.getGroupId(), this.index, key.getFieldId());
    } else {
      resolvedKey = key;
    }
    return resolvedKey;
  }


  @SuppressWarnings("all")
  public static abstract class FieldGroupInstanceV1Builder<C extends FieldGroupInstanceV1, B extends FieldGroupInstanceV1.FieldGroupInstanceV1Builder<C, B>> extends AbstractFieldGroupV1.AbstractFieldGroupV1Builder<C, B> {
    @SuppressWarnings("all")
    private int index;

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B index(final int index) {
      this.index = index;
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
      return "FieldGroupInstanceV1.FieldGroupInstanceV1Builder(super=" + super.toString() + ", index=" + this.index + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class FieldGroupInstanceV1BuilderImpl extends FieldGroupInstanceV1.FieldGroupInstanceV1Builder<FieldGroupInstanceV1, FieldGroupInstanceV1.FieldGroupInstanceV1BuilderImpl> {
    @SuppressWarnings("all")
    private FieldGroupInstanceV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected FieldGroupInstanceV1.FieldGroupInstanceV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public FieldGroupInstanceV1 build() {
      return new FieldGroupInstanceV1(this);
    }
  }

  @SuppressWarnings("all")
  protected FieldGroupInstanceV1(final FieldGroupInstanceV1.FieldGroupInstanceV1Builder<?, ?> b) {
    super(b);
    this.index = b.index;
  }

  @SuppressWarnings("all")
  public static FieldGroupInstanceV1.FieldGroupInstanceV1Builder<?, ?> builder() {
    return new FieldGroupInstanceV1.FieldGroupInstanceV1BuilderImpl();
  }

  /**
   * Index der Feldgruppen-Instanz innerhalb der umschließenden Feldgruppe.
   */
  @SuppressWarnings("all")
  public int getIndex() {
    return this.index;
  }

  /**
   * Index der Feldgruppen-Instanz innerhalb der umschließenden Feldgruppe.
   */
  @SuppressWarnings("all")
  public void setIndex(final int index) {
    this.index = index;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "FieldGroupInstanceV1(index=" + this.getIndex() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FieldGroupInstanceV1)) return false;
    final FieldGroupInstanceV1 other = (FieldGroupInstanceV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (!super.equals(o)) return false;
    if (this.getIndex() != other.getIndex()) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof FieldGroupInstanceV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = super.hashCode();
    result = result * PRIME + this.getIndex();
    return result;
  }
}
