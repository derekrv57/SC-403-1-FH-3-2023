-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 26, 2023 at 11:56 PM
-- Server version: 8.0.35-0ubuntu0.22.04.1
-- PHP Version: 8.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ProyectoPrograDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `canción`
--

CREATE TABLE `canción` (
  `IDCanción` int NOT NULL,
  `Nombre` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Dir` varchar(255) NOT NULL,
  `IDÁlbum` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `canción`
--

INSERT INTO `canción` (`IDCanción`, `Nombre`, `Dir`, `IDÁlbum`) VALUES
(1, 'Preludio Conmemorativo', '01 - Preludio Conmemorativo.wav', 1),
(2, 'Canción a Dios', '02 - Canción a Dios.wav', 1),
(3, 'Motivo de mi canción', '03 - Motivo de mi canción.wav', 1),
(4, 'Es por ti', '04 - Es por ti.wav', 1),
(5, 'Te amo', '05 - Te amo.wav', 1),
(6, 'Cuán bello es el Señor', '06 - Cuán bello es el Señor.wav', 1),
(7, 'Has cambiado mi lamento', '07 - Has cambiado mi lamento.wav', 1),
(8, 'Un adorador', '08 - Un adorador.wav', 1),
(9, 'Será llena la tierra', '09 - Será llena la tierra.wav', 1),
(10, 'Dios ha sido fiel', '10 - Dios ha sido fiel.wav', 1),
(11, 'Tu fidelidad', '11 - Tu fidelidad.wav', 1),
(12, 'Fiel', '12 - Fiel.wav', 1),
(13, 'Dios ha sido fiel (reprise)', '13 - Dios ha sido fiel (reprise).wav', 1),
(14, 'Se oye en la naciones', '14 - Se oye en la naciones.wav', 1),
(15, 'Levántate', '15 - Levántate.wav', 1),
(16, 'Poderoso', '16 - Poderoso.wav', 1),
(17, 'Aleluya a nuestro Dios', '17 - Aleluya a nuestro Dios.wav', 1),
(18, 'Cristo es mi Señor', '18 - Cristo es mi Señor.wav', 1),
(19, 'Tú harás', '19 - Tú harás.wav', 1),
(20, 'En los montes, en los valles', '20 - En los montes, en los valles.wav', 1),
(21, 'Renuévame', '21 - Renuévame.wav', 1),
(22, 'Tu amor por mí', '22 - Tu amor por mí.wav', 1),
(23, 'Yo te busco', '23 - Yo te busco.wav', 1),
(24, 'Temprano yo te buscaré', '24 - Temprano yo te buscaré.wav', 1),
(25, 'Tu mirada', '25 - Tu mirada.wav', 1),
(26, 'Hermoso eres', '26 - Hermoso eres.wav', 1),
(27, 'Exáltate', '27 - Exáltate.wav', 1),
(28, 'Mas el Dios de toda gracia', '28 - Mas el Dios de toda gracia.wav', 1),
(29, 'Dios de pactos', '29 - Dios de pactos.wav', 1),
(30, 'Gracias', '30 - Gracias.wav', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Álbum`
--

CREATE TABLE `Álbum` (
  `IDÁlbum` int NOT NULL,
  `Título` varchar(255) NOT NULL,
  `AñoLanzamiento` int DEFAULT NULL,
  `IDUsuario` int DEFAULT NULL,
  `Pública` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `Álbum`
--

INSERT INTO `Álbum` (`IDÁlbum`, `Título`, `AñoLanzamiento`, `IDUsuario`, `Pública`) VALUES
(1, '25 conmemorativo', NULL, NULL, 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
