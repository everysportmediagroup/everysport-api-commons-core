package com.everysport.api.domain.api;

import java.io.Serializable;
import java.util.Date;

public class CurrentPeriod implements Serializable
{
    private Date periodStart;
    private Integer period;
    private CurrentPeriodType periodType;

    public Date getPeriodStart()
    {
        return periodStart;
    }

    public void setPeriodStart(Date periodStart)
    {
        this.periodStart = periodStart;
    }

    public Integer getPeriod()
    {
        return period;
    }

    public void setPeriod(Integer period)
    {
        this.period = period;
    }

    public CurrentPeriodType getPeriodType()
    {
        return periodType;
    }

    public void setPeriodType(CurrentPeriodType periodType)
    {
        this.periodType = periodType;
    }
}