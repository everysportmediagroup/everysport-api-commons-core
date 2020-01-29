package com.everysport.api.domain.api;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private Float N;
    private Float E;

    public Float getN() {
        return N;
    }

    public void setN(Float n) {
        N = n;
    }

    public Float getE() {
        return E;
    }

    public void setE(Float e) {
        E = e;
    }
}
