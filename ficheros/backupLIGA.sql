-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: liga
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipos` (
  `id` tinyint(4) NOT NULL,
  `nombreCorto` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `pj` tinyint(3) unsigned zerofill DEFAULT '000',
  `puntos` tinyint(3) unsigned zerofill DEFAULT '000',
  `pg` tinyint(3) unsigned zerofill DEFAULT '000',
  `pe` tinyint(3) unsigned zerofill DEFAULT '000',
  `pp` tinyint(3) unsigned zerofill DEFAULT '000',
  `gf` tinyint(3) unsigned zerofill DEFAULT '000',
  `gc` tinyint(3) unsigned zerofill DEFAULT '000',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci COMMENT='Equipos primera 18-19';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (1,'ALV','DEPORTIVO ALAVES',000,000,000,000,000,000,000),(2,'ATH','ATHLETIC CLUB',000,000,000,000,000,000,000),(3,'ATL','ATLETICO MADRID',000,000,000,000,000,000,000),(4,'BCN','BARCELONA',000,000,000,000,000,000,000),(5,'CLV','CELTA DE VIGO',000,000,000,000,000,000,000),(6,'EIB','EIBAR',000,000,000,000,000,000,000),(7,'ESP','REAL CLUB DEPORTIVO ESPAÑOL',000,000,000,000,000,000,000),(8,'GET','GETAFE',000,000,000,000,000,000,000),(9,'GIR','GIRONA',000,000,000,000,000,000,000),(10,'HSC','HUESCA',000,000,000,000,000,000,000),(11,'LEG','LEGANES',000,000,000,000,000,000,000),(12,'LEV','LEVANTE',000,000,000,000,000,000,000),(13,'RAY','RAYO VALLECANO',000,000,000,000,000,000,000),(14,'BET','REAL BETIS',000,000,000,000,000,000,000),(15,'RMA','REAL MADRID',000,000,000,000,000,000,000),(16,'RSO','REAL SOCIEDAD',000,000,000,000,000,000,000),(17,'RVA','REAL VALLADOLID',000,000,000,000,000,000,000),(18,'SEV','SEVILLA',000,000,000,000,000,000,000),(19,'VAL','VALENCIA',000,000,000,000,000,000,000),(20,'VIL','VILLAREAL',000,000,000,000,000,000,000);
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jugadores` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `dorsal` tinyint(4) DEFAULT NULL,
  `idEquipo` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugadores`
--

LOCK TABLES `jugadores` WRITE;
/*!40000 ALTER TABLE `jugadores` DISABLE KEYS */;
INSERT INTO `jugadores` VALUES (1,'Fernando Pacheco',1,1),(2,'Antonio Sivera',13,1),(3,'Ã�lex DomÃ­nguez',31,1),(4,'Carlos Vigaray',2,1),(5,'RubÃ©n Duarte',3,1),(6,'Rodrigo Ely',4,1),(7,'VÃ­ctor Laguardia',5,1),(8,'Guillermo MaripÃ¡n',6,1),(9,'Ximo Navarro',29,1),(10,'AdriÃ¡n MarÃ­n',7,1),(11,'MartÃ­n Aguirregabiria',21,1),(12,'AdriÃ¡n DiÃ©guez',26,1),(13,'TomÃ¡s Pina',8,1),(14,'Ibai GÃ³mez',11,1),(15,'Burgui',14,1),(16,'Daniel Torres',16,1),(17,'Manu GarcÃ­a',19,1),(18,'Darko Brasanac',20,1),(19,'Mubarak Wakaso',22,1),(20,'Jony',23,1),(21,'Antonio Perera',27,1),(22,'RubÃ©n Sobrino',7,1),(23,'John Guidetti',10,1),(24,'Jonathan Calleri',12,1),(25,'Borja BastÃ³n',18,1),(26,'Patrick Twumasi',24,1),(27,'Andrei Lupu',34,1),(28,'Ã�lex Remiro',1,2),(29,'Iago HerrerÃ­n',13,2),(30,'Unai SimÃ³n',25,2),(31,'Hodei Oleaga',26,2),(32,'Cristian Ganea',2,2),(33,'Unai NÃºÅ„ez',3,2),(34,'Ã�Å„igo MartÃ­nez',4,2),(35,'Yeray Ã�lvarez',5,2),(36,'Yuri',12,2),(37,'Ã�Å„igo Lekue',15,2),(38,'Ã“scar De Marcos',18,2),(39,'Ander Cap',21,2),(40,'Mikel Balenziaga',24,2),(41,'Mikel San JosÃ©',6,2),(42,'BeÅ„at Etxebarria',7,2),(43,'Ander Iturraspe',8,2),(44,'IÅ„igo CÃ³rdoba',11,2),(45,'Markel Susaeta',14,2),(46,'Dani GarcÃ­a',16,2),(47,'Mikel Rico',17,2),(48,'RaÃºl GarcÃ­a',22,2),(49,'Unai LÃ³pez',23,2),(50,'Peru Nolaskoain',31,2),(51,'IÅ„aki Williams',9,2),(52,'Iker Muniain',10,2),(53,'Aritz Aduriz',20,2),(54,'Gorka Guruzeta',30,2),(55,'Antonio AdÃ¡n',1,3),(56,'1Jan Oblak',13,3),(57,'Alex Dos Santos',25,3),(58,'Diego GodÃ­n',2,3),(59,'Filipe LuÃ­s',3,3),(60,'Santiago Arias',4,3),(61,'Stefan Savic',15,3),(62,'Juanfran',20,3),(63,'Lucas HernÃ¡ndez',21,3),(64,'JosÃ© GimÃ©nez',24,3),(65,'AndrÃ©s Solano',33,3),(66,'Francisco Montero',35,3),(67,'Tachi',36,3),(68,'Carlos Isaac MuÅ„oz',38,3),(69,'Thomas Partey',5,3),(70,'Koke',6,3),(71,'SaÃºl ÅƒÃ­guez',8,3),(72,'Thomas Lemar',11,3),(73,'Rodrigo',14,3),(74,'Vitolo',23,3),(75,'Toni Moya',43,3),(76,'Antoine Griezmann',7,3),(77,'Nikola Kalinic',9,3),(78,'Ã�ngel Correa',10,3),(79,'Gelson Martins',18,3),(80,'Diego Costa',19,3),(81,'Borja GarcÃ©s',32,3),(82,'JoaquÃ­n MuÅ„oz',47,3),(83,'Marc-AndrÃ© ter Stegen',1,4),(84,'Jasper Cillessen',13,4),(85,'IÅ„aki PeÅ„a',30,4),(86,'Jokin Ezkieta',31,4),(87,'NÃ©lson Semedo',2,4),(88,'Gerard PiquÃ©',3,4),(89,'ClÃ©ment Lenglet',15,4),(90,'Jordi Alba',18,4),(91,'Sergi Roberto',20,4),(92,'Samuel Umtiti',23,4),(93,'Thomas Vermaelen',24,4),(94,'Juan Miranda',27,4),(95,'Jorge Cuenca',33,4),(96,'Chumi',36,4),(97,'Guillem Jaime',38,4),(98,'Ivan Rakiticx',4,4),(99,'Sergio Busquets',5,4),(100,'Denis SuÃ¡rez',6,4),(101,'Coutinho',7,4),(102,'Arthur',8,4),(103,'Rafinha',12,4),(104,'Sergi Samper',16,4),(105,'Carles AleÅ„Ã¡',21,4),(106,'Arturo Vidal',22,4),(107,'Riqui Puig',28,4),(108,'Ã�lex Collado',34,4),(109,'Oriol Busquets',35,4),(110,'Luis SuÃ¡rez',9,4),(111,'Lionel Messi',10,4),(112,'Ousmane DembÃ©lÃ©',11,4),(113,'Malcom',14,4),(114,'Munir El Haddadi',19,4),(115,'Sergio Ã�lvarez',1,5),(116,'RubÃ©n Blanco',13,5),(117,'IvÃ¡n Villar',26,5),(118,'Hugo Mallo',2,5),(119,'David Costas',3,5),(120,'NÃ©stor AraÃºjo',4,5),(121,'Robert MazÃ¡n',15,5),(122,'David JuncÅ•',17,5),(123,'Kevin VÃ¡zquez',20,5),(124,'Gustavo Cabral',22,5),(125,'Facundo Roncaglia',24,5),(126,'JÃºnior Alonso',25,5),(127,'Okay Yokuslu',5,5),(128,'Nemanja Radoja',6,5),(129,'Fran BeltrÃ¡n',8,5),(130,'Stanislav Lobotka',14,5),(131,'Andrew Hjulsager',16,5),(132,'Mathias Jensen',18,5),(133,'Sofiane Boufal',19,5),(134,'Jozabed SÃ¡nchez',21,5),(135,'Brais MÃ©ndez',23,5),(136,'Emre Mor',7,5),(137,'Maxi GÃ³mez',9,5),(138,'Iago Aspas',10,5),(139,'Pione Sisto',11,5),(140,'Dennis Eckert',32,5),(141,'Marko Dmitrovic',1,6),(142,'Asier Riesgo',13,6),(143,'Markel Areitio',35,6),(144,'Jordi Calavera',2,6),(145,'Pedro Bigas',3,6),(146,'IvÃ¡n Ramis',4,6),(147,'Paulo Oliveira',12,6),(148,'Cote',15,6),(149,'Marc Cucurella',20,6),(150,'Anaitz Arbilla',23,6),(151,'Gonzalo Escalante',5,6),(152,'Sergio Ã�lvarez',6,6),(153,'Pape Diop',8,6),(154,'RubÃ©n PeÅ„a',11,6),(155,'FabiÃ¡n Orellana',14,6),(156,'Pablo De Blasis',16,6),(157,'Pablo HervÃ­as',18,6),(158,'Pedro LeÃ³n',21,6),(159,'Joan JordÃ¡n',24,6),(160,'Marc Cardona',7,6),(161,'Sergi Enrich',9,6),(162,'Kike GarcÃ­a',17,6),(163,'Charles',19,6),(164,'Pere Milla',22,6),(165,'Roberto JimÃ©nez',1,7),(166,'Diego LÃ³pez',13,7),(167,'Pipa',2,7),(168,'Naldo',5,7),(169,'Ã“scar Duarte',6,7),(170,'Roberto Rosales',8,7),(171,'DÃ­dac VilÃ¡',12,7),(172,'David LÃ³pez',15,7),(173,'Javi LÃ³pez',16,7),(174,'Mario Hermoso',22,7),(175,'LluÃ­s LÃ³pez',27,7),(176,'AdriÅ• Pedrosa',28,7),(177,'VÃ­ctor SÃ¡nchez',4,7),(178,'Sergi Darder',10,7),(179,'Ã“scar Melendo',14,7),(180,'Ã�lex LÃ³pez',18,7),(181,'Pablo Piatti',19,7),(182,'Marc Roca',21,7),(183,'Esteban Granero',23,7),(184,'Borja Iglesias',7,7),(185,'Sergio GarcÃ­a',9,7),(186,'Leo Baptistao',11,7),(187,'HernÃ¡n PÃ©rez',17,7),(188,'Javi Puado',20,7),(189,'Carlos Doncel',29,7),(190,'Leandro Chichizola',1,8),(191,'David Soria',13,8),(192,'RubÃ©n YÃ¡Å„ez',25,8),(193,'DjenÃ© Dakonam',2,8),(194,'Vitorino Antunes',3,8),(195,'Bruno GonzÃ¡lez',4,8),(196,'Leandro Cabrera',6,8),(197,'Ignasi Miquel',21,8),(198,'DamiÃ¡n SuÃ¡rez',22,8),(199,'Dimitri Foulquier',24,8),(200,'Markel Bergara',5,8),(201,'Francisco Portillo',8,8),(202,'Gaku Shibasaki',10,8),(203,'SebastiÃ¡n CristÃ³foro',15,8),(204,'Robert IbÃ¡Å„ez',17,8),(205,'Mauro Arambarri',18,8),(206,'Nemanja Maksimovic',20,8),(207,'IvÃ¡n Alejo',23,8),(208,'Jaime Mata',7,8),(209,'Ã�ngel RodrÃ­guez',9,8),(210,'Amath Ndiaye',11,8),(211,'Sergi Guardiola',14,8),(212,'Jorge Molina',19,8),(213,'Hugo Duro',27,8),(214,'Gorka Iraizoz',1,9),(215,'Yassine Bounou',13,9),(216,'JosÃ© Aurelio SuÃ¡rez',30,9),(217,'Marc Vito',36,9),(218,'Bernardo Espinosa',2,9),(219,'Johan Mojica',3,9),(220,'JonÃ¡s Ramalho',4,9),(221,'Pedro AlcalÃ¡',5,9),(222,'Juanpe',15,9),(223,'Marc Muniesa',20,9),(224,'Carles Planas',21,9),(225,'ÄŒric Montes',28,9),(226,'Ã�lex Granell',6,9),(227,'Pere Pons',8,9),(228,'Portu',9,9),(229,'Borja GarcÃ­a',10,9),(230,'Aday BenÃ­tez',11,9),(231,'Douglas Luiz',12,9),(232,'Patrick Roberts',17,9),(233,'Aleix GarcÃ­a',23,9),(234,'Yhoan Andzouana',26,9),(235,'Kevin Soni',27,9),(236,'Pedro Porro',29,9),(237,'Paik Seung-Ho',32,9),(238,'Valery FernÃ¡ndez',34,9),(239,'Cristhian Stuani',7,9),(240,'Anthony Lozano',19,9),(241,'Seydou Doumbia',22,9),(242,'Axel Werner',1,10),(243,'Roberto SantamarÃ­a',13,10),(244,'Aleksandar Jovanovic',25,10),(245,'Xabier Etxeita',3,10),(246,'RÃºben Semedo',4,10),(247,'Jorge Pulido',14,10),(248,'Carlos Akapo',15,10),(249,'Luisinho',16,10),(250,'Pablo Ã�nsua',18,10),(251,'Rajko Brezancic',20,10),(252,'Jorge MiramÃ³n',24,10),(253,'Javier Almerge',27,10),(254,'Juan Aguilera',5,10),(255,'Moi GÃ³mez',6,10),(256,'David Ferreiro',7,10),(257,'Gonzalo Melero',8,10),(258,'Camacho',10,10),(259,'Christian Rivera',17,10),(260,'Serdar Gurler',21,10),(261,'Lluis Sastre',22,10),(262,'DamiÃ¡n Musto',23,10),(263,'JosÃ© Ignacio Uche',26,10),(264,'Juan Camilo HernÃ¡ndez',9,10),(265,'Ã�lex Gallar',11,10),(266,'Samuele Longo',12,10),(267,'Ezequiel Ã�vila',19,10),(268,'IvÃ¡n CuÃ©llar',1,11),(269,'Jon Serantes',13,11),(270,'Andriy Lunin',29,11),(271,'Juanfran',2,11),(272,'Unai Bustinza',3,11),(273,'Jonathan Silva',5,11),(274,'Allan Nyom',12,11),(275,'RaÃºl GarcÃ­a',14,11),(276,'Mauro Dos Santos',15,11),(277,'Ezequiel MuÅ„oz',19,11),(278,'Dimitrios Siovas',22,11),(279,'Kenneth Omeruo',24,11),(280,'Rodrigo TarÃ­n',28,11),(281,'Gerard Gumbau',6,11),(282,'Recio',8,11),(283,'Nabil El Zhar',10,11),(284,'Alexander Szymanowski',11,11),(285,'Javier Eraso',17,11),(286,'RubÃ©n PÃ©rez',21,11),(287,'Mikel Vesga',23,11),(288,'Ã“scar RodrÃ­guez',27,11),(289,'Diego Rolan',4,11),(290,'Daniel Ojeda',7,11),(291,'Guido Carrillo',9,11),(292,'JosÃ© ArnÃ¡iz',16,11),(293,'Sabin Merino',18,11),(294,'Michael Santos',20,11),(295,'Youssef En-Nesyrix',20,11),(296,'Javier AvilÃ©s',33,11),(297,'Koke',1,12),(298,'Oier OlazÃ¡bal',13,12),(299,'Aitor FernÃ¡ndez',25,12),(300,'ToÅ„o',3,12),(301,'Rober Pier',4,12),(302,'Chema RodrÃ­guez',6,12),(303,'Coke',12,12),(304,'Sergio Postigo',15,12),(305,'Erick Cabaco',18,12),(306,'Pedro LÃ³pez',19,12),(307,'Antonio Luna',22,12),(308,'GenÃ­s Montolio',26,12),(309,'Cheick DoukourÃ©',5,12),(310,'Sanjin Prcic',8,12),(311,'Enis Bardhi',10,12),(312,'JosÃ© Luis Morales',11,12),(313,'Samu GarcÃ­a',14,12),(314,'RubÃ©n Rochina',16,12),(315,'Nikola Vukcevic',17,12),(316,'JosÃ© CampaÅ„a',4,12),(317,'Fran Manzanara',27,12),(318,'Armando Sadiku',0,12),(319,'Borja Mayoral',2,12),(320,'Moses Simon',7,12),(321,'Roger MartÃ­',9,12),(322,'Raphael Dwamena',20,12),(323,'Emmanuel Boateng',21,12),(324,'Jason',23,12),(325,'Alberto GarcÃ­a',1,13),(326,'Stole Dimitrievski',13,13),(327,'Miguel Ã�ngel Morro',30,13),(328,'JosÃ© LeÃ³n',0,13),(329,'Tito',2,13),(330,'Chechu Dorado',5,13),(331,'Jordi Amat',16,13),(332,'Luis AdvÃ­ncula',17,13),(333,'Emiliano VelÃ¡zquez',20,13),(334,'Abdoulaye Ba',21,13),(335,'Alejandro GÃ¡lvez',23,13),(336,'Sergio Akieme',28,13),(337,'MartÃ­n Pascual',31,13),(338,'Luis Meseguer',33,13),(339,'Ã�lvaro MedrÃ¡n',4,13),(340,'Gorka Elustondo',6,13),(341,'Ã�lex Moreno',7,13),(342,'GaÃ«l Kakuta',10,13),(343,'Giannelli Imbula',12,13),(344,'Ã�lvaro GarcÃ­a',18,13),(345,'JosÃ© Pozo',22,13),(346,'Santiago ComesaÅ„a',27,13),(347,'Manuel Navarro',34,13),(348,'Ã�ngel Algobia',35,13),(349,'Ã“scar Trejo',8,13),(350,'RaÃºl de TomÃ¡s',9,13),(351,'AdriÃ¡n Embarba',11,13),(352,'BebÃ©',14,13),(353,'Ã�lex AlegrÃ­a',15,13),(354,'Lass',19,13),(355,'Javi Guerra',24,13),(356,'Sergio Moreno',29,13),(357,'Joel Robles',1,14),(358,'Pau LÃ³pez',13,14),(359,'Zouhair Feddal',4,14),(360,'Marc Bartra',5,14),(361,'Sidnei',12,14),(362,'Antonio BarragÃ¡n',19,14),(363,'JÃºnior Firpo',20,14),(364,'Aissa Mandi',23,14),(365,'Edgar GonzÃ¡lez',32,14),(366,'Francis',2,14),(367,'Javi GarcÃ­a',3,14),(368,'Sergio Canales',6,14),(369,'Takashi Inui',8,14),(370,'Ryad Boudebouz',10,14),(371,'William Carvalho',14,14),(372,'JoaquÃ­n',17,14),(373,'AndrÃ©s Guardado',18,14),(374,'Giovani Lo Celso',21,14),(375,'Wilfrid Kaptoum',34,14),(376,'Diego Altamirano',37,14),(377,'Sergio LeÃ³n',7,14),(378,'Antonio Sanabria',9,14),(379,'Cristian Tello',11,14),(380,'Loren MorÃ³n',16,14),(381,'Robert',33,14),(382,'Keylor Navas',1,15),(383,'Kiko Casilla',13,15),(384,'Thibaut Courtois',25,15),(385,'Daniel Carvajal',2,15),(386,'JesÃºs Vallejo',3,15),(387,'Sergio Ramos',4,15),(388,'Raphael Varane',5,15),(389,'Nacho',6,15),(390,'Marcelo',12,15),(391,'Ã�lvaro Odriozola',19,15),(392,'Sergio ReguilÃ³n',23,15),(393,'Adrian De la Fuente',26,15),(394,'Javi SÃ¡nchez',31,15),(395,'Francisco Garcia',37,15),(396,'Toni Kroos',8,15),(397,'Luka Modric',10,15),(398,'Casemiro',14,15),(399,'Federico Valverde',15,15),(400,'Lucas VÃ¡zquez',17,15),(401,'Marcos Llorente',18,15),(402,'Marco Asensio',20,15),(403,'Isco',22,15),(404,'Dani Ceballos',24,15),(405,'Franchu',34,15),(406,'Ã�lvaro Fidalgo',36,15),(407,'Mariano',7,15),(408,'Karim Benzema',9,15),(409,'Gareth Bale',11,15),(410,'Cristo GonzÃ¡lez',27,15),(411,'VinÃ­cius JÃºnior',28,15),(412,'GerÃ³nimo Rulli',1,16),(413,'Miguel Ã�ngel MoyÃ¡',13,16),(414,'Andoni Zubiaurre',30,16),(415,'Joseba Zaldua',2,16),(416,'Diego Llorente',3,16),(417,'HÃ©ctor Moreno',6,16),(418,'Aritz Elustondo',15,16),(419,'Andoni Gorosabel',18,16),(420,'Theo HernÃ¡ndez',19,16),(421,'KÃ©vin Rodrigues',20,16),(422,'RaÃºl Navas',22,16),(423,'Robin Le Normand',27,16),(424,'Aihen MuÅ„oz',29,16),(425,'Jon Guridi',0,16),(426,'David Concha',0,16),(427,'Asier Illarramendi',4,16),(428,'Igor Zubeldia',5,16),(429,'Mikel Merino',8,16),(430,'Adnan Januzaj',11,16),(431,'RubÃ©n Pardo',14,16),(432,'David Zurutuza',17,16),(433,'Luca Sangalli',23,16),(434,'Ander Guevara',26,16),(435,'NÃ¤is Djouahra',31,16),(436,'Juanmi',7,16),(437,'Mikel Oyarzabal',10,16),(438,'Willian JosÃ©',12,16),(439,'MartÃ­n Merquelanz',16,16),(440,'Jon Bautista',21,16),(441,'Sandro RamÃ­rez',24,16),(442,'Roberto LÃ³pez',28,16),(443,'Jordi Masip',1,17),(444,'Yoel RodrÃ­guez',13,17),(445,'Samuel PÃ©rez',26,17),(446,'MoisÃ©s Delgado',3,17),(447,'Kiko Olivas',4,17),(448,'Fernando Calero',5,17),(449,'Alberto GuitiÃ¡n',15,17),(450,'Javi Moyano',17,17),(451,'AntoÅ„ito',18,17),(452,'Nacho',22,17),(453,'Mohammed Salisu',18,17),(454,'Roberto Corral',34,17),(455,'Javier Aparicio',38,17),(456,'JoaquÃ­n FernÃ¡ndez',2,17),(457,'Luismi',6,17),(458,'Borja FernÃ¡ndez',8,17),(459,'RubÃ©n Alcaraz',14,17),(460,'Antonio CotÃ¡n',16,17),(461,'Toni Villa',19,17),(462,'MÃ­chel',21,17),(463,'Anuar Mohamed',23,17),(464,'Keko',24,17),(465,'Pablo MuÅ„oz',31,17),(466,'Leo SuÃ¡rez',32,17),(467,'Ivi',7,17),(468,'Enes Ãœnal',9,17),(469,'Ã“scar Plano',10,17),(470,'Daniele Verde',11,17),(471,'Duje Cop',20,17),(472,'Miguel De la Fuente',27,17),(473,'Kuki Zalazar',39,17),(474,'TomÃ¡s Vaclik',1,18),(475,'Juan Soriano',13,18),(476,'Lucho',38,18),(477,'Sergi GÃ³mez',3,18),(478,'Simon Kjaer',4,18),(479,'Daniel CarriÃ§o',6,18),(480,'Aleix Vidal',11,18),(481,'Sergio Escudero',18,18),(482,'Guilherme Arana',23,18),(483,'Joris Gnagnon',24,18),(484,'Gabriel Mercado',25,18),(485,'Juan Berrocal',37,18),(486,'Javier VÃ¡zquez',40,18),(487,'Ibrahim Amadou',5,18),(488,'Roque Mesa',7,18),(489,'Ã‰ver Banega',10,18),(490,'Maxime Gonalons',15,18),(491,'JesÃºs Navas',16,18),(492,'Pablo Sarabia',17,18),(493,'Borja Lasso',20,18),(494,'Franco VÃ¡zquez',22,18),(495,'JosÃ© Mena',29,18),(496,'Nolito',8,18),(497,'Wissam Ben Yedder',9,18),(498,'AndrÃ© Silva',12,18),(499,'Luis Muriel',14,18),(500,'Quincy Promes',21,18),(501,'Jaume DomÃ©nech',1,19),(502,'Neto',13,19),(503,'RÃºben Vezo',3,19),(504,'Jeison Murillo',4,19),(505,'Gabriel',5,19),(506,'Mouctar Diakhaby',12,19),(507,'JosÃ© GayÃ¡',14,19),(508,'Toni Lato',15,19),(509,'Cristiano Piccini',21,19),(510,'Ezequiel Garay',24,19),(511,'Hugo GuillamÃ³n',36,19),(512,'Geoffrey Kondogbia',6,19),(513,'GonÃ§alo Guedes',7,19),(514,'Carlos Soler',8,19),(515,'Daniel Parejo',10,19),(516,'Denis Cheryshev',11,19),(517,'Francis Coquelin',17,19),(518,'Daniel Wass',18,19),(519,'FerrÃ¡n Torres',20,19),(520,'Uros Racic',26,19),(521,'Lee Kang-In',34,19),(522,'Kevin Gameiro',9,19),(523,'Rodrigo Moreno',19,19),(524,'Santi Mina',22,19),(525,'Michy Batshuayi',23,19),(526,'Ã�lex Blanco',30,19),(527,'Serio Asenjo',1,20),(528,'AndrÃ©s FernÃ¡ndez',13,20),(529,'Mariano Barbosa',25,20),(530,'Mario Gaspar',2,20),(531,'Ã�lvaro GonzÃ¡lez',3,20),(532,'Ramiro Funes Mori',4,20),(533,'VÃ­ctor Ruiz',6,20),(534,'Jaume Costa',11,20),(535,'MiguelÃ³n',15,20),(536,'Daniele Bonera',23,20),(537,'Miguel LayÃºn',24,20),(538,'Xavier QuintillÃ¡',39,20),(539,'Santiago CÃ¡seres',5,20),(540,'Pablo Fornals',8,20),(541,'Manu Trigueros',14,20),(542,'Alfonso Pedraza',16,20),(543,'Javi Fuego',1,20),(544,'Santi Cazorla',19,20),(545,'Manuel Iturra',20,20),(546,'Bruno Soriano',21,20),(547,'Manuel Morlanes',28,20),(548,'Samuel Chukwueze',30,20),(549,'Gerard Moreno',7,20),(550,'Carlos Bacca',9,20),(551,'Nicola Sansone',10,20),(552,'Karl Toko Ekambi',17,20),(553,'Raba',22,20);
/*!40000 ALTER TABLE `jugadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` tinyint(4) NOT NULL,
  `usuario` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  `clave` varchar(45) COLLATE utf8mb4_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'usr1','rincon1'),(2,'usr2','rincon2'),(3,'usr3','rincon3');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-16  8:14:09
