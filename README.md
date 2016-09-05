# Airports
Demonstrating various software construction tools &amp; technologies - bound by a common theme...

# Introduction

In the instructions below, <git_root> refers to the path that you cloned this repo to

# Building *.NET* Components

## Requirements

* Visual Studio 2015 Community Edition (TODO: Link)
* SQL Server 2016 Express (https://www.microsoft.com/en-gb/download/details.aspx?id=52679)
..* Install SQLEXPRESS instance (not LocalDb)
* SQL Server Data Tools for Visual Studio 2015 (https://msdn.microsoft.com/en-us/mt186501.aspx)

## Setup

* TODO

# Building *Java* Components

## Requirements

* Eclipse IDE (I'm using Mars) (TODO: Link)
* Git (TODO: Link)
* Maven 2 (TODO: Link, and explain <git_root>\Java\airports\mvnw.cmd)
* JDBC Driver for SQL Server (TODO: Link)

## Setup

* SQL Server JDBC Driver 
..* Integrated security requires *sqljdbc_auth.dll*
..* Location is identified by the JVM property java.library.path
..* This argument is set in <git_root>\Java\airports\pom.xml
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.9</version>
        <configuration>
            <!-- TODO: Figure out a portable way of doing this -->
            <argLine>-Djava.library.path="D:\Dev\.tools\jdbc\sqljdbc_4.0\auth\x86"</argLine>
        </configuration>
    </plugin>
..* You'll also need to set it in Eclipse if you run JUnit tests from there.  Windows | Preferences | Java | Installed JREs | <select JRE> | Edit...
