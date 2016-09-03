CREATE TABLE [dbo].[Country] (
    [id]             INT            NOT NULL,
    [code]           NVARCHAR (2)   NOT NULL,
    [name]           NVARCHAR (50)  NOT NULL,
    [continent]      NVARCHAR (2)   NOT NULL,
    [wikipedia_link] NVARCHAR (128) NULL,
    [keywords]       NVARCHAR (128) NULL, 
    CONSTRAINT [PK_Country] PRIMARY KEY ([id])
);
GO

CREATE UNIQUE INDEX [IX_Country_Code] ON [dbo].[Country] ([code])