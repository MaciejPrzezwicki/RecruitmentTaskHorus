package com.company;

import java.util.List;

public interface Structure {
    // zwraca dowolny element o podanym kolorze
    CompositeBlock findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
