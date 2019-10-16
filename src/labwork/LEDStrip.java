package labwork;

public class LEDStrip {
   private int lengthOfStrip(){
       return this.leds.length;
   }
   private int numberOfDefectiveLEDs(){
       int counter=0;
       for (int i=0;i<lengthOfStrip();i++){
           if(!leds[i].isWorking()){
               counter++;
           }
       }
       return counter;
   }
   private boolean isStripDefective(){
       return numberOfDefectiveLEDs()>lengthOfStrip()/2;

   }
   public String stripStatus(){
       return isStripDefective()? "This strip is defective.":"This strip is not defective.";

   }
   private LED[] leds;
   public LEDStrip(LED[] leds ){
       this.leds=leds;
   }

    public LED[] getLeds() {
        return leds;
    }

    public void setLeds(LED[] leds) {
        this.leds = leds;
    }
}
