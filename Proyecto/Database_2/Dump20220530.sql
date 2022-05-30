CREATE DATABASE  IF NOT EXISTS `EntidadFinanciera` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `EntidadFinanciera`;
-- MariaDB dump 10.19  Distrib 10.7.3-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: EntidadFinanciera
-- ------------------------------------------------------
-- Server version	10.7.3-MariaDB

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
-- Table structure for table `ADMINISTRADOR`
--

DROP TABLE IF EXISTS `ADMINISTRADOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ADMINISTRADOR` (
  `Cedula` int(11) NOT NULL,
  `Nombre` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apellido` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Direccion` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` mediumtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `Correo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Contrasena` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `IdAdmin` int(11) NOT NULL,
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ADMINISTRADOR`
--

LOCK TABLES `ADMINISTRADOR` WRITE;
/*!40000 ALTER TABLE `ADMINISTRADOR` DISABLE KEYS */;
/*!40000 ALTER TABLE `ADMINISTRADOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CAJERO`
--

DROP TABLE IF EXISTS `CAJERO`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CAJERO` (
  `Cedula` int(11) NOT NULL,
  `Nombre` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apellido` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Direccion` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` mediumtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `Correo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Contrasena` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `IdCajero` int(11) NOT NULL,
  `Sueldo` double NOT NULL,
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CAJERO`
--

LOCK TABLES `CAJERO` WRITE;
/*!40000 ALTER TABLE `CAJERO` DISABLE KEYS */;
/*!40000 ALTER TABLE `CAJERO` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CLIENTE`
--

DROP TABLE IF EXISTS `CLIENTE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CLIENTE` (
  `Cedula` int(11) NOT NULL,
  `Nombre` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apellido` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Direccion` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Telefono` mediumtext COLLATE utf8mb4_unicode_ci NOT NULL,
  `Correo` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Contrasena` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CLIENTE`
--

LOCK TABLES `CLIENTE` WRITE;
/*!40000 ALTER TABLE `CLIENTE` DISABLE KEYS */;
/*!40000 ALTER TABLE `CLIENTE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUENTA_AHORROS`
--

DROP TABLE IF EXISTS `CUENTA_AHORROS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUENTA_AHORROS` (
  `IdCuenta` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Saldo` float NOT NULL,
  `IdCliente` int(11) NOT NULL,
  PRIMARY KEY (`IdCuenta`),
  KEY `IdCliente` (`IdCliente`),
  CONSTRAINT `CUENTA_AHORROS_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `CLIENTE` (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUENTA_AHORROS`
--

LOCK TABLES `CUENTA_AHORROS` WRITE;
/*!40000 ALTER TABLE `CUENTA_AHORROS` DISABLE KEYS */;
/*!40000 ALTER TABLE `CUENTA_AHORROS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CUENTA_CORRIENTE`
--

DROP TABLE IF EXISTS `CUENTA_CORRIENTE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CUENTA_CORRIENTE` (
  `IdCuenta` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Saldo` float NOT NULL,
  `IdCliente` int(11) NOT NULL,
  PRIMARY KEY (`IdCuenta`),
  KEY `IdCliente` (`IdCliente`),
  CONSTRAINT `CUENTA_CORRIENTE_ibfk_1` FOREIGN KEY (`IdCliente`) REFERENCES `CLIENTE` (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CUENTA_CORRIENTE`
--

LOCK TABLES `CUENTA_CORRIENTE` WRITE;
/*!40000 ALTER TABLE `CUENTA_CORRIENTE` DISABLE KEYS */;
/*!40000 ALTER TABLE `CUENTA_CORRIENTE` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-30  0:28:17
