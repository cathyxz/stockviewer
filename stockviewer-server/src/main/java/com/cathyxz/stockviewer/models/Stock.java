package com.cathyxz.stockviewer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.Objects;

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ticker", nullable = false)
    private String ticker;

    @Column(name = "companyName", nullable = false)
    private String companyName;

    @Column(name = "ipoYear", nullable = false)
    private int ipoYear;

    @Column(name = "sector", nullable = true)
    private String sector;

    @Column(name = "industry", nullable = true)
    private String industry;

    public Stock() {

    }

    public Stock(long id, String ticker, String companyName, int ipoYear, String sector, String industry) {
        this.id = id;
        this.ticker = ticker;
        this.companyName = companyName;
        this.ipoYear = ipoYear;
        this.sector = sector;
        this.industry = industry;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getIpoYear() {
        return ipoYear;
    }

    public void setIpoYear(int ipoYear) {
        this.ipoYear = ipoYear;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Stock)) return false;
        if (!super.equals(object)) return false;

        Stock stock = (Stock) object;

        if (getId() != stock.getId()) return false;
        if (!getTicker().equals(stock.getTicker())) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getTicker().hashCode();
        return result;
    }
}