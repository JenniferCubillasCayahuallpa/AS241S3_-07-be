INSERT INTO Programs (ProgramName)
VALUES ('Análisis de Sistemas'), ('Producción Agraria');

INSERT INTO Locations (Department, Province, District)
VALUES 
('Lima', 'Cañete', 'Imperial'),
('Lima', 'Cañete', 'San Vicente'),
('Lima', 'Huaral', 'Huaral'),
('Lima', 'Huaral', 'Chancay'),
('Lima', 'Lima', 'San Isidro'),
('Lima', 'Lima', 'Miraflores');

INSERT INTO Students (DNI, FirstName, LastName, BirthDate, Gender, Email, Phone, Address, ProgramID, LocationID)
VALUES 
('12345678', 'María', 'Flores López', '2003-06-10', 'F', 'maria@mail.com', '987654321', 'Av. Las Flores 123', 1, 1),
('87654321', 'José', 'Ramírez Díaz', '2002-11-25', 'M', 'jose@mail.com', '912345678', 'Jr. Lima 456', 2, 2);
