CREATE TABLE gildra_data.gildra_players
(
    id      bigserial      NOT NULL,
    name    varchar(255)   NOT NULL
);

ALTER TABLE IF EXISTS gildra_data.gildra_players
    OWNER to apl_gildra;

GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE gildra_data.gildra_players TO exe_gildra;

INSERT INTO gildra_data.gildra_players (name)
VALUES ('EL PENAS');

INSERT INTO gildra_data.gildra_players (name)
VALUES ('RODRIGO CANSADO');