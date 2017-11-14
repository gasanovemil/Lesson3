package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;

public class MainJobNalog extends Nalog {
    private double percent = 0.1;

    @Override
    public double CalcNalog(double dohod) {
        return dohod * percent;
    }

}
