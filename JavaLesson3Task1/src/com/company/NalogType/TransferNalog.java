package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;

public class TransferNalog extends Nalog {
    private double trans_percent = 0.12;
    @Override
    public double CalcNalog(double dohod) {
        return dohod * trans_percent;
    }
}