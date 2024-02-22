package org.example;

import org.example.Class.ShoppingCartService;
import org.example.Class.UserService;
import org.example.Class.Version;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(Version.getInstance());
        ShoppingCartService shoppingCartService = new ShoppingCartService(Version.getInstance());
        System.out.println("version user: "+ userService.getVersion().toString());
        System.out.println("version shopping cart service: "+shoppingCartService.getVersion().toString());

    }
}