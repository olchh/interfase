package com.company;
// Создать интерфейс "Товар" с методами, работающие с названием товара, ценой, рейтингом.
//Создать три класса, реализующие интерфейс "Товар"
//Создать по одному экземпляру классов
//Создать интерфейс "Пользователь"с методами, работающие с логином и паролем
//Создать три класса реализующий интерфейс "Пользователь" и объект класса
//Создать класс, реализующий одновременно интерфейс "Товар" и "Пользователь". В этом классе создать метод выводящий сообщение, что такой-то пользователь купил такой-то товар. Создать экземпляр этого класса.

import java.util.Scanner;

public class Main {
    interface Product{
        void nameProduct();
        void priceProduct(); //цена
        void ratingProduct(); //рейтинг
        void uniteProduct(); //обьединение методов
    }
    interface User{
        void login();
        void password();
    }

    static class user1 implements Product, User{
        String name;
        String price;
        String rating;
        public String login = "user_rr";
        String password = "0987";
        user1(String name, String price, String rating){
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

            public void nameProduct() {
                System.out.println("имя продукта: "+name);
            }

            public void priceProduct() {
                System.out.println("цена продукта: "+price);
            }

            public void ratingProduct() {
                System.out.println("рейтинг продукта: "+rating);
            }

            public void login() {
            System.out.println("" + login);
            }

            public void password() {
            System.out.println("" + password);
            }
            public void uniteProduct(){
            login(); password();
            System.out.println("в корзине:");
            nameProduct(); priceProduct(); ratingProduct();
            }
        }

    static class user2 implements Product, User{
        String name;
        String price;
        String rating;
        String login = "user_pp";
        String password = "09876";
        user2(String name, String price, String rating){
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public void nameProduct() {
            System.out.println("имя продукта: "+name);
        }

        public void priceProduct() {
            System.out.println("цена продукта: "+price);
        }

        public void ratingProduct() {
            System.out.println("рейтинг продукта: "+rating);
        }

        public void login() {
            System.out.println("" + login);
        }

        public void password() {
            System.out.println("" + password);
        }
        public void uniteProduct(){
            login(); password();
            System.out.println("в корзине:");
            nameProduct(); priceProduct(); ratingProduct();
        }
    }

    static class user3 implements Product, User{
        String name;
        String price;
        String rating;
        String login = "user_kk";
        String password = "098765";
        user3(String name, String price, String rating){
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public void nameProduct() {
            System.out.println("имя продукта: "+name);
        }

        public void priceProduct() {
            System.out.println("цена продукта: "+price);
        }

        public void ratingProduct() {
            System.out.println("рейтинг продукта: "+rating);
        }

        public void login() {
            System.out.println("" + login);
        }

        public void password() {
            System.out.println("" + password);
        }
        public void uniteProduct(){
            login(); password();
            System.out.println("в корзине:");
            nameProduct(); priceProduct(); ratingProduct();
        }
    }






    public static void main(String[] args) {
        user1 rr = new user1("цветочек", "135", "9.0");
        rr.uniteProduct();
        System.out.println("\n");

        user2 ww = new user2("туалетная бумага с облачками", "250", "10.0");
        ww.uniteProduct();
        System.out.println("\n");

        user3 hh = new user3("антибактериальное средство", "300", "8.0");
        hh.uniteProduct();
    }
}
