package com.example.DemoCrawl.entity;

import java.util.Map;

public class Product {
    private String id;
    private String title;
    private String price;
    private String imgUrl;
    private String condition;
    private String cardSize;
    private String set;
    private String character;
    private String rarity;
    private String game;
    private String language;
    private String manufacturer;
    private String stage;
    private String features;
    private String cardNumber;
    private String cardType;
    private String country;
    private String finish;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCardSize() {
        return cardSize;
    }

    public void setCardSize(String cardSize) {
        this.cardSize = cardSize;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getManufacture() {
        return manufacturer;
    }

    public void setManufacture(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", condition='" + condition + '\'' +
                ", cardSize='" + cardSize + '\'' +
                ", set='" + set + '\'' +
                ", character='" + character + '\'' +
                ", rarity='" + rarity + '\'' +
                ", game='" + game + '\'' +
                ", language='" + language + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", stage='" + stage + '\'' +
                ", features='" + features + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardType='" + cardType + '\'' +
                ", country='" + country + '\'' +
                ", finish='" + finish + '\'' +
                '}';
    }
}
