import requests
from bs4 import BeautifulSoup
import json


def getData():
    path = "https://www.ebay.com/itm/"
    id = input("Enter product ID: ")
    URL = path + id
    response = requests.get(URL)
    if response.status_code == 200:
        soup = BeautifulSoup(response.content, 'html.parser')
        product_data = {}
        product_data['id'] = id
        # Extracting price
        price = soup.find('div', class_='x-price-primary')
        if price:
            price_text = price.span.text.strip()
            product_data['price'] = price_text

        # Extracting image URL
        img = soup.find('div', class_='ux-image-carousel-item')
        if img:
            img_tag = img.find('img')
            if img_tag and 'src' in img_tag.attrs:
                img_url = img_tag['src']
                product_data['imgUrl'] = img_url
            else:
                product_data['imgUrl'] = None
        else:
            product_data['imgUrl'] = None

        # Extracting product information
        info_div = soup.find('div', class_='ux-layout-section-evo__item ux-layout-section-evo__item--table-view')
        if info_div:
            spans = info_div.find_all('span', class_='ux-textspans')
            for span in spans:
                span_text = span.text.strip()
                if "Condition" in span_text:
                    product_data['title'] = span.find_next('span').text.strip()
                elif "Card Size" in span_text:
                    product_data['cardSize'] = span.find_next('span').text.strip()
                elif "Set" in span_text:
                    product_data['set'] = span.find_next('span').text.strip()
                elif "Character" in span_text:
                    product_data['character'] = span.find_next('span').text.strip()
                elif "Rarity" in span_text:
                    product_data['rarity'] = span.find_next('span').text.strip()
                elif "Game" in span_text:
                    product_data['game'] = span.find_next('span').text.strip()
                elif "Language" in span_text:
                    product_data['language'] = span.find_next('span').text.strip()
                elif "Card Name" in span_text:
                    product_data['cardName'] = span.find_next('span').text.strip()
                elif "Manufacturer" in span_text:
                    product_data['manufacture'] = span.find_next('span').text.strip()
                elif "Stage" in span_text:
                    product_data['stage'] = span.find_next('span').text.strip()
                elif "Features" in span_text:
                    product_data['features'] = span.find_next('span').text.strip()
                elif "Card Number" in span_text:
                    product_data['cardNumber'] = span.find_next('span').text.strip()
                elif "Card Type" in span_text:
                    product_data['cardType'] = span.find_next('span').text.strip()
                elif "Country/Region of Manufacture" in span_text:
                    product_data['country'] = span.find_next('span').text.strip()
                elif "Finish" in span_text:
                    product_data['finish'] = span.find_next('span').text.strip()
    return json.dumps(product_data, indent=4)

def sendProductData():
    product_data = getData()
    endpoint_url = 'http://localhost:8080/product/create'
    headers = {'Content-Type': 'application/json'}
    response = requests.post(endpoint_url, data=product_data, headers=headers)
    if response.status_code == 200:
        print("Product data sent successfully!")
    else:
        print("Failed to send product data. Status code:", response.status_code)
        

sendProductData()
flag = 0
while flag==0:
    sendProductData()
    print("Choose: 0 to continue\n1 to exit")
    flag = int(input())
    while flag!=1 and flag !=0:
        print("Choose: 0 to continue\n1 to exit")
        flag = int(input())
        