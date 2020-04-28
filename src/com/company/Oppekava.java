package com.company;

import java.util.Arrays;

public class Oppekava {

    private String oppekavaKood;
    private Aine [] ained;

    public Oppekava(String oppekavaKood, Aine[] ained) {
        this.oppekavaKood = oppekavaKood;
        this.ained = ained;
    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public String getAined() {
        return Arrays.toString(ained);
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }

    @Override
    public String toString() {
        return "Oppekava{" +
                "oppekavaKood='" + oppekavaKood + '\'' +
                ", ained=" + Arrays.toString(ained) +
                '}';
    }
}
