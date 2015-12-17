USE museum;

INSERT INTO schedule(dateTimeSchedule)
VALUES ('2015-01-01 09:00'),
		('2015-01-01 11:00'),
        ('2015-01-01 13:00'),
        ('2015-01-01 15:00'),
        ('2015-01-01 17:00'),
        ('2015-01-01 19:00'),
        ('2015-01-02 09:00'),
		('2015-01-02 11:00'),
        ('2015-01-02 13:00'),
        ('2015-01-02 15:00'),
        ('2015-01-02 17:00'),	
        ('2015-01-02 19:00'),
        ('2015-01-03 09:00'),
		('2015-01-03 11:00'),
        ('2015-01-03 13:00'),
        ('2015-01-03 15:00'),
        ('2015-01-03 17:00'),
        ('2015-01-03 19:00');
        
INSERT INTO Worker (NameWorker, Salary, Position)
VALUES ('Roger Waters', 25555, 'Guide'),
		('David Gilmore', 25655, 'Guide'),
		('Robert Plant', 4732, 'Guirdian'),
		('Rory C', 7777, 'Guide'),
		('Chris Button', 6000, 'Guide'),
		('Tommy Morello', 6500, 'Guide'),
		('Mick Jagger', 18000, 'Janitor'),
		('Bucket', 2000, 'Tube Cleaner');
        
INSERT INTO Schedule_Worker (Id_Worker, Id_Schedule)
        VALUES (5,1),
        (1,2),
        (2,3),
        (4,4),
        (5,5),
        (1,6),
        (2,7),
        (4,8),
        (5,9),
        (5,10),
        (1,11),
        (2,12),
        (4,13),
        (5,14),
        (1,15),
        (2,16),
        (4,17),
        (5,18);
        
INSERT INTO Excursion (NameExcursion, Duration) 
VALUES ('Without Fight','1:30'),
		('Bloom','1:00'), 
        ('The Wall','1:45'),
        ('Bogedita','1:30'),
		('Winter','1:00'), 
        ('Autumn','1:45');
        
INSERT INTO Excursion_Schedule (Id_Excursion, Id_Schedule)
        VALUES (1,1),
        (2,2),
        (3,3),
        (4,4),
        (5,5),
        (6,6),
        (1,7),
        (2,8),
        (3,9),
        (4,10),
        (5,11),
        (6,12),
        (1,13),
        (2,14),
        (3,15),
        (4,16),
        (5,17),
        (6,18);
               
INSERT INTO Author (NameAuthor)
VALUES ('Rembrant'),
		('Leonardo'),
		('Mikelandgelo'),
		('Donatello'),
		('Rafael');
        
INSERT INTO Hall (NameHall, worker_Id)
VALUES ('First New York', 3),
		('Union Station Hall', 7),
		('Pinchuk Art Center', 3);

INSERT INTO Showpiece (NameShowpiece, DateIncome, Materials, Technics, hall_Id, author_Id) 
VALUES ('Shine on You Crazy Diamond', '2015-01-01 00:00', 'Oil', 'New', 1, 1), 
	('Another Brick in the Wall', '2015-02-02 00:00', 'Paint', 'Old School', 2, 2),
	('Welcome to Machine','2015-03-03 00:00', 'Fabric', 'Old Fashioned', 3, 3),
    ('Cluster One', '2015-04-04 00:00', 'Plastiline', 'Post modern', 3, 1),
    ('Time', '2015-05-05 00:00', 'Pensil', 'Neo Classic', 1, 1),
	('Money', '2015-06-06 00:00', 'Pen', 'Barrocco', 1, 3),
    ('Comfortumbly Numb', '2015-07-07 00:00', 'Ink bow', 'Avantgarde', 1, 2),
    ('Marooned', '2015-09-09 00:00', 'Oil', 'Neo Classic', 3, 2),
    ('Endless River', '2015-10-10 00:00', 'Paint', 'Post Modern', 2, 2),
    ('Have a Cigar', '2015-11-11 00:00', 'Brush', 'New School', 1, 2);