INSERT INTO Departments(department_id, department_name) VALUES
( 1, 'Lima'), ( 2, 'Huancavelica'), ( 3, 'Tacna'), 
( 4, 'Cusco'), ( 5, 'Arequipa');

INSERT INTO Districts(district_id, district_name, department_id) VALUES
( 1, 'Ate', 1),
( 2, 'Miraflores', 1),
( 3, 'La Molina', 1),
( 4, 'Lince', 1),
( 5, 'Paltamarca', 2),
( 6, 'Churcampa', 2),
( 7, 'Tarata ', 3),
( 8, 'Basadre', 3),
( 9, 'Acomayo', 4),
( 10, 'Castilla', 5);

INSERT INTO Type_payments(payment_id, payment_name) VALUES
( 1 , 'Efectivo'),
( 2 , 'Trasferencia'),
( 3, 'Yape');

INSERT INTO Categories(category_id, category_name) VALUES
( 1 , 'tuberculos'), ( 2 , 'carnes'), 
( 3, 'frutas'), ( 4, 'vegetales');

INSERT INTO Status(status_id, status_name) VALUES
(1, 'Inicio'),
(2, 'Transcurso'),
(3, 'Llegada');

INSERT INTO Type_shipments(typeShipment_id, typeShipment_name) VALUES
(1, 'Encomienda'),
(2, 'envio privado');

INSERT INTO Producers (producer_id, producer_name,district_id,phone,email) VALUES
(1, 'Juan Perez Morales', 6, '987458129','papita@hotmail.com'),
(2, 'Junior Castillo Zapata',3,'965214785','vege@hotmail.com'),
(3, 'David Gomez Ramirez',9, '946287491','carne@hotmail.com'),
(4, 'Fabricio Villalta Asencios',10,'914682495','zapa@hotmail.com'),
(5, 'Cristian Delgado Uribe', 3, '934156208','lechugon@hotmail.com');

INSERT INTO Comments (comments_id, producer_id) VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);

INSERT INTO Reviews (comments_id, wholesaler_id,review_description,qualification,date) VALUES
(1,1,'buen servicio',4,TO_DATE('24-09-2021', 'DD-MM-YYYY')),
(2,2,'no llego a tiempo el pedido',3,TO_DATE('12-09-2021', 'DD-MM-YYYY')),
(3,3,'buen trato',5,TO_DATE('01-11-2021', 'DD-MM-YYYY')),
(4,4,'la entrega llego dañada',3.5,TO_DATE('04-10-2021', 'DD-MM-YYYY')),
(5,5,'entrega a tiempo',4.5,TO_DATE('25-10-2021', 'DD-MM-YYYY'));

INSERT INTO Products(product_id, producer_id, product_name, product_description, price, category_id) VALUES
(1,1,'Papa amarilla', 'Papas sabrosas', 2.30,1),
(2,2, 'Pepino', 'El mejor pepino', 3.50,4),
(3,3, 'Costillar de res', 'res de alta calidad', 40.5,2),
(4,4,'Zapallo','zapallito bueno', 4.90,4),
(5,5,'Lechuga morada', 'lechuga saludable', 2.50,2);

INSERT INTO Wholesalers (wholesaler_id,wholesaler_name,email,phone,ruc,district_id) VALUES
(1, 'Diego Davila Caceres','Mayorista@hotmail.com',943922161,28055475113,3 ),
(2, 'Alfonso Garcia Jimenez','Alfonso@hotmail.com',937890212,20240320637,1),
(3, 'Pablo Alcantara Sanchez','Pablito@hotmail.com',912567309,27037853912, 4 ),
(4, 'Anderson Quispe Rosio','fulanito@hotmail.com',976591745,28970649424,7);
(5, 'Maria Chavez Quiroz','fulanito@hotmail.com',976523435,28970662652,2);

INSERT INTO Orders(order_id,wholesaler_id,amount,payment_id,date) VALUES
(1,1,40,1,TO_DATE('24-09-2021', 'DD-MM-YYYY')),
(2,2,50,2,TO_DATE('12-09-2021', 'DD-MM-YYYY')),
(3,3,45,1,TO_DATE('01-11-2021', 'DD-MM-YYYY')),
(4,4,60,3,TO_DATE('04-10-2021', 'DD-MM-YYYY')),
(5,5,70,2,TO_DATE('25-10-2021', 'DD-MM-YYYY'));

INSERT INTO Details(product_id,producer_id,order_id,quantity,unit_Price) VALUES
(1,1,1,20,2),
(2,2,2,25,2),
(3,3,3,15,3),
(4,4,4,20,3),
(5,5,5,35,2);

INSERT INTO Shipments(shipment_id,date,address,typeShipping_id) VALUES
(1,TO_DATE('24-09-2021', 'DD-MM-YYYY'),'jr. Unión 1010',1),
(2,TO_DATE('12-09-2021', 'DD-MM-YYYY'),'av. siempreviva',2),
(3,TO_DATE('01-11-2021', 'DD-MM-YYYY'),'av. universitaria',2),
(4,TO_DATE('04-10-2021', 'DD-MM-YYYY'),'jr. lima',1),
(5,TO_DATE('25-10-2021', 'DD-MM-YYYY'),'av. grau',1);

INSERT INTO Shipment_status(status_id,shipment_id,dateStar,dateEnd) VALUES
(1,1,TO_DATE('24-09-2021', 'DD-MM-YYYY'),TO_DATE('26-09-2021', 'DD-MM-YYYY')),
(2,2,TO_DATE('12-09-2021', 'DD-MM-YYYY'),TO_DATE('14-09-2021', 'DD-MM-YYYY')),
(3,3,TO_DATE('01-11-2021', 'DD-MM-YYYY'),TO_DATE('03-11-2021', 'DD-MM-YYYY')),
(1,4,TO_DATE('04-10-2021', 'DD-MM-YYYY'),TO_DATE('06-10-2021', 'DD-MM-YYYY')),
(2,5,TO_DATE('25-10-2021', 'DD-MM-YYYY'),TO_DATE('30-10-2021', 'DD-MM-YYYY'));
