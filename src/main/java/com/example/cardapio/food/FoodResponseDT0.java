package com.example.cardapio.food;

public record FoodResponseDT0(Long id, String title, String image, Integer price) {
    public FoodResponseDT0(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
    