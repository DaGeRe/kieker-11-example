package de.kiekertest2;

public class FinalFieldConstructorExample {
   
   private final Integer parameters;

   /**
    * Erzeugt eine neue ImportTimerowHandler-Instanz, setzt ID und GAMSParametersJSON.
    *
    * @param id Die ID des ImportTimerowHandlers
    * @param parameters Die GAMS-Daten
    */
   public FinalFieldConstructorExample(int parameters) {
      this.parameters = new Integer(parameters);
   }
   
   public Integer getParameters() {
      return parameters;
   }
   
}
