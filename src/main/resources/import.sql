INSERT INTO institutions(name, description)
VALUES ('Dbam o Zdrowie', 'Pomoc dzieciom z ubogich rodzin'),
       ('A kogo', 'Pomoc wybudzaniu dzieci ze śpiączki'),
       ('Dla dzieci', 'Pomoc osobom znajdującym się w trudnej sytuacji życiowej'),
       ('Bez domu', 'Pomoc dla osób nie posiadających miejsca zamieszkania'),
       ('Test', 'Sprawdźmy, czy poprawnie wyświetli się nieparzysta liczba instytucji');
#        ('Test 2', 'A jak ze zmieszczeniem się tej?');

INSERT INTO categories(name)
VALUES ('ubrania'),
       ('zabawki'),
       ('chemia gospodarcza'),
       ('środki higieniczne'),
       ('jedzenie');

INSERT INTO donations(city, street, zip_code, quantity, institution_id)
VALUES ('Wrocław', 'Wrocławska', '12-345', 5, 1),
       ('Warszawa', 'Warszawska', '23-456', 10, 2),
       ('Poznań', 'Poznańska', '34-567', 2, 3),
       ('Gniezno', 'Gnieźnieńska', '45-678', 5, 4);

INSERT INTO donations_categories
VALUES (1, 1),
       (1, 5),
       (2, 3),
       (3, 2),
       (3, 4),
       (3, 1),
       (4, 5);