import psyscopg2
import js

conn = psycopg2.connect("dbname=inventory_rg64 user=postgres password=webs")
current = conn.cursor

with open('server.js', 'r') as file:
    data = js.load(file)

for item in data:
    current.execute("INSERT INTO inventory_rg64 (id, booktype, bookname) VALUES (%s, %s, %s)")