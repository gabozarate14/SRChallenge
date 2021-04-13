package com.gzarate;

public class Main {

    public static void main(String[] args) {

        //Se simula la inserción de textos en la web

        Website website = new Website();

        //Primero haciendo uso de css

        website.sendText("myName", "css", "input[name='user-submitted-name']", "John Doe");
        website.sendText("myEmail", "css", "input[name='user-submitted-email']", "john@doe.com");
        website.sendText("myTitle", "css",
                "input[name='user-submitted-title']", "Prisma - Al that turns your photos into artwork in seconds");
        website.sendText("myUrl", "css", "input[name='user-submitted-url[]']", "https://www.prisma.org");
        website.sendText("myDescription", "css",
                "input[name='user-submitted-content']", "Prisma is an app that turns your photos into artwork in seconds ");

        //Segundo haciendo uso name
        website.sendText("myName", "name", "user-submitted-name", "John Doe");
        website.sendText("myEmail", "name", "user-submitted-email", "john@doe.com");
        website.sendText("myTitle", "name",
                "user-submitted-title", "Prisma - Al that turns your photos into artwork in seconds");
        website.sendText("myUrl", "name", "user-submitted-url[]", "https://www.prisma.org");
        website.sendText("myDescription", "name",
                "user-submitted-content", "Prisma is an app that turns your photos into artwork in seconds ");

        //Tercero haciendo uso de xpath

        website.sendText("myName", "xpath", "//input[@name='user-submitted-name']", "John Doe");
        website.sendText("myEmail", "xpath", "//input[@name='user-submitted-email']", "john@doe.com");
        website.sendText("myTitle", "xpath",
                "//input[@name='user-submitted-title']", "Prisma - Al that turns your photos into artwork in seconds");
        website.sendText("myUrl", "xpath", "//input[@name='user-submitted-url[]']", "https://www.prisma.org");
        website.sendText("myDescription", "xpath",
                "//input[@name='user-submitted-content']", "Prisma is an app that turns your photos into artwork in seconds ");

    }
}
