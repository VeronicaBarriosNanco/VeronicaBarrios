-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-07-2016 a las 05:06:18
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `mensajespull`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensaje`
--

CREATE TABLE IF NOT EXISTS `mensaje` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mensajes` varchar(100) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `usuario` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Volcar la base de datos para la tabla `mensaje`
--

INSERT INTO `mensaje` (`id`, `mensajes`, `fecha`, `usuario`) VALUES
(9, 'Hola', '2016-03-04 17:42:06', 'Miguel'),
(10, 'como as estado', '2016-03-04 17:45:33', 'Fernando'),
(11, 'que haces', '2016-03-04 17:46:51', 'Fernando'),
(12, 'nada y tu', '2016-03-04 17:47:11', 'Miguel'),
(13, 'nada', '2016-03-04 17:47:39', 'Fernando'),
(14, 'que onda', '2016-03-04 17:48:12', 'Mario'),
(15, 'hola', '2016-03-04 20:50:32', 'Erick'),
(16, 'que haces', '2016-03-04 20:50:56', 'Miguel'),
(17, 'Hola como estas', '2016-03-09 19:42:00', 'Luis'),
(18, 'Como estas', '2016-03-09 19:53:39', 'Luis'),
(19, 'que tal como andas', '2016-03-09 19:54:01', 'miguel'),
(20, 'Como estas', '2016-03-09 19:55:01', 'Luis'),
(21, 'Bien y tu como estas', '2016-03-09 19:55:22', 'Miguel'),
(24, 'neta no te lo creo :)', '2016-07-02 12:56:16', 'Miguel'),
(25, 'hola', '2016-07-06 13:26:32', 'vero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Volcar la base de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `correo`) VALUES
(3, 'Miguel', '12345'),
(4, 'Fernando', '12345'),
(5, 'Mario', '12345'),
(6, 'Eduardo', '12345'),
(7, 'Erick', '12345'),
(8, 'luis', '12345'),
(9, 'Veronica', '12345'),
(10, 'vero', '123');
