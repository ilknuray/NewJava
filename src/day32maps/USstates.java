package day32maps;

import java.util.Arrays;

public enum USstates {

    ALABAMA("alabama", "al"),
    ALASKA("alaska","ak");

    private final String stateName;
    private final  String kisaltma;

    USstates(String stateName, String kisaltma) {
        this.stateName = stateName;
        this.kisaltma = kisaltma;
    }

    public String getStateName() {
        return stateName;
    }

    public String getKisaltma() {
        return kisaltma;
    }

    public String getStateNameFromKisaltma(String kisaltma){
      return   Arrays.stream(values()).filter(USstates->getKisaltma().equals(kisaltma)).findFirst().get().getStateName();
    }
}
