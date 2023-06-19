// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.MessageTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.PossibleValueV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.ValidationMessageV1;

/**
 * Inhalt eines Feldes im Formular-Content.
 *
 * @see FormContentV1
 */
public class FormFieldContentV1 {
  /**
   * Wert des Feldes zum Zeitpunkt des Submits.
   */
  private Object value;
  /**
   * Validierungsmeldungen am Feld.
   * Stammt der FormContent aus einem submitteten Formular, ist diese Liste immer leer
   * (Submit geht nur, wenn keine Validierungsfehler vorhanden sind
   * oder wenn keine Validierung durchgeführt wurde).
   * Default ist eine leere Liste.
   */
  private List<ValidationMessageV1> validationMessages;
  /**
   * Auswahlliste des Feldes. Nur bei Feldern mit auswählbaren Werten, z.B. {@link FieldTypeV1#CHECKBOX
   * CHECKBOX}, gesetzt. Default ist {@code null}.
   */
  private List<PossibleValueV1> possibleValues;

  /**
   * Ob der Feldwert gültig ist. In diesem Fall ist die Liste der Validierungsmeldungen leer.
   *
   * @return {@code true}, wenn keine Validierungsmeldungen existieren, sonst {@code false}
   */
  public boolean isValid() {
    return validationMessages.isEmpty();
  }

  /**
   * Gibt die Liste der Validierungsmeldungen am Feld zurück. Der Typ der Validierungsmeldung wird
   * ignoriert.
   *
   * @return Liste der Validierungsmeldungen am Feld
   */
  public List<String> getValidationMessagesAsString() {
    return validationMessages.stream().map(ValidationMessageV1::getMessageText).collect(Collectors.toList());
  }

  /**
   * Der gegebene String wird als Validierungsmeldung vom Typ {@link MessageTypeV1#INTERNAL INTERNAL}
   * zu den Validierungsmeldungen des Feldes hinzugefügt.
   *
   * @param message Validierungsmeldung, die hinzugefügt wird
   */
  public void addValidationMessage(String message) {
    validationMessages.add(new ValidationMessageV1(MessageTypeV1.INTERNAL, message));
  }

  @SuppressWarnings("all")
  private static List<ValidationMessageV1> $default$validationMessages() {
    return new ArrayList<>();
  }


  @SuppressWarnings("all")
  public static class FormFieldContentV1Builder {
    @SuppressWarnings("all")
    private Object value;
    @SuppressWarnings("all")
    private boolean validationMessages$set;
    @SuppressWarnings("all")
    private List<ValidationMessageV1> validationMessages$value;
    @SuppressWarnings("all")
    private List<PossibleValueV1> possibleValues;

    @SuppressWarnings("all")
    FormFieldContentV1Builder() {
    }

    /**
     * Wert des Feldes zum Zeitpunkt des Submits.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FormFieldContentV1.FormFieldContentV1Builder value(final Object value) {
      this.value = value;
      return this;
    }

    /**
     * Validierungsmeldungen am Feld.
     * Stammt der FormContent aus einem submitteten Formular, ist diese Liste immer leer
     * (Submit geht nur, wenn keine Validierungsfehler vorhanden sind
     * oder wenn keine Validierung durchgeführt wurde).
     * Default ist eine leere Liste.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FormFieldContentV1.FormFieldContentV1Builder validationMessages(final List<ValidationMessageV1> validationMessages) {
      this.validationMessages$value = validationMessages;
      validationMessages$set = true;
      return this;
    }

    /**
     * Auswahlliste des Feldes. Nur bei Feldern mit auswählbaren Werten, z.B. {@link FieldTypeV1#CHECKBOX
     * CHECKBOX}, gesetzt. Default ist {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FormFieldContentV1.FormFieldContentV1Builder possibleValues(final List<PossibleValueV1> possibleValues) {
      this.possibleValues = possibleValues;
      return this;
    }

    @SuppressWarnings("all")
    public FormFieldContentV1 build() {
      List<ValidationMessageV1> validationMessages$value = this.validationMessages$value;
      if (!this.validationMessages$set) validationMessages$value = FormFieldContentV1.$default$validationMessages();
      return new FormFieldContentV1(this.value, validationMessages$value, this.possibleValues);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "FormFieldContentV1.FormFieldContentV1Builder(value=" + this.value + ", validationMessages$value=" + this.validationMessages$value + ", possibleValues=" + this.possibleValues + ")";
    }
  }

  @SuppressWarnings("all")
  public static FormFieldContentV1.FormFieldContentV1Builder builder() {
    return new FormFieldContentV1.FormFieldContentV1Builder();
  }

  /**
   * Wert des Feldes zum Zeitpunkt des Submits.
   */
  @SuppressWarnings("all")
  public Object getValue() {
    return this.value;
  }

  /**
   * Validierungsmeldungen am Feld.
   * Stammt der FormContent aus einem submitteten Formular, ist diese Liste immer leer
   * (Submit geht nur, wenn keine Validierungsfehler vorhanden sind
   * oder wenn keine Validierung durchgeführt wurde).
   * Default ist eine leere Liste.
   */
  @SuppressWarnings("all")
  public List<ValidationMessageV1> getValidationMessages() {
    return this.validationMessages;
  }

  /**
   * Auswahlliste des Feldes. Nur bei Feldern mit auswählbaren Werten, z.B. {@link FieldTypeV1#CHECKBOX
   * CHECKBOX}, gesetzt. Default ist {@code null}.
   */
  @SuppressWarnings("all")
  public List<PossibleValueV1> getPossibleValues() {
    return this.possibleValues;
  }

  /**
   * Wert des Feldes zum Zeitpunkt des Submits.
   */
  @SuppressWarnings("all")
  public void setValue(final Object value) {
    this.value = value;
  }

  /**
   * Validierungsmeldungen am Feld.
   * Stammt der FormContent aus einem submitteten Formular, ist diese Liste immer leer
   * (Submit geht nur, wenn keine Validierungsfehler vorhanden sind
   * oder wenn keine Validierung durchgeführt wurde).
   * Default ist eine leere Liste.
   */
  @SuppressWarnings("all")
  public void setValidationMessages(final List<ValidationMessageV1> validationMessages) {
    this.validationMessages = validationMessages;
  }

  /**
   * Auswahlliste des Feldes. Nur bei Feldern mit auswählbaren Werten, z.B. {@link FieldTypeV1#CHECKBOX
   * CHECKBOX}, gesetzt. Default ist {@code null}.
   */
  @SuppressWarnings("all")
  public void setPossibleValues(final List<PossibleValueV1> possibleValues) {
    this.possibleValues = possibleValues;
  }

  @SuppressWarnings("all")
  public FormFieldContentV1() {
    this.validationMessages = FormFieldContentV1.$default$validationMessages();
  }

  @SuppressWarnings("all")
  public FormFieldContentV1(final Object value, final List<ValidationMessageV1> validationMessages, final List<PossibleValueV1> possibleValues) {
    this.value = value;
    this.validationMessages = validationMessages;
    this.possibleValues = possibleValues;
  }
}
