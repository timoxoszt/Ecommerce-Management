package com.likelion.ecommerce.service;

import com.likelion.ecommerce.model.Card_item;

public interface CardService {
    void listCard();
    int storeCard(Card_item card_item);
    int updateCard(Card_item customer);
    int deleteCard(long id);
    Card_item showCard(long id);
}
