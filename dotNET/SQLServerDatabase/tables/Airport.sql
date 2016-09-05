CREATE TABLE [dbo].[Airport] (
    [id]                INT NOT NULL,
    [ident]             NVARCHAR (10)      NOT NULL,
    [type]              NVARCHAR (15)     NOT NULL,
    [name]              NVARCHAR (100)    NOT NULL,
    [latitude_deg]      DECIMAL (28, 20) NOT NULL,
    [longitude_deg]     DECIMAL (28, 20) NOT NULL,
    [elevation_ft]      INT              NOT NULL,
    [continent]         NVARCHAR (2)      NOT NULL,
    [iso_country]       NVARCHAR (2)      NOT NULL,
    [iso_region]        NVARCHAR (7)      NOT NULL,
    [municipality]      NVARCHAR (100)    NOT NULL,
    [scheduled_service] BIT              NOT NULL,
    [gps_code]          NVARCHAR (10)      NULL,
    [iata_code]         NVARCHAR (3)     NULL,
    [local_code]        NVARCHAR (10)      NULL,
    [home_link]         NVARCHAR (128)   NULL,
    [wikipedia_link]    NVARCHAR (128)   NULL,
    [keywords]          NVARCHAR (256)   NULL, 
    CONSTRAINT [PK_Airport] PRIMARY KEY ([id]), 
    CONSTRAINT [FK_Airport_Country] FOREIGN KEY ([iso_country]) REFERENCES [Country]([code])
);

