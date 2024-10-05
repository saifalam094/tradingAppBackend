package com.zosh.modal;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Watchlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    @OneToOne
    private  User user;
    @ManyToMany
    private List<Coin> coins=new ArrayList<>();
}
