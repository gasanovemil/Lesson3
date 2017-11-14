package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;

public class BenefitNalog extends Nalog {

    private double ben_percent = 0.07;

    @Override
    public double CalcNalog(double dohod) {
        return dohod * ben_percent;
    }
}