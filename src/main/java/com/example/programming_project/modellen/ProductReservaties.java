package com.example.programming_project.modellen;

import jakarta.persistence.*;

import jakarta.persistence.*;

@Entity
@IdClass(ProductReservatiesId.class)
public class ProductReservaties {

    @Id
    @ManyToOne
    @JoinColumn(name = "Productnr", referencedColumnName = "Productid")
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "Reservatienr", referencedColumnName = "Reservatienr")
    private Reservatie reservatie;

    protected ProductReservaties(){}

    public ProductReservaties(Product product, Reservatie reservatie) {
        this.product = product;
        this.reservatie = reservatie;
    }

    @Override
    public String toString() {
        return "ProductReservaties{" +
                "product=" + product +
                ", reservatie=" + reservatie +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Reservatie getReservatie() {
        return reservatie;
    }

    public void setReservatie(Reservatie reservatie) {
        this.reservatie = reservatie;
    }
}
