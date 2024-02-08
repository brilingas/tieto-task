create table items
(
    id       serial,
    name     varchar(50),
    season   varchar(50),
    distance numeric(5, 2)
);

alter table items
    owner to postgres;

create unique index items_id_uindex
    on items (id);

INSERT INTO items (id, name, season, distance) VALUES
(DEFAULT, 'Water', 'all', 1.00),
(DEFAULT, 'Food', 'all', 1.00),
(DEFAULT, 'Cuttlery', 'all', 1.00),
(DEFAULT, 'First Aid Kit', 'all', 1.00),
(DEFAULT, 'Knife', 'all', 1.00),
(DEFAULT, 'Powerbank', 'all', 1.00),
(DEFAULT, 'Flashlight', 'all', 1.00),
(DEFAULT, 'Hatchet', 'all', 1.00),
(DEFAULT, 'Matches', 'all', 1.00),
(DEFAULT, 'Rope', 'all', 1.00),
(DEFAULT, 'Headwear', 'all', 1.00),

(DEFAULT, 'Tent', 'all', 20.00),
(DEFAULT, 'Toiletries', 'all', 20.00),
(DEFAULT, 'Underwear', 'all', 20.00),
(DEFAULT, 'Sleeping Bag', 'all', 20.00),

(DEFAULT, 'Tea', 'winter', 1.00),
(DEFAULT, 'Warm socks', 'winter', 1.00),

(DEFAULT, 'Rainwear', 'spring', 1.00),

(DEFAULT, 'Sunscreen', 'summer', 1.00),
(DEFAULT, 'Bug spray', 'summer', 1.00),
(DEFAULT, 'Rainwear', 'summer', 1.00),

(DEFAULT, 'Rainwear', 'autumn', 1.00)
;