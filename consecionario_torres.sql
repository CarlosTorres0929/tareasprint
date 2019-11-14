-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-11-2019 a las 02:12:02
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `consecionario_torres`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(225) NOT NULL,
  `tipo_licencia` varchar(225) NOT NULL,
  `placa_vehiculo` int(11) NOT NULL,
  `id_tipo_conductor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `id` int(11) NOT NULL,
  `placa_vehiculo` int(11) NOT NULL,
  `id_conductor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `id` int(11) NOT NULL,
  `estacion` varchar(225) NOT NULL,
  `placa_vehiculo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipovehi`
--

CREATE TABLE `tipovehi` (
  `idTv` int(11) NOT NULL,
  `nomTv` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipovehi`
--

INSERT INTO `tipovehi` (`idTv`, `nomTv`) VALUES
(1, 'mazda'),
(3, 'renault'),
(123, 'trreno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_conductor`
--

CREATE TABLE `tipo_conductor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `placa` varchar(6) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `referenciaVehi` varchar(30) NOT NULL,
  `modelo` int(11) DEFAULT NULL,
  `idtipoV` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `placa_vehiculo` (`placa_vehiculo`),
  ADD UNIQUE KEY `tipo_conductor` (`id_tipo_conductor`) USING BTREE;

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `placa_vehiculo` (`placa_vehiculo`),
  ADD UNIQUE KEY `id_conductor` (`id_conductor`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `placa_vehiculo` (`placa_vehiculo`);

--
-- Indices de la tabla `tipovehi`
--
ALTER TABLE `tipovehi`
  ADD PRIMARY KEY (`idTv`),
  ADD UNIQUE KEY `nomTv` (`nomTv`);

--
-- Indices de la tabla `tipo_conductor`
--
ALTER TABLE `tipo_conductor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`placa`),
  ADD KEY `idtipoV` (`idtipoV`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`idtipoV`) REFERENCES `tipovehi` (`idTv`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
