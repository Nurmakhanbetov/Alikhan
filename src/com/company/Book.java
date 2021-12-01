package com.company;

abstract class Book implements Publication {
    public void book_author() {
        System.out.println("Alikhan");
    }
    @Override public void publication_name() {
        System.out.println("ENU");
    }
    @Override public void publication_year() {
        System.out.println("2021");
    }
}
