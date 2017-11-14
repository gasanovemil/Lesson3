package com.company.NalogType;

import com.company.SumOfNalogs.Nalog;



public class AuthorNalog extends Nalog {

    private double aut_percent = 0.06;
    @Override
    public double CalcNalog(double dohod)  {



        return dohod * aut_percent;
    }

}