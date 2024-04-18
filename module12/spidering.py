import scrapy

class Spiderman(scrapy.Spider):
    name = 'Spiderman'
    url = http://localhost:8000/index.html


def parse(self, response):
    for quotes in response.css('div.quote'):
        yield{
            'text': quotes.css('span small.author::text').get(),
            'author': quotes.css('span small.author::text').get(),
            'tags': quotes.css('div.tags a.tag::text').getall(),
        }

nextpage = response.css('li.next a::attr(href)')