package com.example.demo6;

public class restu extends org{
        int Food_sold_per_day ;
        int price;
        restu(String name, String id, int Food, int price){
            super(name, id);
            this.Food_sold_per_day=Food;
            this.price=price;
        }

    @Override
        int calc_income() {
           return Food_sold_per_day*price;
        }
    }

