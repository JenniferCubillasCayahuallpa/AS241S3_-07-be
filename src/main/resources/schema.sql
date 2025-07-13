
CREATE TABLE Programs (
    ProgramID INT PRIMARY KEY IDENTITY(1,1),
    ProgramName VARCHAR(100) NOT NULL
);

CREATE TABLE Locations (
    LocationID INT PRIMARY KEY IDENTITY(1,1),
    Department VARCHAR(50) NOT NULL,
    Province VARCHAR(50) NOT NULL,
    District VARCHAR(50) NOT NULL
);

CREATE TABLE Students (
    StudentID INT PRIMARY KEY IDENTITY(1,1),
    DNI CHAR(8) NOT NULL UNIQUE,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    BirthDate DATE NOT NULL,
    Gender CHAR(1) CHECK (Gender IN ('M', 'F')) NOT NULL,
    Email VARCHAR(100),
    Phone CHAR(9),
    Address VARCHAR(200),
    RegistrationDate DATETIME DEFAULT GETDATE(),
    Status CHAR(1) DEFAULT 'A' CHECK (Status IN ('A', 'I')) NOT NULL,
    ProgramID INT NOT NULL,
    LocationID INT NOT NULL,
    FOREIGN KEY (ProgramID) REFERENCES Programs(ProgramID),
    FOREIGN KEY (LocationID) REFERENCES Locations(LocationID)
);