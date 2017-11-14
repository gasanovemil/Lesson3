package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;

public class GiftNalog extends Nalog {

    private double gift_percent = 0.09;


    @Override
    public double CalcNalog(double dohod) {
        return dohod * gift_percent;
    }
}