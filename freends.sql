-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-05-2016 a las 09:25:03
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `freends`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `amigos`
--

CREATE TABLE `amigos` (
  `id_usuario` smallint(6) NOT NULL,
  `id_amigo` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `amigos`
--

INSERT INTO `amigos` (`id_usuario`, `id_amigo`) VALUES
(2, 4),
(4, 2),
(8, 9),
(9, 8),
(7, 6),
(6, 7),
(5, 1),
(1, 5),
(9, 10),
(10, 9),
(4, 7),
(7, 4),
(6, 3),
(3, 6),
(1, 2),
(2, 1),
(1, 9),
(9, 1),
(7, 3),
(3, 7),
(4, 10),
(10, 4),
(6, 5),
(5, 6),
(3, 8),
(8, 3),
(7, 10),
(10, 7),
(7, 2),
(5, 7),
(7, 5),
(9, 4),
(4, 9),
(8, 2),
(2, 8),
(1, 7),
(7, 1),
(2, 8),
(2, 3),
(2, 10),
(2, 9),
(2, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` smallint(5) UNSIGNED NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `foto` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `foto`) VALUES
(1, 'Angel', 'http://pickaface.net/avatar/matrod09571eca35ab4f6.png'),
(2, 'Jesus', 'http://pickaface.net/avatar/megasore571df155111f6.png'),
(3, 'Angelica', 'http://pickaface.net/avatar/jovanaperovic.j5719541414d7a.png'),
(4, 'Juan', 'http://pickaface.net/avatar/Jivex571d212955b00.png'),
(5, 'Eva', 'http://pickaface.net/avatar/yrrr19825718fb5fb41f7.png'),
(6, 'Consuelo', 'http://pickaface.net/avatar/ph4ntorn57154330dfe1d.png'),
(7, 'Rodrigo', 'http://pickaface.net/avatar/nemanjavg1557190c9ac84af.png'),
(8, 'Andrea', 'http://pickaface.net/avatar/Scintilate5719c44e563a2.png'),
(9, 'Julian', 'http://pickaface.net/avatar/Mimiche571b44eecedc9.png'),
(10, 'Danae', 'http://pickaface.net/avatar/joyce.s.tong571ad50a3cd4a.png');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
