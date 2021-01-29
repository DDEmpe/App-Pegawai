-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 29, 2021 at 10:30 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pegawai`
--

-- --------------------------------------------------------

--
-- Table structure for table `bahan`
--

CREATE TABLE `bahan` (
  `id` int(11) NOT NULL,
  `bahan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bahan`
--

INSERT INTO `bahan` (`id`, `bahan`) VALUES
(1, 'Kayu'),
(2, 'Aluminium'),
(3, 'Plastik'),
(4, 'Rotan');

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `id` int(11) NOT NULL,
  `nik` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `umur` int(3) NOT NULL,
  `kelamin` varchar(20) NOT NULL,
  `lahir` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no` varchar(20) NOT NULL,
  `jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`id`, `nik`, `nama`, `umur`, `kelamin`, `lahir`, `alamat`, `no`, `jabatan`) VALUES
(1, '52018010', 'Derick', 30, 'Laki - Laki', '1-1-2000', 'Irian', '08976543212', 'Admin'),
(2, '52018000', 'Siapa', 19, 'Perempuan', '2-2-2000', 'Irian', '089123456789', 'Kantor');

-- --------------------------------------------------------

--
-- Table structure for table `detail_jual`
--

CREATE TABLE `detail_jual` (
  `id` int(11) NOT NULL,
  `kode` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` double NOT NULL,
  `tgljual` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_jual`
--

INSERT INTO `detail_jual` (`id`, `kode`, `jumlah`, `total`, `tgljual`) VALUES
(1, 'JU-001', 3, 1100000, '2021-01-29'),
(2, 'JU-002', 3, 1100000, '2021-01-29');

-- --------------------------------------------------------

--
-- Table structure for table `furnitur`
--

CREATE TABLE `furnitur` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `bahan` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `furnitur`
--

INSERT INTO `furnitur` (`id`, `nama`, `jenis`, `bahan`, `jumlah`, `harga`) VALUES
(1, 'Kursi Santai', 'Kursi', 'Rotan', 42, 300000),
(2, 'Meja Makan', 'Meja', 'Kayu', 18, 500000);

-- --------------------------------------------------------

--
-- Table structure for table `jenis`
--

CREATE TABLE `jenis` (
  `id` int(11) NOT NULL,
  `jenis` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jenis`
--

INSERT INTO `jenis` (`id`, `jenis`) VALUES
(1, 'Kursi'),
(2, 'Rak'),
(3, 'Lemari'),
(4, 'Meja');

-- --------------------------------------------------------

--
-- Table structure for table `jual`
--

CREATE TABLE `jual` (
  `id` int(11) NOT NULL,
  `kode` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL,
  `total` double NOT NULL,
  `tgljual` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jual`
--

INSERT INTO `jual` (`id`, `kode`, `nama`, `jumlah`, `harga`, `total`, `tgljual`) VALUES
(1, 'JU-001', 'Meja Makan', 1, 500000, 500000, '2021-01-29'),
(2, 'JU-001', 'Kursi Santai', 2, 300000, 600000, '2021-01-29'),
(3, 'JU-002', 'Meja Makan', 1, 500000, 500000, '2021-01-29'),
(4, 'JU-002', 'Kursi Santai', 2, 300000, 600000, '2021-01-29');

-- --------------------------------------------------------

--
-- Table structure for table `temp_jual`
--

CREATE TABLE `temp_jual` (
  `id` int(11) NOT NULL,
  `kode` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis` varchar(30) NOT NULL,
  `bahan` varchar(30) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nik` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `nik`, `username`, `pass`) VALUES
(1, '52018010', 'admin', '21232f297a57a5a743894a0e4a801fc3'),
(2, '52018000', 'aku', '89ccfac87d8d06db06bf3211cb2d69ed');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nik` (`nik`);

--
-- Indexes for table `detail_jual`
--
ALTER TABLE `detail_jual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `furnitur`
--
ALTER TABLE `furnitur`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jenis`
--
ALTER TABLE `jenis`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `temp_jual`
--
ALTER TABLE `temp_jual`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
