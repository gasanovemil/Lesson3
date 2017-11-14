package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;



public class DopNalog extends Nalog {
    private double dop_percent = 0.08;

    @Override
    public double CalcNalog(double dohod) {

        return dohod * dop_percent;
    }

}
