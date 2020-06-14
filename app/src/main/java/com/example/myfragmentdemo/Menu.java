package com.example.myfragmentdemo;

public class Menu {

    private String name;
    private String description;

    public static final Menu[] menus = {
      new Menu("Breakfast", "2 whole eggs\n! toast bread\nCoffee"),
      new Menu("Lunch","3 chapatis\nVegetable"),
      new Menu("Dinner","Rice\nPotato Roast\nCake")
    };

private Menu(String name, String description)
        {
            this.name=name;
            this.description= description;
        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
