package main.java.com.wellsfargo.counselor.entity;

import javax.annotation.processing.Generated;
import javax.swing.event.PopupMenuEvent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Portofolio {
    
    @Id
    @GeneratedValue()
    private long portofolioId;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    protected Portofolio() {

    }

    public Portofolio(String name) {
        this.name = name;
    }

    public Long getPortfolioId() {
        return portofolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}