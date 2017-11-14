package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;

public class ProdashaImush extends Nalog {

    private double prod_percent;

    {
        prod_percent = 1.11;
    }

    @Override
    public double CalcNalog(double dohod) {
        return dohod * prod_percent;
    }
}
