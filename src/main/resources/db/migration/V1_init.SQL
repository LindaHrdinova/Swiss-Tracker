CREATE TABLE division
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(25) NOT NULL UNIQUE
);
INSERT INTO division (name)
VALUES ('junior'),
       ('senior'),
       ('master');


CREATE TABLE player
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    player_id   INT          NOT NULL UNIQUE,
    name        VARCHAR(100) NOT NULL,
    birthday    DATE,
    division_id BIGINT       NOT NULL,
    score       INT     DEFAULT 0,
    bye         BOOLEAN DEFAULT FALSE,
    status      ENUM ('ACTIVE', 'DROPPED', 'DISQUALIFIED') DEFAULT 'ACTIVE',
    FOREIGN KEY (division_id) REFERENCES division (id)
);
CREATE INDEX idx_player_division ON player (division_id);

/*
Age Divisions in 2025 Official Competitions:

Junior Division: Born in or after 2013
Senior Division: Born between 2009 and 2012
Masters Division: Born in or before 2008

id IDENTITY PRIMARY KEY
 */
