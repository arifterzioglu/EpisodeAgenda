# EpisodeAgenda
My first Java and coding Desktop Application that allows user to create their own TV series schedule and get information about them such as casts, info, IMDB points and etc. 

This application was our and my first coding experience with JAVA fully 3 years ago (2015). My job in this project was that creating database classes and structure, make a connection of front end and back end services and parsing the XML structure that comes from OMDB API  as a response. Our application was working through OMDB online api. Due to API changes, application may not be working right now.
For underlying ideas and comphresenhive information of how we started this project as a group, you can check the reports.
Episode Agenda readme

Aim of the project:


TV series play a significant role in today’s entertainment world.
People are trying to keep up with numerous series at the same time. 
This causes an important problem such as remembering the dates and the hours of the upcoming episodes,
being annoyed because of the spoilers.
Our goal is to find a solution for these problems in an intuitive way.
For this project, it is planned to make an editable agenda so that the user can select their TV shows and the upcoming cinema films. 
This program will provide a user-friendly menu for the user to either accessing their own agenda or a list to select the current TV series, 
upcoming movies that they are looking forward to watch in the future. 
The agenda will have a design similar to a regular calendar. 
However, the dates on this calendar will function as a buttons and lead the user to a new page which shows the relevant information
about the episode that is coming out such as its plot, characters, trailers, teasers and etc. 
In this page the user will be able to access the videos regarding the shows via links.


Requirements for the Program


The program needs a database to run on.We include this database by the SQLite. In here we stored the links to the related tv shows such as their
homepage in the IMDB database and the related links of the episodes as well. In addition there were some images used in the program that were included
in an external source folder. These images are the posters of the series. So these files must be stored according to the path that they were declared in the
SeriesPanel page. 


Our program includes 4 different versions till now.
v.1.0 includes the necessary codes for extracting the information from the database and displaying them on the console
v.1.1 has changed the core of the database part by making it online. Previously the database was offline and the information was entered manually.
Now the links are stored in the database and an algorithm is constructed which takes the information from the websites and puts them on display.
v.1.2 Here the program includes some of the gui such as the menu on the left of the panel and the top rated which is on the right side of the panel.
v.1.3 Now the gui includes the favorites and the series parts.


What we have aimed but not accomplished:

- details page for each episode,

- a fully functional calendar,

- a fully functional alarm system,

- some connection issues between database and the program remained unsolved.



The current status of the program:

- The database is expandable, meaning that new information can be added through the running program.

- The GUI of the program is functional and user-friendly.

- The logIn or signIn page on the other hand, is fully complete.

